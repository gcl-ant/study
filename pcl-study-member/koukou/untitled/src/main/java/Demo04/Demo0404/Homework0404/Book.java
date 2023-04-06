package Demo04.Demo0404.Homework0404;

public class Book {
    String bookName;
    String author;
    int price;
    public Book(String bookName,String author,int price){
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
    public void Hot(int sales){
        if (sales >= 1000){
            System.out.println("暢銷");
        } else {
            System.out.println("");
        }
    }
}
class Sales{
    public static void main(String[] args) {
        Book book1 = new Book("AAA","aaa",1200);
        Book book2 = new Book("BBB","bbb",1000);
        Book book3 = new Book("CCC","ccc",800);

        book1.Hot(1000);
        book2.Hot(800);
        book3.Hot(1200);
    }
}