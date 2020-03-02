-- MariaDB dump 10.17  Distrib 10.4.11-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: tss_2020
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
-- Current Database: `tss_2020`
--

CREATE DATABASE IF NOT EXISTS `tss_2020` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tss_2020`;

--
-- Table structure for table `amico`
--

DROP TABLE IF EXISTS `amico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amico` (
  `amico_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`amico_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amico`
--

LOCK TABLES `amico` WRITE;
/*!40000 ALTER TABLE `amico` DISABLE KEYS */;
INSERT INTO `amico` VALUES (1,'franco','rossi'),(2,'mario','verdi'),(3,'paolo','bianchi'),(4,'sara','rossi'),(5,'elisa','verdi'),(6,'marco','bianchi'),(7,'franca','verdi'),(8,'mauro','bruni'),(9,'osvaldo','rossi'),(10,'oscar','verdi'),(11,'paola','bianchi'),(12,'franca','verdi'),(13,'eleonora','verdi'),(14,'enrico','macello'),(15,'fabio','baggio'),(16,'francesco','gamba'),(17,'marco','demarchi'),(18,'franca','verdone'),(19,'oscar','rossano'),(20,'marco','allegri'),(21,'marco','pino');
/*!40000 ALTER TABLE `amico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autore`
--

DROP TABLE IF EXISTS `autore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autore` (
  `autore_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`autore_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autore`
--

LOCK TABLES `autore` WRITE;
/*!40000 ALTER TABLE `autore` DISABLE KEYS */;
INSERT INTO `autore` VALUES (1,'John Ronald Reuel','Tolkien'),(2,'Dan','Brown'),(3,'Paulo','Coelho'),(4,'J. D.','Salinger'),(5,'Agatha','Christie'),(6,'J. K.','Rowling'),(7,'Tsao','Chan'),(8,'E. L.','James'),(9,'Antoine','de Saint-Exup?ry'),(10,'Charles','Dickens'),(11,'Miguel','de Cervantes'),(12,'Clive Staples','Lewis'),(13,'Tse-tung','Mao'),(14,'','Zerocalcare'),(15,'Andrea','Camilleri'),(16,'Ken','Follett'),(17,'Kazuo','Ishiguro'),(18,'Carlo','Fruttero'),(19,'Franco','Lucentini'),(20,'Italo','Calvino'),(21,'Stephen','King'),(22,'Isabel','Allende');
/*!40000 ALTER TABLE `autore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editore`
--

DROP TABLE IF EXISTS `editore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `editore` (
  `editore_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`editore_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editore`
--

LOCK TABLES `editore` WRITE;
/*!40000 ALTER TABLE `editore` DISABLE KEYS */;
INSERT INTO `editore` VALUES (2,'Mondadori'),(3,'Einaudi'),(4,'Salani'),(5,'Edizioni Clandestine'),(6,'Bao Publishing'),(7,'Sellerio'),(8,'BUR'),(9,'Sperling & Kupfer'),(10,'Bompiani'),(11,'Adelphi');
/*!40000 ALTER TABLE `editore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genitori`
--

DROP TABLE IF EXISTS `genitori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genitori` (
  `amico_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`amico_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genitori`
--

LOCK TABLES `genitori` WRITE;
/*!40000 ALTER TABLE `genitori` DISABLE KEYS */;
/*!40000 ALTER TABLE `genitori` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libro` (
  `libro_id` int(11) NOT NULL AUTO_INCREMENT,
  `titolo` varchar(255) DEFAULT NULL,
  `prezzo` decimal(6,2) DEFAULT NULL,
  `p_iva` decimal(6,2) DEFAULT NULL,
  `editore_id` int(11) DEFAULT NULL,
  `pagine` int(5) DEFAULT NULL,
  PRIMARY KEY (`libro_id`),
  KEY `fk_libro_editore` (`editore_id`),
  CONSTRAINT `fk_libro_editore` FOREIGN KEY (`editore_id`) REFERENCES `editore` (`editore_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'Alchimista (L\')',12.00,14.64,10,184),(2,'Cinquanta sfumature di grigio',10.20,12.44,2,560),(3,'Dieci piccoli indiani',10.20,12.44,2,208),(4,'Don Chisciotte della Mancha',20.40,24.89,3,NULL),(5,'Harry Potter e la Pietra Filosofale',8.50,10.37,4,302),(6,'Il Codice da Vinci',11.00,13.42,2,512),(7,'Il giovane Holden',10.20,12.44,3,251),(8,'Il leone, la strega e l\'armadio',7.65,9.33,2,182),(9,'Il libretto rosso',7.22,8.81,5,160),(10,'Il Piccolo Principe',4.25,5.19,2,95),(11,'Il Signore degli Anelli: La compagnia dell\'anello. Le due torri. Il ritorno del re',25.00,30.50,10,1255),(12,'Il sogno della camera rossa. Romanzo cinese del XVIII secolo',15.30,18.67,3,721),(13,'La colonna di fuoco',27.00,32.94,2,912),(14,'La donna della domenica',12.00,14.64,2,434),(15,'Lo Hobbit',9.35,11.41,10,417),(16,'Macerie prime',14.45,17.63,6,192),(17,'Origin',21.25,25.93,2,564),(18,'Quel che resta del giorno',12.00,14.64,3,276),(19,'Un mese con Montalbano',12.75,15.56,7,512),(20,'Una storia tra due citta\'',9.77,11.92,10,600),(21,'Marcovaldo',10.00,12.20,7,120),(22,'IT',25.00,30.50,9,550),(23,'gomorra',12.59,15.36,NULL,345);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro_autore`
--

DROP TABLE IF EXISTS `libro_autore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libro_autore` (
  `libro_id` int(11) DEFAULT NULL,
  `autore_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro_autore`
--

LOCK TABLES `libro_autore` WRITE;
/*!40000 ALTER TABLE `libro_autore` DISABLE KEYS */;
INSERT INTO `libro_autore` VALUES (1,3),(2,8),(3,5),(4,11),(5,6),(6,2),(7,4),(8,12),(9,13),(10,9),(11,1),(12,7),(13,16),(14,18),(14,19),(15,1),(16,14),(17,2),(18,17),(19,15),(20,10),(21,20),(22,21);
/*!40000 ALTER TABLE `libro_autore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parente`
--

DROP TABLE IF EXISTS `parente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parente` (
  `parente_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`parente_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parente`
--

LOCK TABLES `parente` WRITE;
/*!40000 ALTER TABLE `parente` DISABLE KEYS */;
/*!40000 ALTER TABLE `parente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prenotazioni`
--

DROP TABLE IF EXISTS `prenotazioni`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prenotazioni` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `nPersone` int(11) DEFAULT NULL,
  `nGiorni` int(11) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prenotazioni`
--

LOCK TABLES `prenotazioni` WRITE;
/*!40000 ALTER TABLE `prenotazioni` DISABLE KEYS */;
INSERT INTO `prenotazioni` VALUES (1,NULL,3,4,NULL),(2,NULL,3,4,'matteo'),(3,NULL,3,4,'matteo'),(4,NULL,3,4,'matteo'),(5,NULL,2,5,'eugenio');
/*!40000 ALTER TABLE `prenotazioni` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studente`
--

DROP TABLE IF EXISTS `studente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studente` (
  `studente_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `cognome` varchar(100) DEFAULT NULL,
  `genere` enum('m','f') DEFAULT NULL,
  `indirizzo` varchar(100) DEFAULT NULL,
  `n_civ` varchar(10) DEFAULT NULL,
  `citta` varchar(30) DEFAULT NULL,
  `provincia` char(2) DEFAULT 'To',
  `regione` varchar(30) DEFAULT 'Piemonte',
  `email` varchar(100) DEFAULT NULL,
  `data_nascita` date DEFAULT NULL,
  `ins` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`studente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studente`
--

LOCK TABLES `studente` WRITE;
/*!40000 ALTER TABLE `studente` DISABLE KEYS */;
INSERT INTO `studente` VALUES (1,'franco','rossi','m','via Tripoli','10 a','torino','TO','piemonte','franco.rossi@gmail.com','1978-10-01','2020-01-28 08:39:46'),(2,'mario','verdi','m','via Vicenza','17 int 3','asti','AT','piemonte','mario.verdi@gmail.com','1981-10-01','2020-01-28 08:39:46'),(3,'paolo','bianchi','m','via Volvera','47','asti','AT','piemonte','paolo.bianchi@gmail.com','1983-10-01','2020-01-28 08:39:46'),(4,'sara','rossi','f','corso Vigevano','301 b','cuneo','CN','piemonte','sara.rossi@gmail.com','1983-10-01','2020-01-28 08:39:46'),(5,'elisa','verdi','f','corso Francia','18','alessandria','AL','piemonte','elisa.verdi@gmail.com','1987-10-01','2020-01-28 08:39:46'),(6,'marco','bianchi','m','via Siccardi','3','novara','NO','piemonte','marcob@gmail.com','1993-10-01','2020-01-28 08:39:46'),(7,'franca','verdi','f','via MIlano','33 int 2','torino','TO','piemonte','fv@icloud.com','1993-10-01','2020-01-28 08:39:46'),(8,'mauro','bruni','m','via Roma','72','torino','TO','piemonte','mb@icloud.com','1988-10-01','2020-01-28 08:39:46'),(9,'osvaldo','rossi','m','via Firenze','5 a','torino','TO','piemonte','or@icloud.com','1987-01-02','2020-01-28 08:39:46'),(10,'oscar','verdi','m','lungo Dora Siena','34','torino','TO','piemonte','ov@icloud.com','1990-02-03','2020-01-28 08:39:46'),(11,'paola','bianchi','f','Corso Regina','300','torino','TO','piemonte','paolab@icloud.com','1985-03-04','2020-01-28 08:39:46'),(12,'franca','verdi','f','Corso Mortara','231','torino','TO','piemonte','francaverdi@icloud.com','1989-11-05','2020-01-28 08:39:46'),(13,'eleonora','verdi','f','via Bardonecchia','121','torino','TO','piemonte','ele@icloud.com','1989-12-06','2020-01-28 08:39:46'),(14,'enrico','macello','m','via Grosseto','125 int 3','asti','AT','piemonte','emacello@gmail.com','1983-10-01','2020-01-28 08:39:46'),(15,'fabio','baggio','m','via Dogliani','7','cuneo','CN','piemonte','fbaggio@gmail.com','1983-10-01','2020-01-28 08:39:46'),(16,'francesco','gamba','m','via Torino','1','alessandria','AL','piemonte','gamba@gmail.com','1987-10-01','2020-01-28 08:39:46'),(17,'marco','demarchi','m','via Napoli','10 b','novara','NO','piemonte','marcodem@gmail.com','1993-10-01','2020-01-28 08:39:46'),(18,'franca','verdone','f','via Parma','9','torino','TO','piemonte','fverdone@icloud.com','1993-10-01','2020-01-28 08:39:46');
/*!40000 ALTER TABLE `studente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studente_bk`
--

DROP TABLE IF EXISTS `studente_bk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studente_bk` (
  `studente_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL,
  `genere` enum('M','F') DEFAULT NULL,
  `indirizzo` varchar(100) DEFAULT NULL,
  `n_civ` varchar(10) DEFAULT NULL,
  `citta` varchar(30) DEFAULT NULL,
  `provincia` char(2) DEFAULT 'To',
  `regione` varchar(30) DEFAULT 'Piemonte',
  `email` varchar(100) NOT NULL,
  `data_nascita` date DEFAULT NULL,
  `ins` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`studente_id`),
  UNIQUE KEY `email` (`email`),
  KEY `k_cognome` (`cognome`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studente_bk`
--

LOCK TABLES `studente_bk` WRITE;
/*!40000 ALTER TABLE `studente_bk` DISABLE KEYS */;
INSERT INTO `studente_bk` VALUES (1,'Mihai','Fedot','M','Via Ghemme','26','Torino','To','Piemonte','fedotmihai@gmail.com','0000-00-00','2020-01-14 12:33:09'),(2,'Maria','Fedot','F','Via Ghemme','26','Torino','To','Piemonte','fedotmaria@gmail.com','0000-00-00','2020-01-14 11:55:12'),(3,'Mihail','Fedot','M','Via Ghemme','26','Torino','To','Piemonte','fedotmihail@gmail.com','0000-00-00','2020-01-14 11:55:30');
/*!40000 ALTER TABLE `studente_bk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `studente_v`
--

DROP TABLE IF EXISTS `studente_v`;
/*!50001 DROP VIEW IF EXISTS `studente_v`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `studente_v` (
  `nome` tinyint NOT NULL,
  `cognome` tinyint NOT NULL,
  `email` tinyint NOT NULL,
  `provincia` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `studentii`
--

DROP TABLE IF EXISTS `studentii`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentii` (
  `studente_id` int(11) NOT NULL DEFAULT 0,
  `nome` varchar(20) DEFAULT NULL,
  `cognome` varchar(30) DEFAULT NULL,
  `genere` enum('M','F') DEFAULT NULL,
  `indirizzo` varchar(100) DEFAULT NULL,
  `citta` varchar(30) DEFAULT NULL,
  `provincia` char(2) DEFAULT 'To',
  `regione` varchar(30) DEFAULT 'Piemonte',
  `email` varchar(100) NOT NULL,
  `data_nascita` date DEFAULT NULL,
  `ins` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentii`
--

LOCK TABLES `studentii` WRITE;
/*!40000 ALTER TABLE `studentii` DISABLE KEYS */;
INSERT INTO `studentii` VALUES (0,'franco','rossi','M','via Tripoli 10','torino','TO','piemonte','franco.rossi@gmail.com','1978-10-01','2020-01-15 08:38:54'),(0,'mario','verdi','M','via Vicenza 17','asti','AT','piemonte','mario.verdi@gmail.com','1981-10-01','2020-01-15 08:38:54'),(0,'paolo','bianchi','M','via Volvera 47','asti','AT','piemonte','paolo.bianchi@gmail.com','1983-10-01','2020-01-15 08:38:54'),(0,'sara','rossi','F','corso Vigevano 301','cuneo','CN','piemonte','sara.rossi@gmail.com','1983-10-01','2020-01-15 08:38:54'),(0,'elisa','verdi','F','corso Francia 18','alessandria','AL','piemonte','elisa.verdi@gmail.com','1987-10-01','2020-01-15 08:38:54'),(0,'marco','bianchi','M','via Siccardi 3','novara','NO','piemonte','marcob@gmail.com','1993-10-01','2020-01-15 08:38:54'),(0,'franca','verdi','F','via MIlano 33','torino','TO','piemonte','fv@icloud.com','1993-10-01','2020-01-15 08:38:54'),(0,'mauro','bruni','M','via Roma 72','torino','TO','piemonte','mb@icloud.com','1988-10-01','2020-01-15 08:38:54'),(0,'osvaldo','rossi','M','via Firenze 5','torino','TO','piemonte','or@icloud.com','1987-01-02','2020-01-15 08:38:54'),(0,'oscar','verdi','M','lungo Dora Siena 34','torino','TO','piemonte','ov@icloud.com','1990-02-03','2020-01-15 08:38:54'),(0,'paola','bianchi','F','Corso Regina 300','torino','TO','piemonte','paolab@icloud.com','1985-03-04','2020-01-15 08:38:54'),(0,'franca','verdi','F','Corso Mortara 231','torino','TO','piemonte','francaverdi@icloud.com','1989-11-05','2020-01-15 08:38:54'),(0,'eleonora','verdi','F','via Bardonecchia 121','torino','TO','piemonte','ele@icloud.com','1989-12-06','2020-01-15 08:38:54'),(0,'enrico','macello','M','via Grosseto 125','asti','AT','piemonte','emacello@gmail.com','1983-10-01','2020-01-15 08:38:54'),(0,'fabio','baggio','M','via Dogliani 7','cuneo','CN','piemonte','','1983-10-01','2020-01-15 09:09:59'),(0,'francesco','gamba','M','via Torino 1','alessandria','AL','piemonte','gamba@gmail.com','1987-10-01','2020-01-15 08:38:54'),(0,'marco','demarchi','M','via Napoli 10','novara','NO','piemonte','marcodem@gmail.com','1993-10-01','2020-01-15 08:38:54'),(0,'franca','verdone','F','via Parma 9','torino','TO','piemonte','fverdone@icloud.com','1993-10-01','2020-01-15 08:38:54');
/*!40000 ALTER TABLE `studentii` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `verifiche`
--

DROP TABLE IF EXISTS `verifiche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `verifiche` (
  `verifica_id` int(11) NOT NULL AUTO_INCREMENT,
  `studente_id` int(11) DEFAULT NULL,
  `test_id` int(11) DEFAULT NULL,
  `punteggio` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`verifica_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `verifiche`
--

LOCK TABLES `verifiche` WRITE;
/*!40000 ALTER TABLE `verifiche` DISABLE KEYS */;
INSERT INTO `verifiche` VALUES (1,3,1,75),(2,8,1,80),(3,12,1,70),(4,15,1,92),(5,3,2,85),(6,8,2,90),(7,12,2,75),(8,15,2,95);
/*!40000 ALTER TABLE `verifiche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Current Database: `gestionale`
--

