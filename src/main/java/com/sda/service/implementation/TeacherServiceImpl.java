package com.sda.service.implementation;

import com.sda.entities.Teacher;
import com.sda.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl {

    private TeacherRepo teacherRepo;

    public TeacherRepo getTeacherRepo() {
        return teacherRepo;
    }

    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public void addTeacher(Teacher teacher){
        System.out.println("Am ajuns in clasaTeacherImpl");
        getTeacherRepo().createTeacher(teacher);
    }

    public void displayTeacher(Integer id){
        System.out.println("Am ajuns in clasa TeacherServiceImpl");
        Teacher teacher = getTeacherRepo().readTeacher(id);
        System.out.println(teacher);
    }

    public void editTeacher(Integer id, String discipline){
        System.out.println("Am ajuns in clasa TeacherServiceImpl");
        Teacher teacher = getTeacherRepo().modifyTeacher(id, discipline);
        System.out.println("The new values for updated teacher are: ");
        System.out.println(teacher);
    }

    public void eraseTeacher(Integer id){
        System.out.println("Am ajuns in clasa TeacherServiceImpl");
        getTeacherRepo().deleteTeacher(id);
    }
}
