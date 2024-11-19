public class Shop {
    private String name;
    private int numberOfArticles;
    private int[] articles;

    Shop(){
        this.name = "shop open soon";
        this.numberOfArticles = 0;
        this.articles = new int[1];
        System.out.println("Welcome to the new shop");
    }

    Shop(String name, int numberOfArticles, int[] articles) {
        this.name = name;
        this.numberOfArticles = numberOfArticles;
        this.articles = articles;
        System.out.println("Welcome to the new shop");
    }



    public void getName(){
        System.out.println(this.name);
    }
    public int getNumberOfArticles(){
        return this.numberOfArticles;
    }
    public int[] getArticles(){
        if (this.articles.length <= 1){
            return this.articles;
        }else {
            return this.articles;

        }
    }
    void setName(String name){
        this.name = name;
    }
    void setNumberOfArticles(int numberOfArticles){
        if (numberOfArticles >= 0){
            this.numberOfArticles = numberOfArticles;
        }
    }
    void setArticles(int[] articles){
        for (int i = 0; i < this.numberOfArticles; i++) {
            if (articles[i] >= 0){
                this.articles[i] = articles[i];
            }
        }
    }

    void decrement(int i){
        if (i >= 0 && i < this.articles.length) {
            this.articles[i]--;
        } else {
            System.out.println("Index out of bounds");
        }
    }



}
