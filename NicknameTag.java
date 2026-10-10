public class NicknameTag {
    static class NameTag {
        private final String firstName, lastName;
        public NameTag(String fullName) {
            String[] parts = fullName.trim().split(" ");
            this.firstName = parts[0];
            this.lastName = parts.length > 1 ? parts[1] : "";
        }
        public String getNickname() {
            return firstName + (lastName.isEmpty() ? "" : " " + lastName.charAt(0) + ".");
        }
    }
    public static void main(String[] args) {
        System.out.println(new NameTag("Maria Gomez").getNickname());
    }
}
