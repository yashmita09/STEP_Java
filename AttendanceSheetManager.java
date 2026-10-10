public class AttendanceSheetManager {
    static class AttendanceSheet {
        private final String[] presentStudents;
        private int count = 0;
        public AttendanceSheet(int maxStudents) {
            this.presentStudents = new String[Math.max(1, maxStudents)];
        }
        public void markPresent(String name) {
            if (name == null || isPresent(name)) return;
            if (count < presentStudents.length) presentStudents[count++] = name;
        }
        public boolean isPresent(String name) {
            for (int i = 0; i < count; i++) if (presentStudents[i].equals(name)) return true;
            return false;
        }
        public int getPresentCount() { return count; }
    }
    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana"); sheet.markPresent("Ben"); sheet.markPresent("Ana");
        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Is Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Is Chen present: " + sheet.isPresent("Chen"));
    }
}
