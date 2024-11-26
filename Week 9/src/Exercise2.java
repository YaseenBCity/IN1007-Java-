public class Exercise2 {
    public static void main(String[] args) {
        Job manager = new Job("manager", 3000);
        Employee[] myarr = new Employee[5];
        Company myCompany = new Company("mycompany",myarr);
        Employee yaseen = new Employee("Yaseen",manager, myCompany);
        yaseen.addEmployee(yaseen,myarr);
        myMethod(myCompany);
    }
    public static void myMethod(Company company) {
        Employee[] newarr = company.getEmployees();
        for (int i = newarr.length -1; i > 0; i--) {
            if (newarr[i] == null) {
                break;
            } else {
                System.out.println(newarr[i].getJob().getWage());
            }
        }
    }
}
