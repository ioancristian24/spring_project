package com.sda.dao.implementation;

import com.sda.dao.LockerDAO;
import com.sda.entities.Locker;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class LockerDaoImpl implements LockerDAO {
    @Override
    public void addLocker(Locker locker) {
        System.out.println("Am ajuns in clasa LockerDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            session.beginTransaction();
            Integer id = (Integer) session.save(locker);
            System.out.println("Locker was created with id: " + id);
            session.getTransaction().commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    @Override
    public Locker displayLockerById(Integer id) {
        System.out.println("Am ajuns in clasa LockerDaoImpl");
        Locker locker = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            locker = session.get(Locker.class, id);
            if (locker != null) {
                return locker;
            } else {
                System.out.println("Locker does not exist with the provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return locker;
    }

    @Override
    public Locker updateLockerById(Integer id, Integer number) {
        System.out.println("Am ajuns in clasa LockerDaoImpl");
        Locker locker = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            locker = session.get(Locker.class, id);
            if (locker != null) {
                locker.setNumber(number);
                session.beginTransaction();
                session.update(locker);
                session.getTransaction().commit();
            } else {
                System.out.println("Locker with provided id was not updated in database");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return locker;
    }

    @Override
    public void deleteLockerById(Integer id) {
        System.out.println("Am ajuns in clasa LockerDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            Locker locker = session.get(Locker.class, id);
            if (locker != null){
                session.beginTransaction();
                session.delete(locker);
                session.getTransaction().commit();
            }else {
                System.out.println("Locker with provided id was not deleted from database");
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }
}
