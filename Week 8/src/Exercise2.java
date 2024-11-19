public class Exercise2 {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        int[] myArray = {1,2,3};
        Shop myShop2 = new Shop("bunugsstore",3,myArray);

        myShop.getName();
        myShop2.getName();
        myShop.getArticles();
        myShop2.decrement(0);
        myShop2.getArticles();

        boolean result = myMethod(myShop2);
        System.out.println(result);

    }
    public static boolean myMethod(Shop shop) {
        if (shop.getArticles().length == shop.getNumberOfArticles()) {
            return true;
        } else {
            return false;
        }
    }

    public void  myMethod2(Buyer buyer){


    }


}
