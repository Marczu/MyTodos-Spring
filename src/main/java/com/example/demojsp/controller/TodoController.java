package com.example.demojsp.controller;

import com.example.demojsp.model.Todo;
import com.example.demojsp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/list-todos")
    public String showTodosList(Model model) {

        String name = (String) model.asMap().get("name");

        model.addAttribute("todos", todoService.retrieveTodos(name));

        return "list-todos";
    }

    @GetMapping("/add-todo")
    public String showAddTodo(Model model) {

        model.addAttribute("todo", new Todo(0, (String) model.asMap().get("name") , "Default desc", new Date(), false ));

        return "todo";
    }

    @PostMapping("/add-todo")
    public String addTodo(Todo todo, Model model) {

        String name = (String) model.asMap().get("name");

        todoService.addTodo(name, todo.getDesc(), new Date(), false);

        return "redirect:/list-todos";
    }

    @GetMapping("/delete-todo")
    public String deleteTodo(@RequestParam int id, Model model) {

       todoService.deleteTodo(id);

        return "redirect:/list-todos";
    }

}
