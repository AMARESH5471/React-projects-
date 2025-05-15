class Array{
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        for (int i=0;i<=4;i++){
          System.out.print(a[i]+",");
        }
        System.out.println();
     int b[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
     };
     for (int m=0;m<=2;m++){
        for(int n=0;n<=2;n++){
            System.out.print(b[m][n]+",");
        }
        System.out.println();
     }
     int c[]={10,20,30,40,50};
     int d[]={0,0,0,0,0};
     for (int i=0;i<=4;i++){
        d[i]=c[i];
     }
     for (int i=0;i<=4;i++){
        System.out.print(d[i]+",");
     }
    
    int d={90,80,70};
    int e={60,50,40};
    int f={0,0,0,0,0,0};
    for (int i=0,i<3;i++){
      f[i]=d[i];
    }
    for(int j=0;j<3;j++){
      f[i++]=e[j];
    }
    for(int k=0;k<6;k++){
      System.out.print(f[k]+",");
    }
    int h[]={1,2,3,4,5};
      int sum=0;
      for (int i=0;i<h.length;i++){
         sum=sum+h[i];
      }
      System.out.println("Sum of elements in array is: "+sum);
      //missing elements in array
     
       int a[] = {1,2,3,4,6,7,8};
        int n=a.length;
        int sumOfa =0;
        for(int i=0;i<a.length;i++){
            sumOfa = sumOfa+a[i];
        }
        int x= a.length+1;
        int sumOfN=(x*(x+1))/2;
        System.out.print("Missing value:" + (sumOfN-sumOfa));
   }
}