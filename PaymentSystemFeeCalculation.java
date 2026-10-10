import java.util.*;

public class PaymentSystemFeeCalculation {
    abstract static class PaymentTransaction {
        double amount;
        public PaymentTransaction(double a) { this.amount = a; }
        abstract String getType();
        abstract double calculateAdjustedAmount();
    }
    static class CardPayment extends PaymentTransaction {
        public CardPayment(double a) { super(a); }
        String getType() { return "CARD"; }
        double calculateAdjustedAmount() { return amount * 1.02; }
    }
    static class WalletPayment extends PaymentTransaction {
        public WalletPayment(double a) { super(a); }
        String getType() { return "WALLET"; }
        double calculateAdjustedAmount() { return amount * 1.01; }
    }
    static class BankTransferPayment extends PaymentTransaction {
        public BankTransferPayment(double a) { super(a); }
        String getType() { return "BANKTRANSFER"; }
        double calculateAdjustedAmount() { return amount; }
    }
    public static void main(String[] args) {
        List<PaymentTransaction> list = Arrays.asList(
            new CardPayment(1000),
            new WalletPayment(500),
            new BankTransferPayment(2000)
        );
        double total = 0;
        for (PaymentTransaction p : list) {
            double adj = p.calculateAdjustedAmount();
            total += adj;
            System.out.printf(Locale.US, "%s: %.2f%n", p.getType(), adj);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
