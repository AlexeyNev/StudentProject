package edu.studentorder.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * private List <Child> children; - объект типа List, у которого внутри будут элементы типа child. Это дженерик
 */

public class StudentOrder {
    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private List <Child> children;
    private String marriageCertificateId;
    private RegisterOffice marriageOffice;
    private LocalDate marriageDate;

    public void addChild(Child child) {
        if (children == null) {
            children = new ArrayList<>(5);
        }
        children.add(child);
    }
    public List<Child> getChildren() {
        return children;
    }

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }



    public String getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public RegisterOffice getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(RegisterOffice marriageOffice) {
        this.marriageOffice = marriageOffice;
    }
}
