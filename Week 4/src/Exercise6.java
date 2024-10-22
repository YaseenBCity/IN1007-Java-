import java.util.Scanner;
public class Exercise6 {
    public static int total;
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers you want : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter a new number:");
            int a = sc.nextInt();
            if (i % 2 ==1){
                total = total+a;
            }else{
                total = total-a;
            }
        }
        System.out.println(total);
    }
}
