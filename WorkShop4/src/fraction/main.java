//@author Nguyen Van Tu HE194905
package Fraction;
public class main {

   public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2); // 1/2
        Fraction f2 = new Fraction(2, 3); // 2/3

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // Addition
        Fraction resultAdd = f1.add(f2);
        System.out.println("f1 + f2 = " + resultAdd);

        // Subtraction
        Fraction resultSub = f1.subtract(f2);
        System.out.println("f1 - f2 = " + resultSub);

        // Multiplication
        Fraction resultMul = f1.multiply(f2);
        System.out.println("f1 * f2 = " + resultMul);

        // Division
        Fraction resultDiv = f1.divide(f2);
        System.out.println("f1 / f2 = " + resultDiv);
    }

}