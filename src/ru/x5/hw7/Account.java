package ru.x5.hw7;

public class Account {
    private int id;
    private String holder;
    private int amount;

    public int getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Account(int id, String holder, int amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{ id=" + id + ", holder='" + holder + '\'' +", amount=" + amount +'}';
    }
}
