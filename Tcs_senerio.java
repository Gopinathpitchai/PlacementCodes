public class Tcs_senerio {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Gopi", 50000);
        Employee emp1 = new Employee(102, "Gokul", 50000);
        emp.display();
        emp1.display();
    }
}

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);

        if (salary < 0) {
            System.out.println("Invalid Salary");
        } else {
            System.out.println("Salary: " + salary);
        }
    }
}