package view;

import java.sql.SQLException;

import controller.StudenteController;
import model.Studente;

public class Registro {

	public static void main(String[] args) {
		StudenteController sc = new StudenteController();
		try {
			for ( Studente s : sc.getAll() ) {
				System.out.println(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
