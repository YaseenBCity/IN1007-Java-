import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise5 {
    public int arithmeticMean(int[] list) {
        int total = 0; // Initialize total
        for (int k = 0; k < list.length; k++) { // Loop through all elements
            total += list[k];
        }
        total = total / list.length; // Compute the mean
        return total;
    }
    public double geometricMean(int[] list) {
        double total = 1.0; // Use double for total to handle large products
        for (int k = 0; k < list.length; k++) {
            total *= list[k];
        }
        double exp = 1.0 / list.length; // Ensure exp is a double
        return Math.pow(total, exp); // Return the result of total^(1/length)
    }


    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        do {
            System.out.println("Enter a number: ");
            list[count] = sc.nextInt();
            count++;
        } while (count < size);

        Exercise5 ex = new Exercise5();
        System.out.println("Array elements: " + Arrays.toString(list));
        System.out.println("Arithmetic Mean: " + ex.arithmeticMean(list));
        System.out.println("Geometric Mean: " + ex.geometricMean(list));
        sc.close();
    }
}
