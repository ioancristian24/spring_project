package com.sda.dao;

import com.sda.entities.Student;

public interface StudentDAO {
    void addStudent(Student student);
    Student displayStudentById(Integer id);
    void updateStudentById(Integer id, Integer average_grade);
    void deleteStudentById(Integer id);
}
