package edu.studentorder;
/**
 * Конструктор - по сути это метод класса,
 * но эта конструкция обладает неким особенным построением.
 * Оно не умеет возвращать значение (public Person())
 * Имеет имя которое полностью совпадает с именем класса
 *
 * abstract - класс, который Вы объявили, не позволяет Вам создавать объект этого класса
 * (нельзя будет создать объект)
 *
 */

import edu.studentorder.domain.Person;
import edu.studentorder.domain.other.AdultHuman;
import edu.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {

//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder marsik) {
        long answer = 199;
        System.out.println("saveStudentOrder: ");

        return answer;
    }

    static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        return so;
    }
}
