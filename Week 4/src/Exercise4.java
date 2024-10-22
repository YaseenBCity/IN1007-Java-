import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);

        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

        System.out.print("Enter text : ");
        s = sc.nextLine().toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            if (months[i].equals(s)) {
                System.out.println(i+1);
            }
        }

    }
}
