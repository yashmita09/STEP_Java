public class LockerCodeManager {
    static class Locker {
        private final int lockerNumber;
        private String combination;
        public Locker(int num, String initialCode) {
            this.lockerNumber = num; this.combination = initialCode;
        }
        public boolean changeCode(String currentCode, String newCode) {
            if (this.combination.equals(currentCode)) {
                this.combination = newCode;
                return true;
            }
            return false;
        }
        public int getLockerNumber() { return lockerNumber; }
    }
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        System.out.println("Change 1234 -> 5678: " + (l.changeCode("1234", "5678") ? "success" : "rejected"));
        System.out.println("Change 0000 -> 9999: " + (l.changeCode("0000", "9999") ? "success" : "rejected"));
    }
}
