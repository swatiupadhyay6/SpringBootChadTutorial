package com.example.demo.rest;


import com.example.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class DemoRestController {
    private List<Student> studentList;

    @PostConstruct
    public void onLoad(){
        studentList = new ArrayList<>();
        studentList.add(new Student("jay", "pay"));
        studentList.add(new Student("jay1", "pay1"));
        studentList.add(new Student("jay2", "pay2"));
    }

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentList;
    }
}
