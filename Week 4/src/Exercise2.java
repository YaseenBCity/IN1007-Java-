import java.util.Scanner;
public class Exercise2 {
    public static int total;
    public static void main(String[] args) {
       int n;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter an Integer");
       n = sc.nextInt();

       for (int i =0; i <n+1; i++){
           total = total + i;
       }
       System.out.println(total);
    }
}
