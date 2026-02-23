package Lesson1;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнено на " + amount + "\nТекущий баланс: " + balance);
        } else {
            System.out.println("Ошибка: Некорректная сумма пополнения");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        System.out.println("Cнято cо счета " + amount + "\nТекущий баланс: " + balance);
    } else {
        System.out.println("Некорректная сумма снятия");
    }
    }
        public void printBalance() {
            System.out.println("Владелец: " + owner);
            System.out.println("Текущий баланс: " + balance);
        }
}

