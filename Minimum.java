public class Minimum {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        int s1 = min(a, b);
        int s2 = min(c, d);

        System.out.println(s1 + s2);
    }

    public static int min(int x, int y) {
        int minimum;
        if (x < y) minimum = x;
        else minimum = y;
        return minimum;
    }
}