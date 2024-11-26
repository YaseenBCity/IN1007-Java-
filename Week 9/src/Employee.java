public class Employee {
    private String name;
    private Job job;
    private Company company;

    public Employee(String name, Job job, Company company) {
        this.name = name;
        this.job = job;
        this.company = company;
    }
    //Getter
    public String getName() { return this.name; }
    public Job getJob() { return this.job; }
    public Company getCompany() { return this.company; }

    //Setter
    public void setName(String name) { this.name = name; }
    public void setJob(Job job) { this.job = job; }
    public void setCompany(Company company) { this.company = company; }

    public Employee[] addEmployee(Employee e, Employee[] t) {
        t[t.length-1] = e;
        return t;
    }
}
