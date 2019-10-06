package com.sda.dao.implementation;

import com.sda.dao.StudentDAO;
import com.sda.entities.Student;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentDaoImpl implements StudentDAO {
    public void addStudent(Student student) {
        System.out.println("Am ajuns in clasa StudentDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            session.beginTransaction();
            Integer id = (Integer) session.save(student);
            System.out.println("Student was creates with id: " + id);
            session.getTransaction().commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    public Student displayStudentById(Integer id) {
        return null;
    }

    public void updateStudentById(Integer id, Integer average_grade) {

    }

    public void deleteStudentById(Integer id) {

    }

    public void getStudentById(Student student) {

    }
}
