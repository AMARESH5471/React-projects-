//function overloading
//function overloading is a feature that allows a class to have more than one method with the same name
//but different parameters. The methods can have different number of parameters or different types of parameters.
//The return type of the method is not considered for overloading.  
//The method to be called is determined at compile time based on the number and type of arguments passed to the method.
//Function overloading is a compile time polymorphism.  
//Function overloading is used to increase the readability of the program.
//Function overloading is used to perform different operations with the same method name.

class Funcover{
    public static void add(int a, int b){
            System.out.println("Addition of two numbers is: "+(a+b));
        }
    public static void add(int a, int b, int c){
            System.out.println("Addition of three numbers is: "+(a+b+c));
        }
    public static void add(int a, double b){
            System.out.println("Addition of two numbers is: "+(a+b));
        }
    public static void add(double a, int b){
            System.out.println("Addition of two numbers is: "+(a+b));
        }
    public static void add(double a, double a){
        System.out.println("addition of two numbers is:"+(a+b));
    }
    public static void main(String args[]){
        add(10,20);
        add(10,20,30);
        add(10,20.5);
        add(10.5,20);
        add(10.5,20.5);
    }
}