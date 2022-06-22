public class StudentOrderValidator {
    public static void main(String[] args) {
            checkAll();
    }
    static void checkAll() {
        checkCityRegister();
        checkWeddingProcess();
        checkStudent();
        chechChildren();
    }
    static void checkCityRegister() {
        System.out.println("Проверка в городском реестре населения");
    }
    static void checkWeddingProcess() {
        System.out.println("Проверка на статус семейного положения");
    }
    static void chechChildren() {
        System.out.println("Проверка на наличие детей");
    }
    static void checkStudent() {
        System.out.println("Проверка, что является студентом");
    }
}
