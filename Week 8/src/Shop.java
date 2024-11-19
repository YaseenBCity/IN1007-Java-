public class Shop {
    private String name;
    private int numberOfArticles;
    private int[] articles;

    Shop(String name, int numberOfArticles, int[] articles) {
        this.name = name;
        this.numberOfArticles = numberOfArticles;
        this.articles = articles;
    }
    Shop(){
        this.name = "shop open soon";
        this.numberOfArticles = 0;
        this.articles = new int[1];
    }


    public void getName(){
        System.out.println(this.name);
    }
    public void getNumberOfArticles(){
        System.out.println(this.numberOfArticles);
    }
    public void getArticles(){
        if (this.articles.length <= 1){
            System.out.println(this.name + " has less than 1 article");
        }else {
            for (int i = 0; i < this.numberOfArticles; i++) {
                System.out.println(this.articles[i]);
            }
        }
    }
    void setName(String name){
        this.name = name;
    }
    void setNumberOfArticles(int numberOfArticles){
        this.numberOfArticles = numberOfArticles;
    }
    void setArticles(int[] articles){
        this.articles = articles;
    }


}
