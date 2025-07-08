import java.util.*;

class Complex {
    int real;
    int imag;

    // Constructor
    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Addition
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    // Subtraction
    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    // Multiplication
    public static Complex product(Complex a, Complex b) {
        int realPart = (a.real * b.real) - (a.imag * b.imag);
        int imagPart = (a.real * b.imag) + (a.imag * b.real);
        return new Complex(realPart, imagPart);
    }

    // Display
    public void printComplex() {
        if (real == 0 && imag == 0) {
            System.out.println("0");
        } else if (real == 0) {
            System.out.println(imag + "i");
        } else if (imag == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, 3);

        Complex sum = add(c1, c2);
        Complex diff = diff(c1, c2);
        Complex prod = product(c1, c2);

        System.out.print("Sum: ");
        sum.printComplex();

        System.out.print("Difference: ");
        diff.printComplex();

        System.out.print("Product: ");
        prod.printComplex();
    }
}
