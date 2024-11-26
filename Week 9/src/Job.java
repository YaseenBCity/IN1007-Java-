public class Job {
    private String name;
    private int wage;

    Job(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }
    public String getName() { return this.name; }
    public int getWage() { return this.wage; }

    //Setter
    public void setWage(int wage) { this.wage = wage; }
    public void setName(String name) { this.name = name; }
}
