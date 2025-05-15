class Func{
    public static void add() {
        int a = 10, b = 20;
        int c = a + b;
        System.out.println("Addition (No Param, No Return): " + c);
    }
     public static int subtract() {
        int c = 20, d = 10;
        return c - d;
    }
    public static void multiply(int e, int f) {
        int g = e * f;
        System.out.println("Multiplication (With Param, No Return): " + g);
    }
    public static double divide(int h, int i) {
        if (i != 0) {
            return (double) h / i;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
    public static double divides(int j, int k) {
        if (k != 0) {
            return (double) j / k;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
    public static void main(String args[]) {
        add();  // Function call for addition
        int res = subtract();  // Function call for subtraction
        System.out.println("Subtraction (No Param, With Return): " + res);
        multiply(5, 4);  // Function call for multiplication
        double res1 = divide(20, 4);  // Function call for division
        System.out.println("Division (With Param, With Return): " + res1);
        double res2 = divides(20, 5);  // Function call for division
        System.out.println("Division (With Param, With Return): " + res2);
    }
}