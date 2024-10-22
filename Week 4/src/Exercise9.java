import java.util.Scanner;

public class Exercise9 {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        while (n !=1 ){
            if (n % 2 ==0){
                n = n/2;
                System.out.println(n);
            }else {
                n = (n*3)+1;
                System.out.println(n);
            }
        }
    }
}
