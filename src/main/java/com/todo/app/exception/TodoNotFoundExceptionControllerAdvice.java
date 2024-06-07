package com.todo.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TodoNotFoundExceptionControllerAdvice {

	@ResponseBody
	@ExceptionHandler(TodoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String todoNotFoundHandler(TodoNotFoundException ex) {
		return ex.getMessage();
	}
	
}
