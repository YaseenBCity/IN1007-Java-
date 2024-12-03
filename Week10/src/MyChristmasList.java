import java.util.ArrayList;

public class MyChristmasList {
    private ArrayList<ChristmasGift> myList;

    MyChristmasList() { myList = new ArrayList<ChristmasGift>(); }
    public ArrayList<ChristmasGift> getMyList() { return myList; }
    public void setMyList(ArrayList<ChristmasGift> myList) { this.myList = myList; }

    public void addToList(ChristmasGift o) {
        myList.add(o);
    }
}
