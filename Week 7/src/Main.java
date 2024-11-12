public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(0,100,5);
        bike.setendCadence(50);
        bike.getendCadence();
        bike.getstartCadence();

        Bicycle bike2 = new Bicycle(50,2,1);
        bike2.getstartCadence();
    }
}
