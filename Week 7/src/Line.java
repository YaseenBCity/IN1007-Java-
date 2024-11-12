public class Line {
    private int[] number;

    Line(int numbers) {
        this.number = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            this.number[i] = 0;
        }
    }

    void updateLine() {
        // Step 1: Merge identical non-zero numbers
        for (int i = 0; i < this.number.length - 1; i++) {
            // If two adjacent numbers are the same and non-zero, merge them
            if (this.number[i] != 0 && this.number[i] == this.number[i + 1]) {
                this.number[i] *= 2;  // Double the value in the first position
                this.number[i + 1] = 0;  // Set the next position to 0
            }
        }

        // Step 2: Move all non-zero elements to the left
        int[] newLine = new int[this.number.length];
        int index = 0;

        for (int i = 0; i < this.number.length; i++) {
            if (this.number[i] != 0) {
                newLine[index] = this.number[i];
                index++;
            }
        }

        // Step 3: Replace the original array with the rearranged one
        this.number = newLine;

        // Output the updated array and the update message
        for (int num : this.number) {
            System.out.print(num + " ");
        }
        System.out.println("Update command has been ran");
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
