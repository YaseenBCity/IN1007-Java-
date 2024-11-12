public class Exercise4 {
    public static void main(String[] args) {
        Line myLine = new Line(8);
        myLine.printLine();

        myLine.insertNumber(2,0);
        myLine.insertNumber(4,1);
        myLine.insertNumber(2,2);
        myLine.insertNumber(8,3);
        myLine.insertNumber(2,5);
        myLine.insertNumber(2,7);

        System.out.println("After Insert");
        myLine.printLine();

        myLine.updateLine();
        System.out.println("Updated line");
        myLine.printLine();
    }
}
