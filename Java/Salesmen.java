import java.util.Scanner;

// Custom exception class for invalid sales amount
class InvalidSalesAmountException extends Exception {
    public InvalidSalesAmountException(String message) {
        super(message);
    }
}

// Salesman class definition
class Salesman {
    private String name;
    private int salesmanCode;
    private double salesAmount;
    private double commission;

    // Constructor to initialize salesman attributes
    public Salesman(String name, int salesmanCode, double salesAmount) {
        this.name = name;
        this.salesmanCode = salesmanCode;
        this.salesAmount = salesAmount;
    }

    // Method to calculate commission based on sales amount
    public void calculateCommission() throws InvalidSalesAmountException {
        if (salesAmount < 0) {
            throw new InvalidSalesAmountException("Sales amount cannot be negative.");
        } else if (salesAmount < 2000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount >= 2000 && salesAmount <= 5000) {
            commission = salesAmount * 0.10;
        } else {
            commission = salesAmount * 0.12;
        }
    }

    // Method to display salesman information
    public void displayInfo() {
        System.out.println("Salesman Details:");
        System.out.println("Name: " + name);
        System.out.println("Salesman Code: " + salesmanCode);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Commission: $" + commission);
    }
}

public class Salesmen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for salesman details
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Salesman Code:");
        int salesmanCode = scanner.nextInt();
        System.out.println("Enter Sales Amount:");
        double salesAmount = scanner.nextDouble();

        try {
            // Create a salesman object
            Salesman salesman = new Salesman(name, salesmanCode, salesAmount);

            // Calculate commission
            salesman.calculateCommission();

            // Display salesman information
            salesman.displayInfo();
        } catch (InvalidSalesAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
