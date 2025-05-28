class Book{
    void disp(){
        System.out.println("Disp method");
    }
    void print(){
        System.out.println("printing");
    }
}
 
public class anonymousObject {
    public static void main(String[] args) {
        new Book().disp();
        new Book().print();
    }
}