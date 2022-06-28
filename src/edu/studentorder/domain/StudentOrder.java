package edu.studentorder.domain;

import edu.studentorder.domain.other.AdultHuman;

public class StudentOrder {
    private long studentOrderId;
    private AdultHuman husband;
    private AdultHuman wife;
    private Child child;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public AdultHuman getHusband() {
        return husband;
    }

    public void setHusband(AdultHuman husband) {
        this.husband = husband;
    }

    public AdultHuman getWife() {
        return wife;
    }

    public void setWife(AdultHuman wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
