import java.util.Scanner;
public class Exercise3 {
    public static int total;
    public int method(int n){
        for (int i = 1; i <= n; i++){
            total = total + i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Exercise3 ex = new Exercise3();
        if (n >=0){
            System.out.println(ex.method(n));
        }
        sc.close();
    }
}
