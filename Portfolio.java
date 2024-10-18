public class Portfolio {
    private BankAccount[] accounts;
    private String name;

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public Portfolio (BankAccount[] bankaccounts) {
        this.accounts = bankaccounts;
        this.name = "Anonymous";
    }

    public Portfolio (BankAccount[] bankaccounts, String name) {
        this.accounts = bankaccounts;
        this.name = name;
    }

    public double totalBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum += accounts[i].getBalance();
        }
        return sum;
    }
}