public class Line {
    private int[] number;

    Line(int numbers) {
        this.number = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            this.number[i] = 0;
        }
    }

    void updateLine(){
        for (int i = 0; i < this.number.length; i++) {
            if (number[i] != 0) {
                this.number[i] += number[i];
            }
        }
    }
    void printLine(){
        for (int i = 0; i < this.number.length; i++) {
            System.out.print(this.number[i] + " ");
        }
    }

    void insertNumber(int num, int pos){
        this.number[pos] = num;
    }

}
