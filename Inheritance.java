//inheritance in java means acquiring the properties of one class into another class.
// Inheritance is a mechanism in which one class acquires the properties of another class.
// The class which inherits the properties of another class is called the subclass or child class.
// The class whose properties are inherited is called the superclass or parent class.
// Inheritance is used to achieve runtime polymorphism.
// Inheritance is a way to achieve reusability in Java.
// Inheritance is a mechanism in which one class acquires the properties of another class.
//parent class is mobile is also called base class or super class
//child class is mobile2_0 is also called derived class or sub class
//child class is mobile3_0
//types of inheritance
//1. single inheritance means one class inherits the properties of another class. 
// diagram of single inheritance a -> b
//a is parent class and b is child class
//2. multilevel inheritance means one class inherits the properties of another class and that class inherits the properties of another class.
//diagram of multilevel inheritance a -> b - > c
//a is parent class and b is child class and c is child class of b
//3. hierarchical inheritance means one class inherits the properties of another class and that class is parent of multiple classes.
//diagram of hierarchical inheritance a -> b, a -> c
//a is parent class and b and c are child classes
//4. multiple inheritance means one class inherits the properties of multiple classes.
//diagram of multiple inheritance a -> b, b -> c
//a, b are parent classes and c is child class of b
//multiple inheritance is not supported in java
//because it leads to ambiguity.
//for example if class a has method m1() and class b has method m1() and class c inherits both a and b then which method will be called.
//5. hybrid inheritance means combination of multiple inheritance and multilevel inheritance.
//diagram of hybrid inheritance a -> b, a -> c, b -> d
//a is parent class and b and c are child classes and d is child class of b

class Mobile{
    void call()
    {
        System.out.println("Calling...");
    }
}
class Mobile2_0 extends Mobile{
//method overriding means redefining the method of parent class in child class
//method overriding is used to achieve runtime polymorphism
//method overriding is a feature of inheritance
//method overriding is a mechanism in which a subclass provides a specific implementation of a method that is already defined in its superclass.
//when a method in a subclass has the same name, same parameters, and same return type as a method in its superclass, it is called method overriding.
//when a subclass overrides a method, it provides its own implementation of the method.
    void call()
    {
        System.out.println(" Wifi Calling...");
    }
    void plays(){
        System.out.println("Playing...");
    }
//method overloading means defining multiple methods with same name but different parameters
//method overloading is a feature of inheritance
//method overloading is a mechanism in which two or more methods in the same class have the same name but different parameters.
//when a method has the same name but different parameters, it is called method overloading.
//when a method is overloaded, the compiler determines which method to call based on the number and type of arguments passed to the method.
    void call(int a){
        System.out.println("Calling with int parameter...");
    }
}
class Inheritance{
    public static void main(String[] args) {
        
        Mobile m1= new Mobile();
        m1.call();
        Mobile2_0 m2=new Mobile2_0();
        m2.call();
        m2.plays();
        
    }
}