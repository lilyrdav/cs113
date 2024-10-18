public class Largest {

    public static int findIndexOfLargestValue(String[] args) {
        int max = Integer.parseInt(args[0]);
        int maxIndex = 0;
        for (int i = 1; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            if (value > max) {
                max = value;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        System.out.println(findIndexOfLargestValue(args));
    }
}