public class Exercise1 {
    public static void main(String[] args) {
        Singer bungus = new Singer("bungus",39);

        if (bungus.isAdult()==true){
            System.out.println("Adult");
        }

        Singer Chris = new Singer("Chris",34);
        Singer Maria = new Singer("Maria",30);

        Duet duet1 = new Duet(Chris,Maria);
        Singer osas = new Singer("Osas",22);
        Duet duet2 = new Duet(bungus,osas);
        Quatuor band = new Quatuor(duet1,duet2);
        band.getDuet2().getSinger1().getName();
    }
}
