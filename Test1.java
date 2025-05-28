class Parent extends Object {
    // The Parent class implicitly extends Object, so we can omit "extends Object"
    // However, for clarity, we can explicitly state it.
    // Constructors in Java are not inherited, so we need to define a constructor for Parent.
    Parent(){
        //is super() mandatory here?
        // Yes, super() is mandatory if the parent class does not have a no-argument constructor.
        //if it has parameterized constructor, then super() must be called with appropriate arguments.
        // If the parent class has a no-argument constructor, it is called implicitly.
        // If the parent class has a parameterized constructor, you must explicitly call it using super(arguments).
        //why super is invoked in the constructor?
        // The super() call is used to invoke the constructor of the parent class.
        // This is necessary to ensure that the parent class is properly initialized before the child class constructor executes.
        // If you do not call super(), the compiler will automatically insert a call to the no-argument constructor of the parent class.
        super(); // Calls the Object constructor
        // super(); is optional here as it is called implicitly
        System.out.println("Parent constructor called");
    }
    Parent(int x){
        super(); // Calls the Object constructor
        System.out.println("Parent parameterized constructor called with value: " + x);
    }
}
class Child extends Parent{
    Child(){
        super(5); // Calls the Parent constructor
        // super(); is optional here as it is called implicitly
        System.out.println("Child constructor called");
    }
    Child(int x){
        //optional: super(); // Calls the Parent constructor
        // If you want to call the no-argument constructor of the Parent class, you can use super().
        this(); // Calls the no-argument Child constructor
        // this(); is optional here as it is called implicitly
        // If you want to call a parameterized constructor, you can use super(x) to call the Parent constructor with an argument.
        System.out.println("Child parameterized constructor called with value: " + x);
    }
}
class Test1{
    public static void main(String args[]){
        System.out.println("Main method started");
        Child c = new Child(5);
        System.out.println("Child object created");
    }
}