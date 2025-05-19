class Book {
    String title;
    String author;
    int pages;
    void setDetails(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    int getPages() {
        return pages;
    }
    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
class Lib {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        b1.setDetails("Java Basics", "John Smith", 250);
        b2.setDetails("Python Guide", "Alice Brown", 300);
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPages());
        System.out.println(b2.getTitle());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getPages());
        b1.showDetails();
        b2.showDetails();
    }
}