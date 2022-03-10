package Model;

public class Transaction {

    private String type;
    private double amount;
    private Account accountDebit;
    private Account accountCredit;


    public Transaction(String type, double amount, Account accountDebit, Account accountCredit) {
        this.type = type;
        this.amount = amount;
        this.accountDebit = accountDebit;
        this.accountCredit = accountCredit;
    }

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getAccountDebit() {
        return accountDebit;
    }

    public void setAccountDebit(Account accountDebit) {
        this.accountDebit = accountDebit;
    }

    public Account getAccountCredit() {
        return accountCredit;
    }

    public void setAccountCredit(Account accountCredit) {
        this.accountCredit = accountCredit;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", accountDebit=" + accountDebit +
                ", accountCredit=" + accountCredit +
                '}';
    }
}
