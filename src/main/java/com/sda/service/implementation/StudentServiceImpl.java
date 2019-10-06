package com.sda.service.implementation;

import com.sda.dao.implementation.StudentDaoImpl;
import com.sda.entities.Student;
import com.sda.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {

    private StudentRepo studentRepo;

    public void addStudent(Student student){
        System.out.println("Am ajuns in clasa StudentServiceImpl");
        getStudentRepo().createStudent(student);

    }

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
}
