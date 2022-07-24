package edu.studentorder.domain;

import java.time.LocalDate;

/**
 * Super - метод вызова родителя. Он нужен для вызова конструктора суперкласса (super(список_параметров_конструктора)),
 * для вызова метода суперкласса (super.название_метода(список_параметров_метода));
 * Override - переопределение метода родителя
 * Overload - использование одного имени для нескольких методов с разными параметрами
 *
 * ЗАЧЕМ НУЖНЫ ОДИНАКОВЫЕ ИМЕНА И РАЗНЫЕ НАБОРЫ ПАРАМЕТРОВ? - для удобства
 *
 */

public class Adult extends Person {

    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private PassportOffice issueDepartment;
    private String university;
    private String studentId;

    public Adult(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public PassportOffice getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(PassportOffice issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
