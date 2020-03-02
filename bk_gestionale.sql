-- MariaDB dump 10.17  Distrib 10.4.11-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: gestionale
-- ------------------------------------------------------
-- Server version	10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articolo`
--

DROP TABLE IF EXISTS `articolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `articolo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(100) DEFAULT NULL,
  `prezzo` decimal(6,2) DEFAULT NULL,
  `categoria` enum('software','hardware') DEFAULT NULL,
  `rimanenza` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articolo`
--

LOCK TABLES `articolo` WRITE;
/*!40000 ALTER TABLE `articolo` DISABLE KEYS */;
INSERT INTO `articolo` VALUES (1,'monitor',350.00,'hardware',87),(2,'chiavetta',38.50,'hardware',84),(3,'hard-disk',300.00,'hardware',94),(4,'smartwatch',400.00,'hardware',96),(5,'Photoshop',700.00,'software',98),(6,'Office',350.50,'software',95),(7,'Webcam',68.00,'hardware',94),(8,'Adobe CC',1200.00,'software',100),(9,'Office',120.00,'software',100);
/*!40000 ALTER TABLE `articolo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cognome` varchar(50) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `indirizzo` varchar(100) DEFAULT NULL,
  `citta` varchar(50) DEFAULT NULL,
  `regione` varchar(30) DEFAULT NULL,
  `credito` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'rossi','paolo','0116702323','paolo25@gmail.com','Via Roma 25','torino','Piemonte',107),(2,'mori','marco','0116704040','marco18@gmail.com','Via Torino 18','milano','Lombardia',NULL),(3,'bianchi','luca','0116701010','luca2@gmail.com','Via Milano 2','bologna','Emilia-Romagna',2119),(4,'verdi','mario','0116702020','mario128@gmail.com','Corso Francia 128','torino','Piemonte',NULL),(5,'rosso','alberto','0116707070','alberto12@icloud.com','Corso Svizzera 12','milano','Lombardia',789),(6,'esposito','franco','0119978812','francoe@icloud.com','Via Roma 3','Asti','Piemonte',1875),(7,'bruni','carlo','0117778816','brunicarlo@icloud.com','Corso Stati Uniti 13','Torino','Piemonte',NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `impiegato`
--

DROP TABLE IF EXISTS `impiegato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `impiegato` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `ruolo` varchar(20) DEFAULT NULL,
  `rif_to` int(11) DEFAULT NULL,
  `stipendio` decimal(6,2) DEFAULT NULL,
  `ufficio_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_impiegato_ufficio` (`ufficio_id`),
  CONSTRAINT `fk_impiegato_ufficio` FOREIGN KEY (`ufficio_id`) REFERENCES `ufficio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `impiegato`
--

LOCK TABLES `impiegato` WRITE;
/*!40000 ALTER TABLE `impiegato` DISABLE KEYS */;
INSERT INTO `impiegato` VALUES (1,'Mario','Rossi','tecnico',NULL,2500.00,1),(2,'Marco','Bianchi','amministrativo',7,1600.00,2),(3,'Paolo','Verdi','amministrativo',7,1600.00,2),(4,'Enrico','Marrone','venditore',8,1300.00,3),(5,'Nicola','Testa','venditore',8,1300.00,3),(6,'Franco','Barba','tecnico',1,1500.00,1),(7,'Elena','Totti','amministrativo',NULL,2600.00,2),(8,'Paola','Capra','venditore',NULL,2300.00,3),(9,'Mauro','Barba','venditore',8,1300.00,3);
/*!40000 ALTER TABLE `impiegato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordine`
--

DROP TABLE IF EXISTS `ordine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_id` int(11) DEFAULT NULL,
  `impiegato_id` int(11) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `stato` enum('da spedire','spedito','consegnato') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ordine_cliente` (`cliente_id`),
  KEY `fk_ordine_impiegato` (`impiegato_id`),
  CONSTRAINT `fk_ordine_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ordine_impiegato` FOREIGN KEY (`impiegato_id`) REFERENCES `impiegato` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordine`
--

LOCK TABLES `ordine` WRITE;
/*!40000 ALTER TABLE `ordine` DISABLE KEYS */;
INSERT INTO `ordine` VALUES (1,1,4,'2017-12-01','consegnato'),(2,3,4,'2018-01-11','consegnato'),(3,5,8,'2018-01-21','da spedire'),(4,3,4,'2018-01-23','spedito'),(5,6,4,'2018-02-03','consegnato'),(7,6,8,'2018-02-13','da spedire'),(12,3,4,'2018-02-28','spedito');
/*!40000 ALTER TABLE `ordine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordine_dettaglio`
--

DROP TABLE IF EXISTS `ordine_dettaglio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordine_dettaglio` (
  `ordine_id` int(11) DEFAULT NULL,
  `articolo_id` int(11) DEFAULT NULL,
  `quantita` tinyint(4) DEFAULT NULL,
  KEY `fk_od_articolo` (`articolo_id`),
  KEY `fk_od_ordine` (`ordine_id`),
  CONSTRAINT `fk_od_articolo` FOREIGN KEY (`articolo_id`) REFERENCES `articolo` (`id`),
  CONSTRAINT `fk_od_ordine` FOREIGN KEY (`ordine_id`) REFERENCES `ordine` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordine_dettaglio`
--

LOCK TABLES `ordine_dettaglio` WRITE;
/*!40000 ALTER TABLE `ordine_dettaglio` DISABLE KEYS */;
INSERT INTO `ordine_dettaglio` VALUES (1,2,1),(1,7,3),(2,5,1),(2,6,5),(3,2,10),(3,4,1),(4,1,3),(4,3,2),(4,7,1),(5,3,2),(5,7,1),(5,4,3),(5,5,1),(7,2,5),(7,3,2),(7,7,1),(12,1,10);
/*!40000 ALTER TABLE `ordine_dettaglio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ufficio`
--

DROP TABLE IF EXISTS `ufficio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ufficio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `luogo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ufficio`
--

LOCK TABLES `ufficio` WRITE;
/*!40000 ALTER TABLE `ufficio` DISABLE KEYS */;
INSERT INTO `ufficio` VALUES (1,'IT',20),(2,'Amministrazione',12),(3,'Commerciale',12),(4,'Logistica',20);
/*!40000 ALTER TABLE `ufficio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-11 13:23:27
