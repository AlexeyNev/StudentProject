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
        crv1.login = "Alex";
        crv1.password = 222;
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "HostTwo";
        crv2.login = "Marsic";
        crv2.password = 333;
        AswerCityRegister ans1 = crv1.checkCityRegister(so);
        AswerCityRegister ans2 = crv2.checkCityRegister(so);
       return ans1;
    }

    static AnswerWedding checkWeddingProcess(StudentOrder so) {
        return AnswerWeddingValidator.checkWeddingProcess(so);

    }

    static AnswerChildren checkChildren(StudentOrder so) {
        return AnswerChildrenValidator.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return AnswerStudentValidator.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        System.out.println("Почта отправлена");
    }
}
