package Model;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String name;
    private int id;
    private Double balance;
    private boolean active;

    private List<Transaction> listTransactions = new ArrayList<>();

    public Account(String name, int id, Double balance, boolean active) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.active = active;
    }

    public Account(String name, int id, Double balance, boolean active, List<Transaction> listTransactions) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.active = active;
        this.listTransactions = listTransactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Transaction> getListTransactions() {
        return listTransactions;
    }

    public void setListTransactions(List<Transaction> listTransactions) {
        this.listTransactions = listTransactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", active=" + active +
                ", listTransactions=" + listTransactions +
                '}';
    }
}
