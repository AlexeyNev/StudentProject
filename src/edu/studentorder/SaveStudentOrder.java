package edu.studentorder;
/**
 * Конструктор - по сути это метод класса,
 * но эта конструкция обладает неким особенным построением.
 * Оно не умеет возвращать значение (public Person())
 * Имеет имя которое полностью совпадает с именем класса
 * <p>
 * abstract - класс, который Вы объявили, не позволяет Вам создавать объект этого класса
 * (нельзя будет создать объект)
 * <p>
 * garbage collector - механизм, который удаляет объекты на которые не идут ссылки, т.е механизм считает такой объект не активным.
 * поэтому стоит задумываться, создавать ли новые объекты или можно обойтись уже существующими.
 * Коллекции - это классы которые позволяют
 * "jdbc:postgresql://localhost:5432/jc_student" - строка говорит о том, что я хочу
 * присоедениться именно к постгрессу
 * CLASSPATH - специальная структура, откуда JVM может брать классы. Может содержать как просто каталог, так и
 * архив файл. При компиляции и исполнении набор классов которые нужны может различаться.
 * Property fail - обычный файл, внутри которого находятся параметры
 */

import edu.studentorder.dao.DictionaryDaoImpl;
import edu.studentorder.domain.*;

import java.time.LocalDate;
import java.util.List;

public class SaveStudentOrder {
    private static edu.studentorder.domain.Adress Adress;

    public static void main(String[] args) throws Exception {
//        Class.forName("org.postgresql.Driver");
//        StudentOrder s = buildStudentOrder(10);
        List<Street> d = new DictionaryDaoImpl().findStreets("d");
        for (Street s : d) {
            System.out.println(s.getStreetName());
        }
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");

        Street street = new Street(1L, "First street");

        Adress adress = new Adress("195000", street, "12", "", "142");


        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Отдел милиции №" + id);
        husband.setStudentId("" + (100000 + id));
        husband.setAdress(Adress);

        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Отдел милиции №" + id);
        wife.setStudentId("" + (200000 + id));
        wife.setAdress(Adress);

        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        child1.setIssueDepartment("Отдел ЗАГС №" + id);
        child1.setAdress(Adress);

        Child child2 = new Child("Петров", "Марс", "Викторович", LocalDate.of(2018, 6, 28));
        child2.setCertificateNumber("" + (400000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));
        child2.setIssueDepartment("Отдел ЗАГС №" + id);
        child2.setAdress(Adress);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }
}
