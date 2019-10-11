package com.sda.dao.implementation;

import com.sda.dao.StudentDAO;
import com.sda.entities.Student;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
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
        System.out.println("Am ajuns in clasa StudentDaoImpl");
        Student student = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            student = session.get(Student.class, id);
            if (student != null) {
                return student;
            } else {
                System.out.println("Student does not exist with the provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return student;
    }

    public Student updateStudentById(Integer id, Integer average_grade) {
        System.out.println("Am ajuns in clasa StudentDaoImpl");
        Student student = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            student = session.get(Student.class, id);
            if (student != null) {
                student.setAverage_grade(average_grade);
                session.beginTransaction();
                session.update(student);
                session.getTransaction().commit();
            } else {
                System.out.println("Student with provided id was not updated in database");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return student;
    }

    public void deleteStudentById(Integer id) {
        System.out.println("Am ajuns in clasa StudentDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            Student student = session.get(Student.class, id);
            if (student != null){
                session.beginTransaction();
                session.delete(student);
                session.getTransaction().commit();
            }else {
                System.out.println("Student with provided id was not deleted from database");
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }
}
