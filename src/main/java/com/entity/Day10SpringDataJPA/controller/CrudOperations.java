package com.entity.Day10SpringDataJPA.controller;

import com.entity.Day10SpringDataJPA.model.User;
import com.entity.Day10SpringDataJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrudOperations {

    @Autowired
    UserService service;

    @PostMapping("/User/add")
    public String insert(){return null;}

    @GetMapping("/User/{id}")
    public Object retrieve(@PathVariable("id")String id){
        User ref= service.getObject(id);
        return ref;
    }
    @DeleteMapping("/User/{id}/delete")
    public String delete(){return null;}

}