package edu.studentorder;
/**
 * Конструктор - по сути это метод класса,
 * но эта конструкция обладает неким особенным построением.
 * Оно не умеет возвращать значение (public Person())
 * Имеет имя которое полностью совпадает с именем класса
 *
 */

import edu.studentorder.domain.other.AdultHuman;
import edu.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();

//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder marsik) {
        long answer = 199;
        System.out.println("saveStudentOrder: ");

        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();

        AdultHuman husband = new AdultHuman();


//        husband.setGivenName("Alexey");
//        husband.setSurName("Nevredimov");
//        husband.setPassportNumber("33");
//        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);
        return so;
    }
}
