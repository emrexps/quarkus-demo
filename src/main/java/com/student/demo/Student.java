package com.student.demo;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Student extends PanacheEntity {

 public String studentName;
 public Long year;
 public String department;

}