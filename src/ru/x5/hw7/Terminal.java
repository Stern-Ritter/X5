package ru.x5.hw7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Terminal {
    private static BankingService bs;
    private static Scanner sc;

    public static void main(String[] args) {
        showMenu();
        startSevice();
    }

    public static void showMenu(){
        System.out.println("Введите одну из следующих команд:");
        System.out.println("balance [id] – вывеси информацию о счёте,");
        System.out.println("withdraw [id] [amount] – снять указанную сумму,");
        System.out.println("deposite [id] [amount] – внести на счет указанную сумму,");
        System.out.println("transfer [from] [to] [amount] - перевести сумму с одного счета на другой.");
        System.out.println("Для выходы введите exit.");
    }

    public static void startSevice(){
        bs = new BankingService();
        Scanner sc = new Scanner(System.in);
        String str = null;
        List<String> params = new ArrayList<>();
        while (!(str = sc.nextLine()).equals("exit")){
            params.clear();
            try {
                StringTokenizer stok = new StringTokenizer(str, " ");
                while (stok.hasMoreTokens()) {
                    params.add(stok.nextToken());
                }
                switch (params.get(0)){
                    case "balance" :
                        bs.balance(Integer.parseInt(params.get(1)));
                        break;
                    case "withdraw" :
                        bs.withdraw(Integer.parseInt(params.get(1)), Integer.parseInt(params.get(2)));
                        break;
                    case "deposite" :
                        bs.deposit(Integer.parseInt(params.get(1)), Integer.parseInt(params.get(2)));
                        break;
                    case "transfer" :
                        bs.transfer(Integer.parseInt(params.get(1)), Integer.parseInt(params.get(2)), Integer.parseInt(params.get(3)));
                        break;
                    default:
                        System.out.println("Некорректная комманда.");
                }
            } catch (UnknownAccountException ex){
                System.out.println("Некорректно указан номер счета.");
            } catch (IllegalArgumentException ex){
                System.out.println("Некорректное значение суммы.");
            } catch (NotEnoughMoneyException ex){
                System.out.println("Недостаточно денег на счёте.");
            } catch (Exception ex){
                System.out.println("Некорректная команда.");
            }
        }
    }
}
