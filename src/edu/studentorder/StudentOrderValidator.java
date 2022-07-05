package edu.studentorder;


import edu.studentorder.domain.*;
import edu.studentorder.mail.MailSender;
import edu.studentorder.validator.ChildrenValidator;
import edu.studentorder.validator.CityRegisterValidator;
import edu.studentorder.validator.StudentValidator;
import edu.studentorder.validator.WeddingValidator;

/**
 * edu.studentorder.validator.ChildrenValidator ch = new edu.studentorder.validator.ChildrenValidator();
 * return ch.checkChildren(so);
 * аналогия записи
 * return new edu.studentorder.validator.StudentValidator().checkStudent(so);
 *
 * forEach - цикл, в котором берем каждый элемент цикла и вставляем его в переменную
 * for(StudentOrder so : soArray) { каждый элемент из массива soArray
 *     System.out.println();   вставляем в переменную so
 *     checkOneOrder(so);
 * }
 */

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSend;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSend = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator rsl = new StudentOrderValidator();
        rsl.checkAll();
    }

    void checkAll() {
        StudentOrder[] soArray = readStudentOrders();

        for (StudentOrder so : soArray) {
            System.out.println();
            checkOneOrder(so);
        }
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];

        for (int i = 0; i < soArray.length; i++) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);

        }

        return soArray;
    }

    public void checkOneOrder(StudentOrder so) {
        AswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWeddingProcess(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    public AswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWeddingProcess(StudentOrder so) {
        return weddingVal.checkWeddingProcess(so);

    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSend.sendMail(so);
    }
}
