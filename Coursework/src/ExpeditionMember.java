public class ExpeditionMember {
    private String name;
    private int studentID;
    static int member_counter = 0; //Initialise member_counter to 0

    //Constructor
    ExpeditionMember(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        member_counter ++;
    }

    //Getter and Setter methods
    public String getName(){
        return this.name;
    }
    public int  getID(){
        return this.studentID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

}
