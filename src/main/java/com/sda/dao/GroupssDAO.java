package com.sda.dao;

import com.sda.entities.Groupss;

public interface GroupssDAO {

    void addGroupss(Groupss groupss);
    Groupss displayGroupssById(Integer id);
    Groupss updateGroupssById(Integer id, String name);
    void deleteGroupssById(Integer id);
}
