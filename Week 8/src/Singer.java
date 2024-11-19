public class Singer {
    private String name;
    private int age;
    private boolean professional;

    Singer(String name, int age) {
        this.name = name;
        this.age = age;
        this.professional = true;
    }

    void getName(){
        System.out.println(name);
    }
    void getAge(){
        System.out.println(age);
    }
    public boolean getProfessional(){
        return professional;
    }

    void setAge(int age){
        if (age >= this.age){
            this.age=age;
        }else{
            System.out.println("Invalid Age entered");
        }
    }
    void reverseProfessional(){
        this.professional=!this.professional;
    }

    public boolean isAdult(){
        return this.age>=18;
    }


}
