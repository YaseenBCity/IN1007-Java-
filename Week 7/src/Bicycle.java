public class Bicycle {
    int startCadence;
    int endCadence;
    int startGear;

    Bicycle(int startCadence, int endCadence, int startGear) {
        this.startCadence = startCadence;
        this.endCadence = endCadence;
        this.startGear = startGear;
    }

    void setendCadence(int endCadence) {
        this.endCadence = endCadence;
    }

    void getendCadence() {
        System.out.println(this.endCadence);
    }

    void getstartCadence() {
        System.out.println(this.startCadence);
    }
}