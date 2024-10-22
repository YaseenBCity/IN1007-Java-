import java.util.Scanner;

public class UserEntryInteger{
    public static void main(String[] args){
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        n1 = sc.nextInt();
        System.out.print("Enter another integer: ");
        n2 = sc.nextInt();

        if (n1> n2){
            System.out.println("Greater");
        }else{
            System.out.println("Smaller or Equal");
        }
    }
}