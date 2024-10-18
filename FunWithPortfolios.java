public class FunWithPortfolios {
    public static double getLastBalance (Portfolio p) {
        if (p.getAccounts().length == 0) {
            return 0;
        }
        else {
            return p.getAccounts()[p.getAccounts().length - 1].getBalance();
        }
    }
}