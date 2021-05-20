package Chapter4._4_3;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    private static int nextId;
    private int id = assginId();

    private static int assginId(){
        int r = nextId;
        nextId++;
        return r;
    }

    public Employee(String n, double s, int year, int month, int day){
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public LocalDate getHireDay() {
        return this.hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", salary = " + salary +
                ", hireDay = " + hireDay ;
    }

}

