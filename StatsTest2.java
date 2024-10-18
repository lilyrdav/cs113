public class StatsTest2 {

    public static void main(String[] args) {
        double[] nums = new double[args.length];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Double.parseDouble(args[i]);
        }

        StdOut.printf("The mean is %.2f\n", Stats.average(nums));
        
    }
}