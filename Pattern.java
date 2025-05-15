// class Pattern{
//     public static void main(String args[]){
//         for(int i=0;i<=5;i++){
//             for(int j=0;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// This code prints a 5x5 grid of asterisks.
// The outer loop (i) controls the number of rows, and the inner loop (j) controls the number of columns.  
// The inner loop prints an asterisk for each column in the current row, and the outer loop moves to the next line after each row is printed.
// The output will look like this:
// ******

class Pattern{
    public static void main(String args[]){
        int a[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for (int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(a[i][j]+",");
            }
            System.out.println();
        }
    }
}