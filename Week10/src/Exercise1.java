import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        ChristmasGift myGift1  = new ChristmasGift("money", 500, "abc");
        ChristmasGift myGift2  = new ChristmasGift("laptop", 800, "abdi");
        ChristmasGift myGift3  = new ChristmasGift("phone", 5, "osas");

        MyChristmasList theList = new MyChristmasList();
        theList.addToList(myGift1);
        theList.addToList(myGift2);
        theList.addToList(myGift3);
        printOut(theList);
        System.out.println(mostExpensive(theList));

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
}
