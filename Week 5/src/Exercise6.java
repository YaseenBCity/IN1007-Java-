import java.util.Scanner;
public class Exercise6 {
    public static void triangle1(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle2(int n) {
        for (int i =n; i>0;i--){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle3(int n) {
        int start = n*2;
        for (int i= start; i>0;i-=2){
            for (int space = 0; space < (start - i) / 2; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle4(int n) {
        Exercise6 ex = new Exercise6();
        ex.triangle1(n);
        ex.triangle2(n);
        ex.triangle3(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your triangle:");
        int n = sc.nextInt();
        Exercise6 ex = new Exercise6();
        System.out.println("Triangle 1:");
        ex.triangle1(n);
        System.out.println("Triangle 2:");
        ex.triangle2(n);
        System.out.println("Triangle 3:");
        ex.triangle3(n);
        System.out.println("Triangle 4:");
        ex.triangle4(n);

        sc.close();
    }
}
