package com.todo.app.dto;

import java.util.Date;

import com.todo.app.model.Todo;

public class TodoResponse {

	private Long id;
	private String title;
	private String status;
	private String details;
	private Date createdAt;
	private Date updatedAt;

	//	Todoオブジェクトから取ってくる。
	public TodoResponse(Todo todo) {
		this.id = todo.getId();
		this.title = todo.getTitle();
		this.status = todo.getStatus();
		this.details = todo.getDetails();
		this.createdAt = todo.getCreatedAt();
		this.updatedAt = todo.getUpdatedAt();
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
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
