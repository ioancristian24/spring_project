package com.sda.entryPoints;

import com.sda.entities.Locker;
import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.service.implementation.LockerServiceImpl;
import com.sda.service.implementation.StudentServiceImpl;
import com.sda.service.implementation.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntryPoints {
    private StudentServiceImpl studentService;
    private TeacherServiceImpl teacherService;
    private LockerServiceImpl lockerService;

    public LockerServiceImpl getLockerService() {
        return lockerService;
    }

    @Autowired
    public void setLockerService(LockerServiceImpl lockerService) {
        this.lockerService = lockerService;
    }

    public TeacherServiceImpl getTeacherService() {
        return teacherService;
    }

    @Autowired
    public void setTeacherService(TeacherServiceImpl teacherService) {
        this.teacherService = teacherService;
    }

    public StudentServiceImpl getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public void executeLocker(){
        System.out.println("Am ajuns in clasa EntryPoints");
        Locker locker = new Locker();
        locker.setNumber(5);
        getLockerService().addLocker(locker);
    }

    public void fetchLocker(Integer id){
        System.out.println("Am ajuns in clasa EntryPoints");
        getLockerService().displayLocker(id);
    }

    public void updateLocker(Integer id, Integer number){
        System.out.println("Am ajuns in clasa EntryPoints");
        getLockerService().editLocker(id, number);
    }

    public void removeLocker(Integer id){
        System.out.println("Am ajuns in clasa EntryPoints");
        getLockerService().eraseLocker(id);
    }

    public void executeStudent(){
        System.out.println("Am ajuns in clasa EntryPoints");
        Locker locker = new Locker();
        locker.setNumber(5);

        Student student = new Student();
        student.setName("Marian Murarescu");
        student.setAge(23);
        student.setAverage_grade(6);
        student.setLockerId(locker);
        getStudentService().addStudent(student);
    }

    public void fetchStudent(Integer id){
        System.out.println("Am ajuns in clasa EntryPoints");
        getStudentService().displayStudent(id);
    }

    public void updateStudent(Integer id, Integer average_grade){
        System.out.println("Am ajuns in clasa EntryPoints");
        getStudentService().editStudent(id, average_grade);
    }

    public void removeStudent(Integer id){
        System.out.println("Am ajuns in clasa EntryPoints");
        getStudentService().eraseStudent(id);
    }

    public void executeTeacher(){
        System.out.println("Am ajuns in clasa EntryPoints");
        Teacher teacher = new Teacher();
        teacher.setName("Paul Moraru");
        teacher.setAge(55);
        teacher.setDiscipline("Mineralogy");
        getTeacherService().addTeacher(teacher);
    }

    public void fetchTeacher(Integer id){
        System.out.println("Am ajuns in clasa EntryPoints");
        getTeacherService().displayTeacher(id);
    }

    public void updateTeacher(Integer id, String discipline){
        System.out.println("Am ajuns in clasa EntryPoints");
        getTeacherService().editTeacher(id, discipline);
    }

    public void removeTeacher(Integer id){
        System.out.println("Am ajuns in clasa EntryPoints");
        getTeacherService().eraseTeacher(id);
    }
}
