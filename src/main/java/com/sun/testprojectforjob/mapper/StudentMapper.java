package com.sun.testprojectforjob.mapper;

import com.sun.testprojectforjob.entity.Student;
import com.sun.testprojectforjob.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {
    Student Sel(int id);

    User getUser(String username);
}
