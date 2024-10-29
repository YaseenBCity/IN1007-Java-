public class Exercise1 {
    public int numbers(int n){
        return ((4*n)+5);
    }
    public static void main(String[] args) {
        int result = new Exercise1().numbers(1245);
        System.out.println(result);
    }
}