package yncrea.pw07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import yncrea.pw07.entity.Student;
import yncrea.pw07.service.StudentService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/student")
    public List<Student> getStudents(){
        return studentService.findAll();
    }
}
