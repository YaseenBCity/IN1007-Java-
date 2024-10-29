import java.util.Scanner;
public class Exercise7 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        for (int i = 0; i<=5; i++){
            System.out.println(new Exercise7().fib(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("What Fn do you want");
        int n = sc.nextInt();
        System.out.println(new Exercise7().fib(n));
    }
}

