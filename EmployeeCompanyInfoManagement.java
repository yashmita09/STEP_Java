public class EmployeeCompanyInfoManagement {
    static class Employee {
        String empName; double salary;
        static String companyName = "Bright Horizon Technologies";
        static int employeeCount = 0;
        public Employee(String n, double s) {
            empName = n; salary = s; employeeCount++;
        }
        public static void printCompanyInfo() {
            System.out.println(companyName);
            System.out.println("Employees on record: " + employeeCount);
        }
    }
    public static void main(String[] args) {
        new Employee("Aarav", 50000);
        new Employee("Diya", 60000);
        new Employee("Kabir", 55000);
        System.out.println("3 Employee objects created");
        Employee.printCompanyInfo();
    }
}
