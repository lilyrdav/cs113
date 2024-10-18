public class StatsTest {

    public static void main(String[] args) {
        int n = StdIn.readInt();
        double[] data = Stats.readData(n);
        Stats.printData(data);
        double average = Stats.average(data);
        StdOut.printf("Average: %.3f", average);
    }
    
}