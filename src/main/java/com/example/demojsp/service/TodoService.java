package com.example.demojsp.service;

import com.example.demojsp.model.Todo;

import java.util.Date;
import java.util.List;

public interface TodoService {

    List<Todo> retrieveTodos(String user);

    void addTodo(String name, String desc, Date targetDate,
                 boolean isDone);

    void deleteTodo(int id);

    Todo getTodoById(int id);

    void updateTodo(Todo todo);
}
