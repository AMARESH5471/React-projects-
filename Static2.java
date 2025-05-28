class Book{
    int price;
    String author;
    static String genre;
    Book(int price, String author)
    {
        System.out.println("I am in constructor");
        this.price = price;
        this.author = author;
    }
    static
    {
        System.out.println("I am in static block");
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
        System.out.println("print method");
        System.out.println(this.price);
        System.out.println(this.author);
        System.out.println(genre);
    }
}
class Static2
{
    public static void main(String ar[])
    {
      System.out.println("hi");
      Book b1 = new Book (500,"abc");    
      Book b2 = new Book (1000,"def");
      b1.print();
      b2.print();
}
}