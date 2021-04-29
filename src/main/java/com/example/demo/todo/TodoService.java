package com.example.demo.todo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service //@Component
public class TodoService {

    public List<Todo> getAllTodos() {
        return List.of(new Todo());
    }
}
