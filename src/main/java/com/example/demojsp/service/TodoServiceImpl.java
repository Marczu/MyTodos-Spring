package com.example.demojsp.service;

import com.example.demojsp.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "Marczu", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "Marczu", "Learn WebServices", new Date(), false));
        todos.add(new Todo(3, "Marczu", "Learn Hibernate", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public Todo getTodoById(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    @Override
    public void updateTodo(Todo todo) {
        todos.remove(todo);
        todos.add(todo);
    }

    public void addTodo(String name, String desc, Date targetDate,
                        boolean isDone) {
        todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }

}
