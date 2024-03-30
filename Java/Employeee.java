class Employee {
    public void display() {
        System.out.println("Name of class is Employee.");
    }

    public void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    @Override
    public void calcSalary() {
        System.out.println("Salary of employee is 20000");
    }
}

public class Employeee {
    public static void main(String[] args) {
        Employee employee = new Engineer(); // Using single object instantiation

        employee.display(); // Calls display() of Employee class
        employee.calcSalary(); // Calls calcSalary() of Engineer class due to polymorphism
    }
}
