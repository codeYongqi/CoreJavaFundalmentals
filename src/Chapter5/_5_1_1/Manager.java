package Chapter5._5_1_1;

import Chapter4._4_3.Employee;

/**
 * 5.1 继承子类 重写方法 与 构造器
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for(Employee e : staff){
            System.out.println(e.getName()+" "+e.getSalary());
        }


    }
}
