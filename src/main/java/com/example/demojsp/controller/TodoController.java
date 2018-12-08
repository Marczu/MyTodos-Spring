package com.example.demojsp.controller;

import com.example.demojsp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/list-todos")
    public String showTodosList(Model model) {

        model.addAttribute("todos", todoService.retrieveTodos("Marczu"));

        return "list-todos";
    }

}
