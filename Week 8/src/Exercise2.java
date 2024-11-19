import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        int[] myArray = {1,2,3,4,5,6};
        Shop myShop2 = new Shop("bunugsstore",3,myArray);

        myShop.getName();
        myShop2.getName();
        System.out.println(Arrays.toString(myShop.getArticles()));
        myShop2.decrement(4);
        System.out.println(Arrays.toString(myShop2.getArticles()));

        boolean result = myMethod(myShop2);
        System.out.println(result);

        int[] myArray2 = {2,1,6};
        Buyer myBuyer = new Buyer(myShop2,myArray2);

        myMethod2(myBuyer);

    }
    public static boolean myMethod(Shop shop) {
        if (shop.getArticles().length == shop.getNumberOfArticles()) {
            return true;
        } else {
            return false;
        }
    }

    public static void  myMethod2(Buyer buyer){
        int[] array = buyer.getArticlesToBuy();
        System.out.print("The buyer wants to buy: ");
        System.out.println(Arrays.toString(array));

        System.out.println("The Shop currently has: ");
        System.out.println(Arrays.toString(buyer.shopGet().getArticles()));

        for (int i = 0; i < array.length; i++) {
            buyer.shopGet().decrement(array[i]);
        }

        System.out.println("The shop now has: ");
        System.out.print(Arrays.toString(buyer.shopGet().getArticles()));
    }


}
