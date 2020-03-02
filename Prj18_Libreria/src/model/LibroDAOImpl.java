package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import db.DBConnect;

public class LibroDAOImpl implements LibroDAO {

	private Map<Integer, Libro> libri;
	
	
	public LibroDAOImpl() {

		this.libri = new HashMap<>();
	}

	@Override
	public Map<Integer, Libro> getAll() {

		try (
				Connection conn = DBConnect.connetti();
				Statement stat = conn.createStatement();
				){
			
			String sql = "select libro_id, titolo from libro";
			ResultSet res = stat.executeQuery(sql);
			while(res.next()) {
				libri.put(res.getInt("libro_id"), new Libro(res.getInt("libro_id"), res.getString("titolo")));
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
		} 
		
		return this.libri;
	}

	@Override
	public Libro getById(int id) {
		Libro l = new Libro();
		try (
				Connection conn = DBConnect.connetti();
				Statement stat = conn.createStatement();
				){
			//da migliorare: permette SQL injections
			String sql = "select libro_id, titolo from libro where libro_id = " + id;
			ResultSet res = stat.executeQuery(sql);
			while(res.next()) {
				l.setTitolo(res.getString("titolo"));
				l.setLibro_id(res.getInt("libro_id"));
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
		} 
		
		return l;
	}

	@Override
	public void insert(Libro l) {
		try (
				Connection conn = DBConnect.connetti();
				Statement stat = conn.createStatement();
				){
			//da migliorare: permette SQL injections
			
			String sql = "insert into libro (titolo) values('" + l.getTitolo() + "')";
			
			stat.executeUpdate(sql);
			
		}catch (SQLException e) {
			// TODO: handle exception
		} 
		
	}

	@Override
	public void update(Libro l) {
		try (
				Connection conn = DBConnect.connetti();
				Statement stat = conn.createStatement();
				){
			//da migliorare: permette SQL injections
			
			String sql = "update libro set titolo= '" + l.getTitolo() + "' where libro_id = "
					+ l.getLibro_id();
			
			stat.executeUpdate(sql);
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public boolean delete(Libro l) {
		try (
				Connection conn = DBConnect.connetti();
				Statement stat = conn.createStatement();
				){
			//da migliorare: permette SQL injections
			String sql = "delete from libro where libro_id = " + l.getLibro_id();
			
			if (stat.executeUpdate(sql) > 0)
				return true;
			
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return false;

		
	}

}
