public class Exercise2 {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        int[] myArray = {1,2,3};
        Shop myShop2 = new Shop("bunugsstore",3,myArray);

        myShop.getName();
        myShop2.getName();
        myShop.getArticles();
    }
}
