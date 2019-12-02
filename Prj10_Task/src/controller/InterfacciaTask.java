package controller;

import java.util.ArrayList;

public interface InterfacciaTask {
	
	boolean addTask(String categoria,String task);
	
	ArrayList<String[]> getAllTask();
	ArrayList<String> getCategorie();
	String getTaskById(int i);
	String getCatById(int i);
	
	

}
