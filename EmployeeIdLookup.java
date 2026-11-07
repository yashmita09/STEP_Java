import java.util.*;

/**
 * Problem 4: Employee ID Lookup in an Unsorted Directory
 * Frequent lookups on unsorted pairs -> HashMap provides O(1) query time.
 * Build Time: O(n), Query Time: O(1), Space: O(n)
 */
public class EmployeeIdLookup {
    public static class Record {
        String empId;
        String department;
        public Record(String empId, String department) {
            this.empId = empId;
            this.department = department;
        }
    }

    public static Map<String, String> buildLookup(List<Record> records) {
        Map<String, String> lookup = new HashMap<>();
        for (Record r : records) {
            lookup.put(r.empId, r.department);
        }
        return lookup;
    }

    public static String getDepartment(Map<String, String> lookup, String employeeId) {
        return lookup.getOrDefault(employeeId, "Unknown");
    }

    public static void main(String[] args) {
        List<Record> records = Arrays.asList(
            new Record("E245", "Finance"),
            new Record("E110", "Engineering"),
            new Record("E390", "Marketing"),
            new Record("E101", "Engineering")
        );
        Map<String, String> lookup = buildLookup(records);
        System.out.println(getDepartment(lookup, "E390")); // Marketing
        System.out.println(getDepartment(lookup, "E999")); // Unknown
    }
}
