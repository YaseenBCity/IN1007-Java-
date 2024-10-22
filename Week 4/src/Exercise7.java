import java.util.Scanner;
import java.util.ArrayList;
public class Exercise7 {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter a new number:");
            t = sc.nextInt();
            list.add(t);
        }
        System.out.println("This is the reverse of the list:");
        for (int j=list.size()-1; j>=0; j--){
            if (j==0){
                System.out.print(list.get(j));

            }else{
                System.out.print(list.get(j) + ",");
            }
        }
    }
}
