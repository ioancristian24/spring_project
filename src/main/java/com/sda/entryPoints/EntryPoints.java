package com.sda.entryPoints;

import com.sda.entities.Student;
import com.sda.service.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntryPoints {
    private StudentServiceImpl studentService;

    public StudentServiceImpl getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public void execute(){
        System.out.println("Am ajuns in clasa EntryPoints");
        Student student = new Student();
        student.setName("Marin Preda");
        student.setAge(25);
        student.setAverage_grade(8);
        getStudentService().addStudent(student);
    }
}
