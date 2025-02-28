package com.practica.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    //Attributes
    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
    

    //Constructor
    public User() {
    }

    //GET and SET
    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getLastname(){return lastname;}
    public void setLastname(String lastname){this.lastname = lastname;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}
}
