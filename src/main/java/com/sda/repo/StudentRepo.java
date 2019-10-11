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

    public Student readStudent(Integer id) {
        System.out.println("Am ajuns in clasa StudentRepo");
        Student student = getStudentDao().displayStudentById(id);
        return student;
    }

    public Student modifyStudent(Integer id, Integer average_grade){
        System.out.println("Am ajuns in clasa StudentRepo");
        Student student = getStudentDao().updateStudentById(id, average_grade);
        return student;
    }

    public void deleteStudent(Integer id){
        System.out.println("Am ajuns in clasa StudentRepo");
        getStudentDao().deleteStudentById(id);
    }
}
