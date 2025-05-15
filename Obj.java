class Calc{
    int price;
    String color;
    void add(int a , int b){
        System.out.println(a+b);
    }
}
class Obj{
    public static void main(String args[]){
        int a=10;
        Calc c1=new Calc();
        c1.price=400;
        c1.color="blue";
        System.out.println(c1.price);
        System.out.println(c1.color);
        c1.add(2,2);
        c1.sub
        Calc c2= new Calc();
        c2.price=500;
        c2.color="red";
        System.out.println(c2.price);
        System.out.println(c2.color);
        c2.add(4,4);
    }
}