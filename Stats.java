public class Stats {

    public static double[] readData(int n) {
        double[] a = new double[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = StdIn.readDouble();
        }
        return a;
    }

    public static void printData(double[] array) {
        for(int i = 0; i < array.length; i++) {
            StdOut.println(array[i]);
        }
    }

    public static double average(double[] array) {
        if(array.length == 0) {
            return 0;
        }
        double sum = 0;
        for(double n : array) {
            sum += n;
        }
        return sum / array.length; 
    }
}