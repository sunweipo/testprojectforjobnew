package com.sun.testprojectforjob.service;

import com.sun.testprojectforjob.entity.Student;
import com.sun.testprojectforjob.entity.User;
import com.sun.testprojectforjob.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public Student Sel(int id){
        return studentMapper.Sel(id);
    }

    public User getUser(String username) {
        return studentMapper.getUser(username);
    }
}
