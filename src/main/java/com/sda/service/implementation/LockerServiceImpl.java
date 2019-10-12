package com.sda.service.implementation;

import com.sda.entities.Locker;
import com.sda.repo.LockerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LockerServiceImpl {

    private LockerRepo lockerRepo;

    public LockerRepo getLockerRepo() {
        return lockerRepo;
    }

    @Autowired
    public void setLockerRepo(LockerRepo lockerRepo) {
        this.lockerRepo = lockerRepo;
    }

    public void addLocker(Locker locker){
        System.out.println("Am ajuns in clasa LockerServiceImpl");
        getLockerRepo().createLocker(locker);
    }

    public void displayLocker(Integer id){
        System.out.println("Am ajuns in clasa LockerServiceImpl");
        Locker locker = getLockerRepo().readLocker(id);
        System.out.println(locker);
    }

    public void editLocker(Integer id, Integer number){
        System.out.println("Am ajuns in clasa LockerServiceImpl");
        Locker locker = getLockerRepo().modifyLocker(id, number);
        System.out.println("The new values for updated student are: ");
        System.out.println(locker);
    }

    public void eraseLocker(Integer id){
        System.out.println("Am ajuns in clasa LockerServiceImpl");
        getLockerRepo().deleteLocker(id);
    }
}
