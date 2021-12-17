package com.entity.Day10SpringDataJPA.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user")    //Equivalent to <class name="" table="" > in hbm.xml file
public class User {

    @Id      //Equivalent to <id name="" column="" > in hbm.xml
 //   @GeneratedValue(strategy = )      annotations already have generated class so no need to add
    @Column(name = "userid")
    String user;
    @Column(name="password")
    String pass;

    public User() {
    }

    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
