import java .util.Random;
import java.util.Arrays;
class Arr1{
    public static void main(String args[]){
        Random r = new Random();
        int arr[] = new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        //jagged array
        int [][] arr1 = new int[3][];
        arr1[0] = new int[2]; // First row has 2 columns
        arr1[1] = new int[3]; // Second row has 3 columns
        arr1[2] = new int[4]; // Third row has 4 columns
       ///first for loop is for rows and second for columns
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j] = r.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        //2D array
        int [][] arr2 = new int[3][4];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j] = r.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr2));
    }
}