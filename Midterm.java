public class Midterm {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        for(int n = start; n <= end; n++) {
            if(n % 2 == 0) {
                System.out.println(n + " ");
            }
        }
    }
}