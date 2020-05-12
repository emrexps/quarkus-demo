package com.student.demo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/student")
public class StudentResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Student addStudent(Student student) {

        student.persist();
        return student;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> listAll() {
        return   Student.findAll().list();
    }

   
}

