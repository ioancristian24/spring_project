package com.sda.dao.implementation;

import com.sda.dao.TeacherDAO;
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
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Integer id = (Integer) session.save(teacher);
            System.out.println("Teacher was creates with id: " + id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Teacher displayTeacherById(Integer id) {
        System.out.println("Am ajuns in clasa TeacherDaoImpl");
        Teacher teacher = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            teacher = session.get(Teacher.class, id);
            if (teacher != null) {
                return teacher;
            } else {
                System.out.println("Teacher with provided id was not found in database");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    @Override
    public Teacher updateTeacherById(Integer id, String discipline) {
        System.out.println("Am ajuns in clasa TeacherDaoImpl");
        Teacher teacher = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            teacher = session.get(Teacher.class, id);
            if (teacher != null) {
                teacher.setDiscipline(discipline);
                session.beginTransaction();
                session.update(teacher);
                session.getTransaction().commit();
            }else {
                System.out.println("Teacher with provided id was not updated in database");
            }
        }catch (HibernateException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    @Override
    public void deleteTeacherById(Integer id) {
        System.out.println("Am ajuns in clasa TeacherDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            Teacher teacher = session.get(Teacher.class, id);
            if (teacher != null){
                session.beginTransaction();
                session.delete(teacher);
                session.getTransaction().commit();
            }else {
                System.out.println("Teacher with provided id was not deleted from database.");
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }
}
