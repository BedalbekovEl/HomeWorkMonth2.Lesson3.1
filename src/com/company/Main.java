package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.deposit(20000.0));

        for (int i = 0; ; i++) {
            System.out.println(bankAccount.withDraw(6000));
            if (bankAccount.getAmount() <= 0) {
                break;
            }
        }
    }
}
