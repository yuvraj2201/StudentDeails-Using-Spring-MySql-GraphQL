package com.graphQL.service;

import com.graphQL.entity.Student;
import com.graphQL.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(int id){
        return studentRepository.findById((int) id).get();
    }

}
