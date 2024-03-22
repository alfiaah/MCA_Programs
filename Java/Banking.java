class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited $" + amount + ". New balance: $" + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw $" + amount + " due to insufficient funds.");
        }
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class Banking {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        DepositThread depositThread1 = new DepositThread(account, 500);
        DepositThread depositThread2 = new DepositThread(account, 700);
        WithdrawThread withdrawThread1 = new WithdrawThread(account, 300);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
    }
}
