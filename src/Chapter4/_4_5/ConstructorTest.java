package Chapter4._4_5;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee employee = new Employee(20);
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {
        var generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, salary);
    }

    public Employee() {
        // name initialized to "" --see above
        // salary not explicitly set --initialized to 0
        // id initialized in initializtion block
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }
}
