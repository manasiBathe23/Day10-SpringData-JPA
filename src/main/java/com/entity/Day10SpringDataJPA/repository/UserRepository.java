package com.entity.Day10SpringDataJPA.repository;

import com.entity.Day10SpringDataJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, String> {
    @Query(value="select u from User",nativeQuery = false)
    public List<User> findByPassword(String pass);
    public List<User> findByPasswordAndUserid(String pass,String user);
}
