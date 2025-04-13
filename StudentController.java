package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.repository.StudentRepository;

@RestController
public class StudentController 
{

	@Autowired
    StudentRepository repo;

    @PostMapping("/add")
    public String add(@RequestBody Student s) {
        repo.save(s);
        return "Added";
    }

    @GetMapping("/get/{roll}")
    public Student get(@PathVariable int roll) {
        return repo.findById(roll).get();
    }

    @PutMapping("/update/{roll}/{marks}")
    public String update(@PathVariable int roll, @PathVariable int marks) {
        Student s = repo.findById(roll).get();
        s.setMarks(marks);
        repo.save(s);
        return "Updated";
    }

    @DeleteMapping("/delete/{roll}")
    public String delete(@PathVariable int roll) {
        repo.deleteById(roll);
        return "Deleted";
    }
}

