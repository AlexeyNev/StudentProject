package edu.studentorder.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * private List <Child> children; - объект типа List, у которого внутри будут элементы типа child. Это дженерик
 */

public class StudentOrder {
    private long studentOrderId;
    private AdultHuman husband;
    private AdultHuman wife;
    private List <Child> children;
    private String marriageCertificateId;
    private String marriageOffice;
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
