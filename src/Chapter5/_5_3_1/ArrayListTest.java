package Chapter5._5_3_1;

import Chapter5._5_1_4.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        var staff = new ArrayList<Employee>();
        staff.add(new Employee("Harry",400000,1985,2,2));
        System.out.println(staff.size());

        // 获取列表中的第一个元素，下标从0开始
        System.out.println(staff.get(0).getName());
    }
}
