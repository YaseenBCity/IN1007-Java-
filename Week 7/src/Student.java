public class Student {
    String name;
    int IDNumber;
    int[] marks;

    Student(String name, int IDNumber) {
        this.name = name;
        this.IDNumber = IDNumber;
        this.marks = new int[]{0,0,0,0,0,0,0,0,0,0};
    }

    void updateMarks(int index, int newmark){
        this.marks[index] = newmark;
    }
    void returnMarks(){
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 40){
                System.out.println(marks[i]);
            }
        }
    }
}
