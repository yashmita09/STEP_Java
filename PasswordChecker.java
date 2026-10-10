public class PasswordChecker {
    static class Checker {
        private final String password;
        public Checker(String password) {
            this.password = (password == null) ? "" : password;
        }
        public String getStrength() {
            int len = password.length();
            if (len < 6) return "Weak";
            else if (len <= 9) return "Medium";
            else return "Strong";
        }
    }
    public static void main(String[] args) {
        System.out.println(new Checker("pass").getStrength());
        System.out.println(new Checker("mypass12").getStrength());
        System.out.println(new Checker("mySuperSecret10").getStrength());
    }
}
