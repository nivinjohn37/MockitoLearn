package com.mockitolearnone.business;

import com.mockitolearnone.data.api.TodoService;

import java.util.*;

public class TodoBusinessImpl {
	private TodoService todoService;

	TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("Test")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

	public int isUsersPresent(String[] users) {
		int count = 0;
		Set<String> usersSet = new HashSet<String>(Arrays.asList(users));
		for(String user: usersSet){
			Set<String> resultSet = new HashSet<String>(todoService.retrieveTodos(user));
			if(resultSet.contains(user)){
				count++;
			}
		}
		return count;
	}
}