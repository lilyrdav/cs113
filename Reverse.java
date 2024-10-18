public class Reverse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = 0;
        while(n != 0) {
            int d = n % 10;
            r *= 10;
            r += d;
            n /= 10;
        }
        System.out.println(r);
    }
}