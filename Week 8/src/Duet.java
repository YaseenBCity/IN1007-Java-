public class Duet {
    private Singer singer1;
    private Singer singer2;

    Duet(Singer singer1,Singer singer2 ) {
        this.singer1 = singer1;
        this.singer2 = singer2;
    }

    public Singer getSinger1() {
        return singer1;
    }
    public Singer getSinger2() {
        return singer2;
    }

    public void setSinger1(Singer singer1) {
        this.singer1 = singer1;
    }
    public void setSinger2(Singer singer2) {
        this.singer2 = singer2;
    }

    public boolean bothProfessional(){
        return this.singer1.getProfessional() && this.singer2.getProfessional() ;
    }



}

//
//public class SubClass{
//    SuperClass nameofobject; //Create variables using the super classes method
//
//    //Constructor
//    SubClass(Superclass nameofobject){
//        this.nameofobject = nameofobject;
//    }
//
//    //Any other methods
//    void displayWhatever(){
//        System.out.println(nameofobject.Superclassvariable);
//    }
//
//
//}
//