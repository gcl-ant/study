package apr06;

import java.util.PrimitiveIterator;

public class Book {
    private String bookName;
    private String author;
    private double price;
    private int salesRanking;

    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public boolean judgeBestSellers(int ranking){
        salesRanking = ranking;
        if(salesRanking >= 0 && salesRanking <= 50){
            return true;
        }else {
            return false;
        }
    }

}
