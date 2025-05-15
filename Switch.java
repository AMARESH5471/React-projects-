class Switch{
    public static void main(String args[]){
        System.out.println("hii");
        int day=2;
        char ab ='+';
        switch (day){
            case 1:
                {
                    System.out.println("monday");
                    break;
                }
            case 2:
                {
                    System.out.println("tuesday");
                    break; //takes you out of 2 immediate blocks 
                }
            case 3:
                {
                    System.out.println("sunday");
                    break;
                }
            default :
            {
                System.out.println("invalid input");
                break;
            }
        }
        switch (ab){
            case '+':
            {
                int x=2,y=3;
                System.out.println("addition :"+(x+y));
                break;
            }
            case '-':
            {
                int x=3,y=2;
                System.out.println("sub:"+(x-y));
                break;
            }
            case '*' :
            {
                int x=2,y=3;
                System.out.println("mul:"+(x*y));
                break;
            }
            case '/':
            {
                int x=4,y=2;
                System.out.println("div:"+(x/y));
                break;
            }
            default :
            {
                System.out.println("invalid input");
                break;
            }
        }
        int m=1;
        switch(m){
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                {
                System.out.println("this month has 31 days ");
                break;
                }
            case 2:
            {
                System.out.println("this month has 28 days ");
                break;
            }
            case 4: 
            case 6: 
            case 9: 
            case 11:
            {
                System.out.println("this month has 30 days");
                break;
            }
            default :
            {
                System.out.println("invalid month ");
            }
        }
    }
}