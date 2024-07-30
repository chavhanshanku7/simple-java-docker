// EmployeeGreeting.java
class Employee {
    private String name;

    // Constructor to initialize the employee's name
    public Employee(String name) {
        this.name = name;
    }

    // Method to generate a greeting message
    public String generateGreeting() {
        return "Hello, " + name + "! Welcome to the team!";
    }
}

public class EmployeeGreeting {
    public static void main(String[] args) {
        // Create an Employee object with the name "John Doe"
        Employee employee = new Employee("John Doe");

        // Generate and print the greeting message
        String greeting = employee.generateGreeting();
        System.out.println(greeting);
    }
}

