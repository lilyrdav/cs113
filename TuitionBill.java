public class TuitionBill {
    public static void main(String[] args) {
        int credits = Integer.parseInt(args[0]);
        double balance = Double.parseDouble(args[1]);
        boolean isExempt = Boolean.parseBoolean(args[2]);
        double total = balance;
        if((balance > 0) && (isExempt == false)) {
            total += (total * 0.10);
        }
        if(credits < 0) {
            System.out.println("Credits cannot be negative");
            System.exit(0);
        }
        else if(credits > 5) {
            System.out.println("Credits cannot be greater than 5");
            System.exit(0);
        }
        else if(credits == 1) {
            total += 8000;
        }
        else if(credits == 2) {
            total += 16000;
        }
        else if(credits == 3) {
            total += 21000;
        }
        else if(credits == 4) {
            total += 28000;
        }
        else if((credits == 5)) {
            total += 30000;
        }
        System.out.println("The total bill is $" + total);
    }
}