import java.util.ArrayList;

public class ChristmasGift {
    private String name;
    private int price;
    private String recipient;

    ChristmasGift(String name, int price, String recipient) {
        this.name = name;
        this.price = price;
        this.recipient = recipient;
    }

    public String getName() { return this.name; }
    public int getPrice() { return this.price; }
    public String getRecipient() { return this.recipient; }
    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }
    public void setRecipient(String recipient) { this.recipient = recipient; }


}
