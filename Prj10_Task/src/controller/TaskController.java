package controller;

import java.util.ArrayList;
import java.util.TreeSet;

import model.Task;

public class TaskController implements InterfacciaTask {

	private ArrayList<Task> tuttiTask;
	private TreeSet<String> tutteCat;

	public TaskController() {

		this.tuttiTask = new ArrayList<Task>();
		this.tutteCat = new TreeSet<String>();
	}

	@Override
	public boolean addTask(String categoria, String task) {

		Task ta = new Task(task, categoria);
		boolean inserito = false;

		if (tuttiTask.add(ta))
			inserito = true;

		this.tutteCat.add(categoria);
		
		return inserito;
	}

	@Override
	public ArrayList<String[]> getAllTask() {

		ArrayList<String[]> temp = new ArrayList<>();

		for (Task task : tuttiTask) {

			String[] nome = { task.getCategoria(), task.getCosaDafare(), task.getDataInizio().toString() };
			temp.add(nome);
		}

		return temp;
	}

	@Override
	public ArrayList<String> getCategorie() {

		ArrayList<String> temp = new ArrayList<>();

		for (String cat : tutteCat) {

			temp.add(cat);
		}

		return temp;
	}

	@Override
	public String getTaskById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCatById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
