package com.sda.entryPoints;

import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.service.implementation.StudentServiceImpl;
import com.sda.service.implementation.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntryPoints {
    private StudentServiceImpl studentService;
    private TeacherServiceImpl teacherService;

    public TeacherServiceImpl getTeacherService() {
        return teacherService;
    }

    @Autowired
    public void setTeacherService(TeacherServiceImpl teacherService) {
        this.teacherService = teacherService;
    }

    public void executeTeacher(){
        System.out.println("Am ajuns in clasa EntryPoints");
        Teacher teacher = new Teacher();
        teacher.setName("Paul Moraru");
        teacher.setAge(55);
        teacher.setDiscipline("Mineralogy");
        getTeacherService().addTeacher(teacher);
    }


    public StudentServiceImpl getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public void executeStudent(){
        System.out.println("Am ajuns in clasa EntryPoints");
        Student student = new Student();
        student.setName("Ionut Mircea");
        student.setAge(21);
        student.setAverage_grade(7);
        getStudentService().addStudent(student);
    }
}
