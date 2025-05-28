// class  Outer
// {
//     int a;
//     void dips()
//     {
//         System.out.println("Displaying Outer...");
//     }
//     static class Inner
//     {
//         int b;
//         void print()
//         {
//             System.out.println("Printing Inner...");
//         }
//     }
// }
// public class Test3 {
//     public static void main(String[] args)
//     {
//         Outer outer = new Outer();
//         outer.a = 10;
//         outer.disps();
//         Outer.Inner inner = new Outer.Inner();
//         inner.b = 20;
//         inner.print();
//         System.out.println("Outer a: " + outer.a);
//         System.out.println("Inner b: " + inner.b);
//     }
// }

// class Abc
// {
//     void disp()
//     {
//         System.out.println("Displaying....");
//     }
// }
// public class Test3
// {
//     public static void main(String[] args)
//     {
//         Abc obj1 = new Abc();
//         obj1.disp();
//         Abc obj2 = new Abc();
//         obj2.disp();
//         Abc obj3 = new Abc()
//         {
//             void disp()
//             {
//                 System.out.println("Printing...");
//             }
//         };
//         obj3.disp();
//         Abc obj4 = new Abc();
//         obj4.disp();
//     }  
// }
// class Payment
// {
//     void pay()
//     {
//         System.out.println("Paying using Universal Payments....");
//     }
// }
// class UPIPay extends Payment
// {
//     void pay()
//     {
//         System.out.println("Paying using UPI Payments....");
//     }
// }
// class Cards extends Payment
// {
//     void play()
//     {
//         System.out.println("Paying using Cards Payments....");
//     }
// }
// public class Test3
// {
//     public static void main(String[] args)
//     {
//         Cards obj = new Cards();
//         obj.pay();
//         UPIPay obj1 = new UPIPay();
//         obj1.pay();
//         Payment r = new Payment();
//         r.pay();
//         Payment r1 = new Cards();    // dynamic method dispatch
//         r1.pay();
//         r1 = new UPIPay();
//         r1.pay();
//         // Payment r2 = new UPIPay();
//         // r2.pay();
//     }
// }

// Abstract class & method
 
abstract class Animal
{
    void eat()
    {
        System.out.println("Eating....");
    }
    abstract void sound();
    abstract void swim();
}
abstract class Dog extends Animal
{
    void sound()
    {
        System.out.println("Barking....");
    }
    abstract void swim();
}
class Lab extends Dog
{
    void swim()
    {
        System.out.println("Swimming....");
    }
}
 
public class Test3
{
    public static void main(String[] args)
    {
        Lab d1 = new Lab();
        d1.eat();
        d1.sound();
        d1.swim();
    }
}