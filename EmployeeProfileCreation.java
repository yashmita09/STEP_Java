public class EmployeeProfileCreation {
    static class Employee {
        String empId, empName;
        double salary;
        boolean isIntern;
        public Employee(String id, String name, double sal) {
            empId = id; empName = name; salary = sal; isIntern = false;
        }
        public Employee(String id, String name) {
            this(id, name, 0.0);
            isIntern = true;
        }
        public void printProfile() {
            System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
        }
    }
    public static void main(String[] args) {
        new Employee("E-101", "Divya", 65000.0).printProfile();
        new Employee("E-102", "Arjun").printProfile();
    }
}
