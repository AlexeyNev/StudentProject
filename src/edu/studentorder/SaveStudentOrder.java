package edu.studentorder;

import edu.studentorder.domain.AdultHuman;
import edu.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder marsik) {
        long answer = 199;
        System.out.println("saveStudentOrder: ");

        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        AdultHuman husband = new AdultHuman();
        husband.setGivenName("Alexey");
        so.setHusband(husband);
        return so;
    }
}
