package staticfinal;

class Employee {

    static String companyName = "TechNova Pvt Ltd";
    private static int totalEmployees = 0;

    private String name;
    private String designation;

    private final int id;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;

        totalEmployees++; 
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("----------------------------");
    }
}



public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Navam", 201, "Software Engineer");
        Employee e2 = new Employee("Aman", 202, "Backend Developer");
        Employee e3 = new Employee("Riya", 203, "HR Executive");

        System.out.println("Company Name (Static): " + Employee.companyName);

        Object obj = e1;

        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            emp.displayDetails();
        } else {
            System.out.println("Object is not an Employee!");
        }

        e2.displayDetails();
        e3.displayDetails();

        Employee.displayTotalEmployees();
    }
}
