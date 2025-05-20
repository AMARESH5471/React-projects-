//what is static in java
// Static keyword in Java is used for memory management mainly.
// It can be applied to variables, methods, blocks and nested classes.
// Static variables are shared among all instances of a class.
// Static methods can be called without creating an instance of a class.
// Static blocks are used for static initializations of a class.
// Static nested classes are static members of the outer class.
class Book{
    int price;
    String author;
    String title;
    static String genre;
    Book(int price, String author, String title){
        this.price=price;
        this.author=author;
        this.title=title;
    }
    void display(){
        System.out.println("Price: " + this.price);
        System.out.println("Author: " + this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Genre: " + this.genre);
    }
}
class Static{
    public static void main(String args[]){
        Book b1 = new Book(500, "John", "Java Basics");
        Book.genre = "fiction";
        // Static variable can be accessed using the class name
        Book b2 = new Book(400, "Alice", "Python Guide");
        b1.display();
        b2.display();
    }
}