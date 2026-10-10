public class HostelMessWalletManagement {
    static class MessWallet {
        private double balance;
        public MessWallet(double b) {
            if (b < 0) { System.out.println("Warning: Negative opening balance. Initialized to 0."); balance = 0; }
            else balance = b;
        }
        public void topUp(double amt) {
            if (amt <= 0) System.out.println("Top-up rejected: amount must be greater than 0");
            else balance += amt;
        }
        public void deduct(double amt) {
            if (amt > balance) System.out.println("Deduct rejected: insufficient balance");
            else balance -= amt;
        }
        public double getBalance() { return balance; }
    }
    public static void main(String[] args) {
        MessWallet w = new MessWallet(500);
        w.topUp(200);
        System.out.println("Balance after top-up: " + w.getBalance());
        w.deduct(1000);
        System.out.println("Final balance: " + w.getBalance());
    }
}
