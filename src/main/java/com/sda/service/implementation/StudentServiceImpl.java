package com.sda.service.implementation;

import com.sda.entities.Student;
import com.sda.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student){
        System.out.println("Am ajuns in clasa StudentServiceImpl");
        getStudentRepo().createStudent(student);
    }

    public void displayStudent(Integer id){
        System.out.println("Am ajuns in clasa StudentServiceImpl");
        Student student = getStudentRepo().readStudent(id);
        System.out.println(student);
    }

    public void editStudent(Integer id, Integer average_grade){
        System.out.println("Am ajuns in clasa StudentServiceImpl");
        Student student = getStudentRepo().modifyStudent(id, average_grade);
        System.out.println("The new values for updated student are: ");
        System.out.println(student);
    }

    public void eraseStudent(Integer id){
        System.out.println("Am ajuns in clasa StudentServiceImpl");
        getStudentRepo().deleteStudent(id);
    }


}
