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

    public StudentOrder readStudentOrder() {
        SaveStudentOrder.buildStudentOrder();
        StudentOrder so = new StudentOrder();
        return so;
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
