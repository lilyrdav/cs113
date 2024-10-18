public class Arrival {
    public static void main(String[] args) {
        double h = Integer.parseInt(args[0]);
        double m = Integer.parseInt(args[1]);
        double d = Integer.parseInt(args[2]);
        double s = Integer.parseInt(args[3]);
        double t = d / s * 60;
        m = m + t;
        System.out.println(m);
        h = h + m / 60;
        System.out.println(h);
        m = m % 60;
        h = h % 24;
        System.out.println((int)h + ":" + (int)m);
    }
}