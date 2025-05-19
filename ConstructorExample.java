class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class ConstructorExample {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "george");
        Book b2 = new Book("1984", "George Orwell");
        b1.display();
        b2.display();
    }
}