import java.util.Scanner;
class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. Setting default ID = 1");
            this.id = 1;
        }

        this.name = name;

        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary. Setting default salary = 10000");
            this.salary = 10000;
        }
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        Employee emp = new Employee(id, name, salary);
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}
