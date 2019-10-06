package com.sda.service.implementation;

import com.sda.entities.Teacher;
import com.sda.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl {

    private TeacherRepo teacherRepo;

    public void addTeacher(Teacher teacher){
        System.out.println("Am ajuns in clasaTeacherImpl");
        getTeacherRepo().createTeacher(teacher);
    }

    public TeacherRepo getTeacherRepo() {
        return teacherRepo;
    }

    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }
}
