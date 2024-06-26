class Complex {
    private float real;
    private float imaginary;

    // Constructor
    Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Function to add two complex numbers
    Complex sum(Complex other) {
        float sumReal = this.real + other.real;
        float sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    // Function to display the complex number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class TwoFive{
    public static void main(String[] args) {
        // Create three complex number objects
        Complex c1 = new Complex(2.5f, 3.7f);
        Complex c2 = new Complex(1.2f, -4.1f);
        Complex c3;

        // Set values in c1 and c2 objects
        System.out.println("First complex number:");
        c1.display();
        System.out.println("Second complex number:");
        c2.display();

        // Call sum() to calculate the sum and assign it to c3
        c3 = c1.sum(c2);

        System.out.println("Sum of the two complex numbers:");
        c3.display();
    }
}
