/**
 *
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
                continue;
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
        System.out.println("Проверка в городском реестре населения");
        AswerCityRegister rsl = new AswerCityRegister();
        rsl.success = false;
        return rsl;
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
        System.out.println("Почта отправлена");
    }
}
