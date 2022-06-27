package edu.studentorder.validator;

import edu.studentorder.domain.AnswerChildren;
import edu.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Проверка на наличие детей");
        return new AnswerChildren();
    }
}
