import java.util.HashMap;

public class MapToPrice {
    private HashMap<ChristmasGift, Integer> theMap;

    MapToPrice() {
        theMap = new HashMap<ChristmasGift, Integer>();
    }

    public HashMap<ChristmasGift, Integer> getTheMap() {
        return theMap;
    }
    public void setTheMap(HashMap<ChristmasGift, Integer> theMap) {
        this.theMap = theMap;
    }
    public void addGift(ChristmasGift gift) {
        this.theMap.put(gift, gift.getPrice());
    }

    public void printNames(int i) {
        for (ChristmasGift gift : theMap.keySet()) {
            if(theMap.get(gift) > i) {
                System.out.println(gift.getName());
            }
        }
    }
}
