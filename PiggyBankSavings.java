public class PiggyBankSavings {
    static class PiggyBank {
        private final String id;
        private double savings;
        public PiggyBank(String id) { this.id = id; this.savings = 0.0; }
        public void deposit(double amt) {
            if (amt > 0) savings += amt;
        }
        public void withdraw(double amt) {
            if (amt > 0 && amt <= savings) savings -= amt;
            else System.out.println("Withdrawal of " + amt + " rejected");
        }
        public double getSavings() { return savings; }
    }
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100); System.out.println("Savings: " + pb.getSavings());
        pb.withdraw(30); System.out.println("Savings: " + pb.getSavings());
        pb.withdraw(500); System.out.println("Savings: " + pb.getSavings());
    }
}
