package Encapsulation;

// Employee.java

class EmployeeDetail {

    private String name;
    private int age;
    private double salary;

    // Public getters for all attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Public setters for all attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Package-private method to display employee details
    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: INR " + salary);
    }
}

// EmployeeTester.java (in the same package as Employee)

public class Employee {

    public static void main(String[] args) {
        EmployeeDetail emp = new EmployeeDetail();
        emp.setName("Krunal Giri");
        emp.setAge(21);
        emp.setSalary(50000.00);

        // Accessing displayEmployeeDetails method within the package
        emp.displayEmployeeDetails();
    }
}
