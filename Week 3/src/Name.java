import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        int y, b, a;
        boolean checker;
        checker = true;
        boolean expression;

        System.out.println("Yaseen Barlas");

        Scanner sc = new Scanner (System.in);
        System.out.println("What is the current Year ?");
        y = sc.nextInt();
        System.out.println("What is the your birth year ");
        b = sc.nextInt();

        a = y -b;
        System.out.println("Your age is: " + a);

        while (checker == true){
            System.out.println("Enter a problem");
            expression = sc.next();
            System.out.println(expression);

            if (expression.equals("stop")){
                checker = false;
            }
        }

    }
}
