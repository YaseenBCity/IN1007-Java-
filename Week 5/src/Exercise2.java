import java.lang.Math;
import java.util.Scanner;

public class Exercise2 {
    public int arithmeticMean(int a, int b) {
        return (a + b) / 2;
    }
    public double geometricMean(double a, double b) {
        double ab = a*b;
        return Math.sqrt(ab);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        Exercise2 ex = new Exercise2();
        double ar = ex.arithmeticMean((int)a, (int)b);
        double ge = ex.geometricMean(a, b);
        System.out.println("Arithmetic mean: " + ar);
        System.out.println("Geometric mean: " + ge);
    }
}