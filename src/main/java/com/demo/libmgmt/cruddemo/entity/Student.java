package com.demo.libmgmt.cruddemo.entity;

import java.util.Objects;

public class Student {
    private Long sid;
    private String firstName;
    private String lastName;
    private Integer gradeLvl;
    private Integer lateFeeAmt;

    public Student() {}

    public Student(Long sid, String firstName, String lastName, Integer gradeLvl, Integer lateFeeAmt) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLvl = gradeLvl;
        this.lateFeeAmt = lateFeeAmt;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGradeLvl() {
        return gradeLvl;
    }

    public void setGradeLvl(Integer gradeLvl) {
        this.gradeLvl = gradeLvl;
    }

    public Integer getLateFeeAmt() {
        return lateFeeAmt;
    }

    public void setLateFeeAmt(Integer lateFeeAmt) {
        this.lateFeeAmt = lateFeeAmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid.equals(student.sid) &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                gradeLvl.equals(student.gradeLvl) &&
                lateFeeAmt.equals(student.lateFeeAmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, firstName, lastName, gradeLvl, lateFeeAmt);
    }
}

