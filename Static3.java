class Book{
    int price;
    String author;
    static String genre;
    Book(int price, String author)
    {
        System.out.println("constructor");
        this.price = price;
        this.author = author;
    }
    static
    {
        System.out.println("Static block");
        genre = "fiction";
    }
    static void disp(Book b)
    {
        System.out.println("disp method");
        System.out.println(b.price);
        System.out.println(b.author);
        System.out.println(genre);
    }
    void print()
    {
        System.out.println("Print method");
        System.out.println(this.price);
        System.out.println(this.author);
        System.out.println(genre);
    }
}
class Static3
{
    public static void main(String ar[])
    {
      System.out.println("hi");
      Book b1 = new Book (600,"Rajesh");    
      Book b2 = new Book (800,"Rahul");
      b1.print();
      b2.print();
      Book.disp(b1);
      Book.disp(b2);
}
}