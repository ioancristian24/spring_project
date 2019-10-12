package com.sda;

import com.sda.entryPoints.EntryPoints;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyConfig.class);
        EntryPoints entryPoints = applicationContext.getBean(EntryPoints.class);
        //entryPoints.executeStudent();
        //entryPoints.fetchStudent(2);
        //entryPoints.updateStudent(7,4);
        //entryPoints.removeStudent(8);

        //entryPoints.executeTeacher();
        //entryPoints.fetchTeacher(1);
        //entryPoints.updateTeacher(2,"English");
        //entryPoints.removeTeacher(5);

        //entryPoints.executeLocker();
        //entryPoints.fetchLocker(1);
        //entryPoints.updateLocker(2,5);
        entryPoints.removeLocker(3);
    }
}
