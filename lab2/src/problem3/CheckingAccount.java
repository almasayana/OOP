package problem3;

public class CheckingAccount extends Account {
    private int transactionCount;          
    private final int FREE_TRANSACTIONS;  
    private final double FEE_PER_EXTRA = 0.02;

    public CheckingAccount(int accNumber, int freeTransactions) {
        super(accNumber);
        this.FREE_TRANSACTIONS = freeTransactions;
        this.transactionCount = 0;
    }
    
    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        int extra = transactionCount - FREE_TRANSACTIONS;
        if (extra > 0) {
            double fee = extra * FEE_PER_EXTRA;
            super.withdraw(fee);
        }
        transactionCount = 0; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Transactions this period: " + transactionCount;
    }
}