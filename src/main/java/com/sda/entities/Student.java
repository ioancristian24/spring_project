package com.sda.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "averagegrade")
    private Integer average_grade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name = "locker_id", referencedColumnName = "id")})
    private Locker lockerId;


    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAverage_grade() {
        return average_grade;
    }

    public void setAverage_grade(Integer average_grade) {
        this.average_grade = average_grade;
    }

    public Locker getLockerId() {
        return lockerId;
    }

    public void setLockerId(Locker lockerId) {
        this.lockerId = lockerId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", average_grade=" + average_grade +
                ", lockerId=" + lockerId +
                '}';
    }
}
