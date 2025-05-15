class Test{
public static void main(String args[])
{
    System.out.println("hii amaresh good morning from 4i apps and solution");
    int a=10, b = 20, c=30,d=40;
    System.out.println("this is addition:"+ (a+b));
    System.out.println("this is subraction:"+(a-b));
    System.out.println("this is  multiplication:"+(a*b));
    System.out.println("this is division:"+(a/b));
    System.out.println("this is mod:"+(a%b));
    System.out.println("\nbubye");
    System.out.println(a!=b);
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a==b);
    System.out.println(a<=b);
    System.out.println(a>=b);
    System.out.println(a=b);
    System.out.println(a==b && c!=d);
    System.out.println(!(a==b) && !(c!=d));
    System.out.println(a==b || c==d);
    System.out.println(!(a==b && c!=d));
    int f=10;
   //++f;//f++//f+=1'//
    int marks=75;
    if(marks>=90 && marks<=100)
    {
      System.out.println("grade a");
    }
    else if (marks>=80 && marks<90)
    {
      System.out.println("grade b");
    }
    else if (marks>=70 && marks<80)
    {
      System.out.println("grade c");
    }
    else if (marks>=0 && marks<70)
    {
      System.out.println("fail");
    }
    else 
    {
      System.out.println("Invalid marks");
    }

   int ab=25,ba=40,ca=50;
   if(ab>ba && ba>ca)
   {
    System.out.println("ab is grater");
   }
   else if(ba>ca && ca>ab)
   {
     System.out.println("ba is grater");
   }
   else{
    System.out.println("ca is grater");
   }
}
}