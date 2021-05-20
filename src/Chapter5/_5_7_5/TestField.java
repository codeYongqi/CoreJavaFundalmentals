package Chapter5._5_7_5;


import Chapter4._4_3.Employee;

import java.lang.reflect.Field;

public class TestField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Class cl = harry.getClass();
            // the class object representing Employee
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
            // the name field of the Employee class
        Object v = f.get(harry);
            // the value of the name field of the harry object, i.e.,
            // the String object "Harry Hacker"
        System.out.println(v instanceof String);

        f.set(harry,"kirin");
        System.out.println(harry.getName());

    }
}
