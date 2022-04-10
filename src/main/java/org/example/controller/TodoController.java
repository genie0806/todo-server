package org.example.controller;


import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/")
public class TodoController {

    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("Create");
        return null;
    }

    @GetMapping("{id}")
    public  ResponseEntity<TodoResponse> readOne(){
        System.out.println();
        return null;
    }
    @GetMapping
    public ResponseEntity<TodoResponse> readAll(){
        System.out.println();
        return null;
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(){
        System.out.println("Update");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<TodoEntity> deleteOne(){
        System.out.println("delete one");
        return null;
    }

    @DeleteMapping
    public ResponseEntity<TodoEntity> deleteAll(){
        System.out.println("delete All");
        return null;
    }

    }
