package com.todo.app.dto;

import com.todo.app.model.Todo;

public class TodoResponse {

	private Long id;
	private String title;
	private String status;
	private String details;
	
//	Todoオブジェクトから取ってくる。
	public TodoResponse(Todo todo) {
		this.id = todo.getId();
		this.title = todo.getTitle();
		this.status = todo.getStatus();
		this.details = todo.getDetails();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
