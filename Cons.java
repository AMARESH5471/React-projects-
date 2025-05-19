
// This program demonstrates the use of constructors in Java.
// It defines a class Calc3 with a constructor that initializes the price and color of an object.
//non parameterized constructor or default constructor
// The main method creates two objects of Calc3 and displays their properties.
//default constructor means no argument constructor 
// It is a constructor that does not take any parameters.
// It is called when an object of the class is created.
// The default constructor initializes the object with default values.
// If no constructor is defined in the class, Java provides a default constructor.
// If a constructor is defined, Java does not provide a default constructor.
// The default constructor is used to initialize the object with default values.
// The default constructor is called when an object of the class is created.
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//parameterized constructor
// A constructor that takes parameters is called a parameterized constructor.
// It is used to initialize the object with specific values.
// The parameterized constructor is called when an object of the class is created with arguments.
// The parameterized constructor is used to initialize the object with specific values.
class Calc3{
    int price;
    String color;
    Calc3(int p, String c) {
        price=p;
        color=c;
    }
    void display() {
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}
class Cons{
    public static void main(String[] args) {
        // Create a new Calc3 object
        Calc3 c1 = new Calc3( 500, "red");
        Calc3 c2 = new Calc3( 400, "blue");
        c1.display();
        c2.display();
    }
}