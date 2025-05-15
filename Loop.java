//entry check is for and while loop
//exit check is do-while loop
//for loop is used when the number of iterations is known
//while loop is used when the number of iterations is not known
//do-while loop is used when the number of iterations is not known and the loop must be executed at least once
//example of do-while loop is menu driven program 
//for loop parameters are initialization, condition, increment/decrement
// i in for loop used as an index variable
//while loop parameters are initialization is done before the start of execution where  condition in the while loop and increment/decrement is done in the body of the loop,
class Loop{
    public static void main(String args[]){
    for(int i=0;i<=20;i++){
        System.out.println("amaresh"+i);
    }
    int j=0;
    while(j<=20){
        System.out.println("amaresh"+j);
        j++;
    }
    int k=0;
    do{
        System.out.println("amaresh"+k);
        k++;
    }while(k<=20);
    //exception ++ operator in for loop ++m for odd number and m++ for even number if m=0;
    int m;
    for(m=0;m<=10;++m){
        System.out.println(m++);
    }
    int n=1;
    for(;;){
        if(n<=10){
            System.out.println(n++);
            break;//to avoid infinite loop and output is 1 and it will break the loop and exit the loop
        }
    }
    //infinite loop
    for(int x=1;x<=3;x++){
        for(int y=1;y<=3;y++){
            System.out.println("x="+x+"y="+y);
        }
    }
    
}
}