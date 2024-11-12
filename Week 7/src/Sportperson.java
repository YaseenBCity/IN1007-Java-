public class Sportperson {
    String name;
    int age;
    String sport;

    Sportperson(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    void incrementAge(){
        this.age++;
        System.out.println(this.name + "'s new age is " + this.age);
    }
}
