public class Buyer {
    private Shop shopToGo;
    private int[] articlesToBuy;

    Buyer(Shop shopToGo, int[] articlesToBuy) {
        this.shopToGo = shopToGo;
        this.articlesToBuy = articlesToBuy;
    }

    public Shop shopGet(){
        return this.shopToGo;
    }
    public int[] getArticlesToBuy(){
        return this.articlesToBuy;
    }
    public void setShop(Shop newshop){
        this.shopToGo = newshop;
    }
    public void setArticlesToBuy(int[] newarticles){
        this.articlesToBuy = newarticles;
    }

}
