package problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account opened: " + acc.getAccountNumber());
    }

    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                break;
            }
        }
        System.out.println("Account closed: " + accNumber);
    }

    public void update() {
        for (Account a : accounts) {
            if(a instanceof SavingsAccount sa) {
            	sa.addInterest();
            }
            else if (a instanceof CheckingAccount ca) {
               ca.deductFee();
            }
        }
    }

    public void printAllAccounts() {
        for (Account a : accounts) {
            a.print();
        }
    }
}