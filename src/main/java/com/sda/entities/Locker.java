package com.sda.entities;

import javax.persistence.*;

@Entity
@Table(name = "locker")
public class Locker {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "number", nullable=true)
    private Integer number;

    @OneToOne(mappedBy = "lockerId")
    private Student student;

    public Locker(Integer number, Student student) {
        this.number = number;
        this.student = student;
    }

    public Locker() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Locker{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
