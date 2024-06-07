package com.todo.app.model;

import java.util.Date;

public class Todo {
	
	private Long id;
	private String title;
	private String status;
	private String details;
	private Date createdAt;
	private Date updatedAt;
	
	public Todo() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Todo(String title, String status, String details) {
		this.title = title;
		this.status = status;
		this.details = details;
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
