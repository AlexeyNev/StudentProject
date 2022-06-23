public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Alexey";
        so.hLastName = "Nevredimov";
        so.wFirstName = "Alla";
        so.wLastName = "Nevredimova";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder marsik) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + marsik.hLastName);

        return answer;
    }
}
