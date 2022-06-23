/**
 * 
 */
public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        AswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWeddingProcess(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);


        sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("Проверка в городском реестре населения");
        return new AswerCityRegister();
    }

    static AnswerWedding checkWeddingProcess(StudentOrder so) {
        System.out.println("Проверка на статус семейного положения");
        return new AnswerWedding();

    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Проверка на наличие детей");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Проверка, что является студентом");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so) {

    }
}
