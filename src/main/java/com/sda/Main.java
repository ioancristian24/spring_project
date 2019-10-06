package com.sda;

import com.sda.entryPoints.EntryPoints;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyConfig.class);
        EntryPoints entryPoints = applicationContext.getBean(EntryPoints.class);
        entryPoints.executeStudent();
        entryPoints.executeTeacher();
    }
}
