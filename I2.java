class Car{
  void start(){
    System.out.println("Car started");
  }
}
class Car2 extends Car{
    void drive(){
        System.out.println("Car is moving");
    }
}
class Car3 extends Car2{
    void stop(){
        System.out.println("Car stopped");
    }
}
class Car4 extends Car{
    void park(){
        System.out.println("Car parked");
    }
}
class ca1{
    void add(int a,int b){
        System.out.println("Addition of two numbers is: "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("Subtraction of two numbers is: "+(a-b));
    }
}
class ca2 extends ca1{
    void add(int a,int b,int c){
        System.out.println("Addition of three numbers is: "+(a+b+c));
    }
    void sub(int a,int b){
        System.out.println("subtraction of two numbers is: "+((a-b)*2));
    }
}
class I2{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Car2 c2 = new Car2();
        c2.start();
        c2.drive();
        Car3 c3 = new Car3();
        c3.start();
        c3.drive();
        c3.stop();
        Car4 c4 = new Car4();
        c4.start();
        c4.park();
        //method overloading
        ca2 c12 = new ca2();
        c12.add(10,20,30);
        c12.add(10,20);
        //method overriding
        ca2 c13 = new ca2();
        c13.sub(30,20);
    }
}