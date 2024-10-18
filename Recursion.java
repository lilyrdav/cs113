public class Recursion {

    public static void main(String[] args) {
        printArray(args, 0);
    }

    public static void printArray(String[] A, int i) {
        if (i < A.length) {
            System.out.println(A[i]);
            printArray(A, i + 1);
        }
    }
}