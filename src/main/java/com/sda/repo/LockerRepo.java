package com.sda.repo;

import com.sda.dao.implementation.LockerDaoImpl;
import com.sda.entities.Locker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LockerRepo {

    private LockerDaoImpl lockerDao;

    public LockerDaoImpl getLockerDao() {
        return lockerDao;
    }

    @Autowired
    public void setLockerDao(LockerDaoImpl lockerDao) {
        this.lockerDao = lockerDao;
    }

    public void createLocker(Locker locker){
        System.out.println("Am ajuns in clasa LockerRepo");
        getLockerDao().addLocker(locker);
    }

    public Locker readLocker(Integer id){
        System.out.println("Am ajuns in clasa LockerRepo");
        Locker locker = getLockerDao().displayLockerById(id);
        return locker;
    }

    public Locker modifyLocker(Integer id, Integer number){
        System.out.println("Am ajuns in clasa LockerRepo");
        Locker locker = getLockerDao().updateLockerById(id, number);
        return locker;
    }

    public void deleteLocker(Integer id){
        System.out.println("Am ajuns in clasa LockerRepo");
        getLockerDao().deleteLockerById(id);
    }
}
