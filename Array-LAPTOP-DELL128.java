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
   }
}