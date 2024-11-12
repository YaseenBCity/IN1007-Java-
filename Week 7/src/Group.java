public class Group {
    Student student1;
    Student student2;

    Group(Student student1, Student student2) {
        this.student1 = student1;
        this.student2 = student2;
    }

    public Student getStudent1() {
        return student1;
    }

    public Student getStudent2() {
        return student2;
    }
    public void displayGroupInfo() {
        System.out.println("Group contains the following students:");
        System.out.println("Student 1: " + student1.name + ", ID: " + student1.IDNumber);
        System.out.println("Student 2: " + student2.name + ", ID: " + student2.IDNumber);
    }
}
