package com.sda.dao;

import com.sda.entities.Locker;

public interface LockerDAO {

    void addLocker(Locker locker);
    Locker displayLockerById(Integer id);
    Locker updateLockerById(Integer id, Integer number);
    void deleteLockerById(Integer id);
}
