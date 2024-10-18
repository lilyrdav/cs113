public class FunWithFundss {
    public static void main(String[] args) {
        Funds f1 = new Funds("fund 1", 1000);
        Funds f2 = new Funds("fund 2", 8000);
        f1.donate(250);
        f2.donate(1000);
        f2.donate(4000);
        StdOut.println(closerToGoal(f1, f2));
    }

    public static String closerToGoal(Funds a, Funds b) {
        String closerToGoal = "";
        if ((a.getGoal() - a.getAmountPledged()) < (b.getGoal() - b.getAmountPledged())) {
            closerToGoal = a.name;
        }
        else closerToGoal = b.name;
        return closerToGoal;
    }
} 