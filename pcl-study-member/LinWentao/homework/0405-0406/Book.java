package D0405题目;

public class Book {
    private String title;
    private String author;
    private double price;
    private int monthsales;

    public Book(String title, String author, double price, int monthsales) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.monthsales = monthsales;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getmonthsales() {
        return monthsales;
    }

    public boolean isBestSeller() {
        // 假设一个月销售超过50万册的书为畅销书
        if(monthsales > 500000){
            return true;
        }else {
            return false;
        }

    }
}
