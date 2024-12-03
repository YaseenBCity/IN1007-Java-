public class Exercise1and2 {
    public static void main(String[] args) {
        ChristmasGift myGift1  = new ChristmasGift("Money", 500, "abc");
        ChristmasGift myGift2  = new ChristmasGift("Laptop", 800, "def");
        ChristmasGift myGift3  = new ChristmasGift("Phone", 5, "ghi");
        ChristmasGift myGift4  = new ChristmasGift("Headphones", 250, "jkl");

        MyChristmasList theList = new MyChristmasList();
        theList.addToList(myGift1);
        theList.addToList(myGift2);
        theList.addToList(myGift3);
        theList.addToList(myGift4);
        printOut(theList);
        System.out.println(mostExpensive(theList));

        //Start of ex2
        MapToPrice myMap = new MapToPrice();
        myMap.addGift(myGift1);
        myMap.addGift(myGift2);
        myMap.addGift(myGift3);
        myMap.addGift(myGift4);
        //Testing of containV method
        if(contntainV(myMap, 800)== true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        myMap.printNames(100);

    }
    public static void printOut(MyChristmasList list) {
        for(int i = 0; i< list.getMyList().size();i++){
            System.out.println(list.getMyList().get(i).getRecipient());
        }
    }
    public static int mostExpensive(MyChristmasList list) {
        int mostExpensive = 0;
        for(int i = 0; i< list.getMyList().size();i++){
            if(list.getMyList().get(i).getPrice() > mostExpensive){
                mostExpensive = list.getMyList().get(i).getPrice();
            }
        }
        return mostExpensive;
    }
    public static boolean contntainV(MapToPrice m, int i) {
        if(m.getTheMap().containsValue(i)){
            return true;
        }
        return false;
    }
}
