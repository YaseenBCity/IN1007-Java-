public class Exercise4 {
    public static void main(String[] args) {
        Line myLine = new Line(4);
        myLine.printLine();

        myLine.insertNumber(2,0);
        myLine.insertNumber(4,1);
        myLine.insertNumber(2,2);

        myLine.printLine();
        myLine.updateLine();
        System.out.println("Updated line");
        myLine.printLine();

    }
}
