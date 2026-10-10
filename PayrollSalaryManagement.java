public class PayrollSalaryManagement {
    static class PayrollAccount {
        private double basicSalary, bonus;
        public PayrollAccount(double basic) {
            this.basicSalary = Math.max(0, basic);
            this.bonus = 0.0;
        }
        public void creditBonus(double amount) {
            if (amount > 0) bonus += amount;
            else System.out.println("Bonus credit rejected: amount must be positive.");
        }
        public void deductTax(double percent) {
            if (percent >= 0 && percent <= 100) basicSalary -= (basicSalary * percent / 100.0);
            else System.out.println("Tax deduction rejected: invalid percent.");
        }
        public double getNetSalary() { return basicSalary + bonus; }
    }
    public static void main(String[] args) {
        PayrollAccount acc = new PayrollAccount(50000.0);
        acc.creditBonus(5000.0);
        acc.deductTax(10.0);
        System.out.println("Net Salary: " + acc.getNetSalary());
    }
}
