class Calc2{
    int price;
    String color;
    void setter (int p , String c){
        price=p;
        color=c;
    }
    int getprice(){
        return price;
    }
    String getcolor(){
        return color;
    }
    void getter(){
        System.out.println(price);
        System.out.println(color);
    }
}
class Lib{
    String title;
    String author;
    int pages;
    
}
class Obje{
    public static void main(String args[]){
     Calc2 c1= new Calc2();
     Calc2 c2 = new Calc2();
     c2.setter(500,"red");
     c1.setter(400,"blue");
     System.out.println(c1.getprice());
     System.out.println(c1.getcolor());
     System.out.println(c2.getprice());
     System.out.println(c2.getcolor());
     c1.getter();
     c2.getter();
    }
}