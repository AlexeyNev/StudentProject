package edu.studentorder;


import edu.studentorder.domain.*;
import edu.studentorder.mail.MailSender;
import edu.studentorder.validator.ChildrenValidator;
import edu.studentorder.validator.CityRegisterValidator;
import edu.studentorder.validator.StudentValidator;
import edu.studentorder.validator.WeddingValidator;

/**
 *  edu.studentorder.validator.ChildrenValidator ch = new edu.studentorder.validator.ChildrenValidator();
 *         return ch.checkChildren(so);
 *         аналогия записи
 *         return new edu.studentorder.validator.StudentValidator().checkStudent(so);
 */
public class StudentOrderValidator {
    public static void main(String[] args) {
        StudentOrder so = readStudentOrder();

        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start");
            if (so == null) {
                break;
            }
            System.out.println("Finish");

                AswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {
//                continue;
                break;
            }
                AnswerWedding wedAnswer = checkWeddingProcess(so);
                AnswerChildren childAnswer = checkChildren(so);
                AnswerStudent studentAnswer = checkStudent(so);

                sendMail(so);
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "HostOne";
        crv1.password = 222;
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "HostTwo";
        crv2.password = 333;
        AswerCityRegister ans1 = crv1.checkCityRegister(so);
        AswerCityRegister ans2 = crv2.checkCityRegister(so);
       return ans1;
    }

    static AnswerWedding checkWeddingProcess(StudentOrder so) {
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWeddingProcess(so);

    }

    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator ch = new ChildrenValidator();
        return ch.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return new StudentValidator().checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
