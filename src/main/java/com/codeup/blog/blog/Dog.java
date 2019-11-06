package com.codeup.blog.blog;

import javax.persistence.*;


@Entity
@Table
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    @Column(nullable = false, unique = true)
    private int age;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 2)
    private String resideState;

    public Dog() {
//        this.id = id;
//        this.age = age;
//        this.name = name;
//        this.resideState = resideState;
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getResideState() {
//        return resideState;
//    }
//
//    public void setResideState(String resideState) {
//        this.resideState = resideState;
//    }
}
