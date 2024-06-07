package com.todo.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.dto.TodoRequest;
import com.todo.app.dto.TodoResponse;
import com.todo.app.exception.TodoNotFoundException;
import com.todo.app.mapper.TodoMapper;
import com.todo.app.model.Todo;

@Service
public class TodoService {

	@Autowired
	private TodoMapper todoMapper;
	
	public TodoResponse getTodo(Long id) {
		 Todo todo = todoMapper.findById(id);
		 if(todo == null) {
			 throw new TodoNotFoundException(id);
		 }
		 TodoResponse todoResponse = new TodoResponse(todo);
		return todoResponse;
	}
	
	public List<TodoResponse> getAllTodos(){
		List<Todo> todoList = todoMapper.findAll();
		List<TodoResponse> todoResponses = new ArrayList<>();
		for(Todo todo : todoList) {
			TodoResponse todoResponse = new TodoResponse(todo);
			todoResponses.add(todoResponse);
		}
		return todoResponses;
	}
	
	public TodoResponse addTodo(TodoRequest todoRequest) {
		Todo todo = new Todo();
		BeanUtils.copyProperties(todoRequest, todo);
		todoMapper.insert(todo);
		TodoResponse todoResponse = new TodoResponse(todo);
		return todoResponse;
	}
	
	public  TodoResponse updateTodo(Long id, TodoRequest todoRequest) {
		 Todo todo = todoMapper.findById(id);
		 if(todo == null) {
			 throw new TodoNotFoundException(id);
		 }
		BeanUtils.copyProperties(todoRequest, todo);
		todoMapper.update(todo);
		TodoResponse todoResponse = new TodoResponse(todo);
		return todoResponse;
	}
	
	public void deleteTodo(Long id) {
		 Todo todo = todoMapper.findById(id);
		 if(todo == null) {
			 throw new TodoNotFoundException(id);
		 }
		 todoMapper.delete(id);
	}
	
}
