package ru.x5.hw7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankingService implements AccountService {
    private final static String DB_FILE_PATH = "C:\\Java\\X5P\\Accounts.txt";
    private List<Account> accounts;

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        connectToFile();
        Account required = findAccountById(accountId);
        if (required == null) {
            throw new UnknownAccountException();
        } else if (amount < 0) {
            throw new IllegalArgumentException();
        } else if (required.getAmount() < amount) {
            throw new NotEnoughMoneyException();
        } else {
            changeAccountBalance(required, -amount);
            write(accounts);
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        connectToFile();
        Account required = findAccountById(accountId);
        if(required == null){
            throw new UnknownAccountException();
        } else {
            System.out.println("Пользователь: " + required.getHolder() + " Баланс: " + required.getAmount());
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        connectToFile();
        Account required = findAccountById(accountId);
        if (required == null) {
            throw new UnknownAccountException();
        } else if (amount < 0) {
            throw new IllegalArgumentException();
        } else {
            changeAccountBalance(required, amount);
            write(accounts);
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        connectToFile();
        Account sender = findAccountById(from);
        Account recipient = findAccountById(to);
        if(sender == null || recipient == null){
            throw new UnknownAccountException();
        } else if (amount < 0) {
            throw new IllegalArgumentException();
        }else if(sender.getAmount() < amount){
            throw new NotEnoughMoneyException();
        } else {
             changeAccountBalance(sender, -amount);
             changeAccountBalance(recipient, amount);
             write(accounts);
        }
    }

    private Account findAccountById(int id){
        Account required = null;
        for (Account a : accounts){
            if(a.getId() == id){
                required = a;
                break;
            }
        }
        return required;
    }

    private void changeAccountBalance(Account account, int amount){
        account.setAmount(account.getAmount() + amount);
    }
    private void connectToFile(){
        try {
            accounts = read();
        } catch (IOException e) {
            System.out.println("File is unavailable.");
        }
    }

    private List<Account> read() throws IOException {
        File file = new File(DB_FILE_PATH);
        if(!file.exists()){
            fillTestValues();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(DB_FILE_PATH))) {
            String str;
            List<Account> result = new ArrayList<>();
            while((str = reader.readLine()) != null) {
                String[] arr = str.split(";");
                result.add( new Account(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])));
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private void write(List<Account> accounts) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(DB_FILE_PATH))) {
            for (Account a : accounts) {
                writer.println(a.getId() + ";" + a.getHolder() + ";" + a.getAmount());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fillTestValues(){
        List<Account> testValues = new ArrayList<>();
        Collections.addAll(testValues, new Account(1, "Ivan", 20000),
                new Account(2, "Fedor", 15000), new Account(3, "Alexandr", 17000),
                new Account(4, "Diana", 23500), new Account(5, "Anna", 11200),
                new Account(6, "Sergey", 55000), new Account(7, "Irina", 77000),
                new Account(8, "Marina", 33100), new Account(9, "Roman", 34100),
                new Account(10, "Georgi", 3450));
        write(testValues);
    }
}
