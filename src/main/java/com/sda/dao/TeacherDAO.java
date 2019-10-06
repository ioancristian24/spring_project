package com.sda.dao;

import com.sda.entities.Student;
import com.sda.entities.Teacher;

public interface TeacherDAO {
    void addTeacher(Teacher teacher);
    Student displayTeacherById(Integer id);
    void updateTeacherById(Integer id, String discipline);
    void deleteTeacherById(Integer id);
}
