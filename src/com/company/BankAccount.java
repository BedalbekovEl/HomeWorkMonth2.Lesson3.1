package com.company;

public class BankAccount {

    private static double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum1){
        System.out.println("Положить сумму");
        amount = sum1 + amount;
        return amount;
    }

    public int withDraw(int sum) {
        System.out.println("-----------------------------------");
        if (getAmount() > 0){
            if (getAmount() < sum){
                try {
                    throw new LimitException("Недостаточно средств, будет снято " + amount, 5);
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                }
                amount = getAmount() - amount;
            } else {
                System.out.println("Снимается сумма: " + sum);
                amount = getAmount() - sum;
            }

        }

        System.out.println("Остаток на счете");
        return (int) amount;
    }
}
