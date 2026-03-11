package problem3;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sa1 = new SavingsAccount(101, 2.5); 
        CheckingAccount ca1 = new CheckingAccount(201, 3);  

        bank.openAccount(sa1);
        bank.openAccount(ca1);

        sa1.deposit(1000);
        ca1.deposit(500);

        ca1.withdraw(100);
        ca1.deposit(50);
        ca1.deposit(25); 

        System.out.println("\nBefore: ");
        bank.printAllAccounts();

        bank.update();

        System.out.println("\nAfter");
        bank.printAllAccounts();
    }
}