package com.todo.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.todo.app.model.Todo;

@Mapper
public interface TodoMapper {

		Todo findById(Long id);
		List<Todo> findAll();
		int insert(Todo todo);
		int update(Todo todo);
		int delete(Long id);
}
