public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Alexey";
        so.hLastName = "Nevredimov";
        so.wFirstName = "Alla";
        so.wLastName = "Nevredimova";
        StudentOrder so1 = new StudentOrder();
        so1.hFirstName = "Petr";
        so1.hLastName = "Marsov";
        so1.wFirstName = "Alisa";
        so1.wLastName = "Marsova";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
    }
    static long saveStudentOrder(StudentOrder marsik) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + marsik.hFirstName);
        System.out.println("saveStudentOrder: " + marsik.hLastName);

        return answer;
    }
}
