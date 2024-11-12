public class Car {
    private String model;
    private int speed;
    private double milage;

    Car(String model, int speed, double milage) {
        this.model = model;
        this.speed = speed;
        this.milage = milage;
    }
    void getModel(){
        System.out.println(model);
    }
    void updateSpeed(int speed) {
        this.speed = speed;
    }
    void updateMileage(double milage) {
        this.milage = milage;
    }

}
