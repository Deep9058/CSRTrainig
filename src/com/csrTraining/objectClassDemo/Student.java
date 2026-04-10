package com.csrTraining.objectClassDemo;

import java.util.Objects;

public record Student(String name, int id, long phone) {

    public Student(String name, int id, long phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public long phone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && phone == student.phone && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, phone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                '}';
    }
}
