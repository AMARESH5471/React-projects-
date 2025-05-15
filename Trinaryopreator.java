class Trinaryopreator{
        public static void main(String args[]){
        System.out.println("hello");
        int a=30,b=20,c=40;
        int res = (a<b) ? a:b;
        System.out.println(res);
        System.out.println("bye");
        int res1= (a>b && a>c) ? a:b;
        int res2=(a>b || a>c) ? a:b;
        int res3 =(a>b && b<c)?c:b;
        int res4=(a>b || b<c)?c:b;
        int res5=(a<b) ? (a>b) ? a : b :0;
        System.out.println(res5);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res1);
        System.out.println(res2);
        //short circuit operator
        int d=10;
        if(d++>=11 && ++d==12){
            System.out.println("pass");
        }
        else{
            System.out.println("failure");
        }
        
        int e=10;
        if(e++>=11 || ++e==12){
            System.out.println("pass");
        }
        else{
            System.out.println("failure");
        }
        System.out.println(e);
    }
}