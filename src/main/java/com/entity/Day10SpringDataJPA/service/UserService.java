package com.entity.Day10SpringDataJPA.service;

import com.entity.Day10SpringDataJPA.model.User;
import com.entity.Day10SpringDataJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User getObject(String value)
    {
       User ref=(User)repository.findById(value).get();
        return ref;
    }
}
