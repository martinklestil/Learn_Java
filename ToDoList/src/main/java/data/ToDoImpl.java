package data;

import java.util.ArrayList;

public class ToDoImpl implements ToDoDao{
	
	private ArrayList<ToDo> toDos;
	
	public ToDoImpl() {
		toDos = new ArrayList<>();
	}

	@Override
	public ArrayList<ToDo> getAllToDos() {
		return toDos;
	}

	@Override
	public ToDo getToDobyId(int id) {
		return toDos.get(id);
	}

	@Override
	public void saveToDos(ToDo todo) {
		toDos.add(todo);
		
	}

	@Override
	public void deletToDos(ToDo todo) {
		System.out.println("Delet Function");
		toDos.remove(todo);
		
	}

}
