import java.util.Scanner;
class Book {
    //  (Encapsulation)
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        if (title == null ) {
            System.out.println("Invalid title.");
            this.title = "Unknown";
        } else {
            this.title = title;
        }
        if (author == null ) {
            System.out.println("Invalid author");
            this.author = "Unknown";
        } else {
            this.author = author;
        }
        if (price <= 0) {
            System.out.println("Invalid price.");
            this.price = 100.0;
        } else {
            this.price = price;
        }
    }
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Book b1 = new Book(title, author, price);
        b1.displayDetails();
    }
}