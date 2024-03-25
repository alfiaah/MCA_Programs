import java.util.Scanner;
class Account 
{
    private String accountHolderName;
    private int accountNumber;
    private String address;
    private String accountType;
    private double balance;
    // Constructor with parameters for initializing name, account number, and initial amount
    public Account(String accountHolderName, int accountNumber, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }
    // Constructor with parameters for initializing name, account number, address, type, and balance
    public Account(String accountHolderName, int accountNumber, String address, String accountType, double balance) 
   {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.address = address;
        this.accountType = accountType;


        this.balance = balance;
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } 
        else 
       {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    // Method to get the current balance
    public double getBalance() 
   {
        return balance;
    }
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        // Input for first type of account (with initial amount)
        System.out.println("Enter account holder's name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter account number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter initial amount:");
        double initialAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Account account1 = new Account(name1, number1, initialAmount);
        // Input for second type of account (with address, type, and balance)
        System.out.println("Enter account holder's name:");
        String name2 = scanner.nextLine();
        System.out.println("Enter account number:");
        int number2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter account type:");
        String type = scanner.nextLine();
        System.out.println("Enter current balance:");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Account account2 = new Account(name2, number2, address, type, balance);
        // Performing operations on accounts
        System.out.println("Initial balances:");
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        // Depositing to account 1
        System.out.println("Enter amount to deposit into Account 1:");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        // Withdrawing from account 2
        System.out.println("Enter amount to withdraw from Account 2:");
        double withdrawAmount = scanner.nextDouble();
        account2.withdraw(withdrawAmount);

        // Displaying updated balances
        System.out.println("Updated balances:");
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        scanner.close();
    }
} 
