public class GCD {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]); 
        while (a != b) {
            if(a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        System.out.println("The GCD of" + args[0] + "and" + args[1] + "is" + a);
    }
}