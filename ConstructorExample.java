
//constructor overloading
// Constructor overloading is a feature in Java that allows a class to have more than one constructor with different parameter lists.
// It is used to create objects with different initial values.
class Book {
    String title;
    String author;
    String pages;
    
    Book(String title, String author, String pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = "Unknown";
    }
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.pages = "Unknown";
    }
    Book() {
        this.title = "hello";
        this.author = "hii";
        this.pages = "900 pages";
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
class ConstructorExample {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "george","300 pages");
        Book b2 = new Book("1984", "George Orwell", "328 pages");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b4 = new Book("The Great Gatsby");
        Book b5 = new Book();
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}