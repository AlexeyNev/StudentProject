package edu.studentorder.validator;

import edu.studentorder.domain.AnswerWedding;
import edu.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWeddingProcess(StudentOrder so) {
        System.out.println("Проверка на статус семейного положения");
        return new AnswerWedding();
    }
}
