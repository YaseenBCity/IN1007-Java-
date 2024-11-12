public class Exercise3 {
    public static void main(String[] args) {
        Student newStudent = new Student("bungus", 123);
        newStudent.updateMarks(1,21);
        newStudent.returnMarks();


        Student studentA = new Student("afh", 101);
        Student studentB = new Student("gwqhu", 102);

        Group group = new Group(studentA, studentB);
        group.displayGroupInfo();
    }
}
