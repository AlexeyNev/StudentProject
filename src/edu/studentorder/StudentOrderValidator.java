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
    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
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
        StudentOrder so = new StudentOrder();
        return so;
    }

    public AswerCityRegister checkCityRegister(StudentOrder so) {
       return cityRegisterValidator.checkCityRegister(so);
    }

    public AnswerWedding checkWeddingProcess(StudentOrder so) {
        return weddingValidator.checkWeddingProcess(so);

    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenValidator.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentValidator.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
