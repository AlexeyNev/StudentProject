package Training.Training14;

public class BankAccount {
    int id;
    String name;
    double balance;
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Alex";
        myAccount.balance = 12.35;
        System.out.println(myAccount.name);
    }
}