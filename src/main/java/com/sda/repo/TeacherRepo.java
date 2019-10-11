package com.sda.repo;

import com.sda.dao.implementation.TeacherDaoImpl;
import com.sda.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepo {
    private TeacherDaoImpl teacherDao;

    public TeacherDaoImpl getTeacherDao() {
        return teacherDao;
    }

    @Autowired
    public void setTeacherDao(TeacherDaoImpl teacherDao) {
        this.teacherDao = teacherDao;
    }

    public void createTeacher(Teacher teacher){
        System.out.println("Am ajuns in clasa TeacherRepo");
        getTeacherDao().addTeacher(teacher);
    }

    public Teacher readTeacher(Integer id){
        System.out.println("Am ajuns in clasa TeacherRepo");
        Teacher teacher = getTeacherDao().displayTeacherById(id);
        return teacher;
    }

    public Teacher modifyTeacher(Integer id, String discipline){
        System.out.println("Am ajuns in clasa TeacherRepo");
        Teacher teacher = getTeacherDao().updateTeacherById(id, discipline);
        return teacher;
    }

    public void deleteTeacher(Integer id){
        System.out.println("Am ajuns in clasa TeacherRepo");
        getTeacherDao().deleteTeacherById(id);
    }
}
