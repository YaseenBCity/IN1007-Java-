public class Line {
    private int[] number;

    Line(int numbers) {
        this.number = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            this.number[i] = 0;
        }
    }

    void updateLine(){
        for (int i = 1; i < this.number.length; i++) {
            int temp;
            if (i == 8){
                break;
            }
            if (number[i] == 0) {
                temp= this.number[i+1];
                this.number[i+1] = number[i];
                this.number[i] = temp;

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
