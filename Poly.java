//polymorphism means many forms 
//polymorphism is a feature of inheritance
//polymorphism is a mechanism in which a single function or method can take many forms.
//polymorphism is a feature of object oriented programming.
// it has two types: method overloading and method overriding
//method overloading is a feature of compile time polymorphism
//method overriding is a feature of run time polymorphism
//compile time polymorphism means the method is resolved at compile time.
//run time polymorphism means the method is resolved at run time.
class car{
    int price = 1000;
    void disp(){
        System.out.println(price);
    }
}
//method overriding means redefining the method of parent class in child class
class ford extends car{
    void disp(){
        System.out.println("Hello");
    }
}
//method overloading means defining multiple methods with same name but different parameters
class audi extends car{
    void disp(int p){
        price = p;
        System.out.println("Changed price : "+price);
    }
}
public class Poly {
    public static void main(String[] args){
    car c1 = new car();
    c1.disp();
    ford f1 = new ford();
    f1.disp();
    audi a1 = new audi();
    a1.disp(500);
    }
}