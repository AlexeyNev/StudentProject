package edu.studentorder.validator;

import edu.studentorder.domain.AnswerStudent;
import edu.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Проверка, что является студентом");
        return new AnswerStudent();
    }
}
