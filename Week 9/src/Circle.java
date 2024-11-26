public class Circle {
    private int radius;
    static final double pi = 3.14;
    private static int numberOfCircles = 0;
    private static double totalSurface = 0;

    Circle() {
        this.radius = 1;
        numberOfCircles++;
        totalSurface += pi * this.radius *this.radius;
    }

    Circle(int radius) {
        this.radius = radius;
        numberOfCircles++;
        totalSurface += pi * this.radius * this.radius;
    }

    public int getRadius() {return radius;}

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
    private double surfaceArea() {
        return (this.radius * this.radius * pi);
    }
    public static int getNumberOfCircles() {return numberOfCircles;}
    public static void setNumberOfCircles(int newNumberOfCircles) { numberOfCircles = newNumberOfCircles; }
    public static double getTotalSurface() {return totalSurface;}
    public static void setTotalSurface(double newSurface) { totalSurface = newSurface; }
}
