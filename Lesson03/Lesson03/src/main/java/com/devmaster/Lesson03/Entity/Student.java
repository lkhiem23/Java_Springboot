package com.devmaster.Lesson03.Entity;

public class Student {
    Long id;
    String name;
    int age;
    String gender;
    String address;
    String phone;
    String email;

    public Student() {
    }

    public Student(String address, int age, String email, String gender, Long id, String name, String phone) {
        this.address = address;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
