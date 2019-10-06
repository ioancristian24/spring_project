package com.sda.dao.implementation;

import com.sda.dao.TeacherDAO;
import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class TeacherDaoImpl implements TeacherDAO {
    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Am ajuns in clasa TeacherDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            session.beginTransaction();
            Integer id = (Integer) session.save(teacher);
            System.out.println("Teacher was creates with id: " + id);
            session.getTransaction().commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    @Override
    public Student displayTeacherById(Integer id) {
        return null;
    }

    @Override
    public void updateTeacherById(Integer id, String discipline) {

    }

    @Override
    public void deleteTeacherById(Integer id) {

    }
}
