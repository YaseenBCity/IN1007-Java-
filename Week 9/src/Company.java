public class Company {
    private String name;
    static int numberOfEmployees = 0;
    private Employee[] listOfEmployees;

    Company(String name, Employee[] listOfEmployees) {
        this.name = name;
        numberOfEmployees++;
        this.listOfEmployees = listOfEmployees;
    }

    public String getName() { return this.name; }
    public int getNumberOfEmployees() { return this.numberOfEmployees; }
    public Employee[] getEmployees() { return this.listOfEmployees; }
    //Setters
    public void setName(String name) { this.name = name; }
    public void setNumberOfEmployees(int newNumberOfEmployees) { this.numberOfEmployees = newNumberOfEmployees; }

}
