package data;

import java.util.ArrayList;

public interface ToDoDao {
	//DAO Pattern Interface
	ArrayList<ToDo> getAllToDos();
	ToDo getToDobyId (int id);
	void saveToDos (ToDo todo);
	void deletToDos (ToDo todo);
	

}
