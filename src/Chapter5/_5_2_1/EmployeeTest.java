package Chapter5._5_2_1;

import Chapter5._5_1_4.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * 5.2.1 equals 方法 测试
 * @author zhuyongqi
 */
public class EmployeeTest {
    private String name;
    private double salary;
    private LocalDate hireDay;

    //首先调用超类的equasl方法，然后才调用子类的equals方法
    @Override
    public boolean equals(Object obj) {

        // a quick test to see if the objects are identical
        if(this == obj) return true;

        // must return false if the explicit parameter is null
        if(obj == null) return false;

        // if the classes don't match, they can't be equal
        if(this.getClass() != obj.getClass()) return false;

        // now we know otherObject is a non-null Employee
        EmployeeTest other = (EmployeeTest) obj;

        // test whether the fileds have identical values
        return name.equals(other.name)
                && salary == other.salary
                && Objects.equals(this.hireDay,other.hireDay);
    }

    @Override
    public int hashCode() {
        //version 1
//        return 7 * name.hashCode()
//                //弃用构造器，采用静态工厂模式
//                + 11 * Double.valueOf(salary).hashCode()
//                + 13 * hireDay.hashCode();

        //version 2
//        return  7 * Objects.hashCode(name)
//                  + 11 * Double.hashCode(salary)
//                  + 13 * Objects.hashCode(hireDay);

        //version 3
        return Objects.hash(name,salary,hireDay);

    }

    @Override
    public String toString() {
//        return getClass().getName()
//                + "[name=" + name
//                + ", salary=" + salary
//                + ", hireDay=" + hireDay
//                + "]";
        return super.toString();
    }

    public static void main(String[] args) {

    }

}

