package edu.studentorder.domain;

import edu.studentorder.domain.other.AdultHuman;

import java.time.LocalDate;

public class StudentOrder {
    private long studentOrderId;
    private AdultHuman husband;
    private AdultHuman wife;
    private Child child;
    private String marriageCertificateId;
    private String marriageOffice;
    private LocalDate marriageDate;

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

    public String getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
    }

    public String getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        this.marriageOffice = marriageOffice;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }
}
