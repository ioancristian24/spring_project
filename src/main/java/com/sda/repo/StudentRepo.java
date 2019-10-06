package com.sda.repo;

import com.sda.dao.implementation.StudentDaoImpl;
import com.sda.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
    private StudentDaoImpl studentDao;

    public StudentDaoImpl getStudentDao() {
        return studentDao;
    }

    @Autowired
    public void setStudentDao(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    public void createStudent(Student student) {
        System.out.println("Am ajuns in clasa StudentRepo");
        getStudentDao().addStudent(student);
    }

}
