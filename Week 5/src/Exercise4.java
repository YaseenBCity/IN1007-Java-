import java.util.Scanner;
public class Exercise4 {
    public static int total = 1;
    public int method(int n){
        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        if (n==0){
            total = 0;
        }
        if (n<=0){
            for (int i =-1; i>=n; i--){
                total = total *i;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Exercise4 ex = new Exercise4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The product of 1 to " + n + " is: " + ex.method(n));
        sc.close();
    }
}
