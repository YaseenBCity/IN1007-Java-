import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        String teacher, student;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a TA:");
        teacher = sc.nextLine();
        System.out.print("Enter a student:");
        student = sc.nextLine();

        System.out.print("Dear" + teacher + "\n" + "I enjoy your tutorials" + "\n" + student);


    }
}
