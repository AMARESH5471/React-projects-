//call by value means that the value of the variable is passed to the function
// and any changes made to the parameter inside the function do not affect the original variable.
//call by reference means that the reference of the variable is passed to the function
// and any changes made to the parameter inside the function affect the original variable.
class Call {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("\nAfter Swap:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Before Swap:");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        swap(arr, 0, 3);
    }
}