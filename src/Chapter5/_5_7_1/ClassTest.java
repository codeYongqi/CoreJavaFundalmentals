package Chapter5._5_7_1;

import Chapter5._5_1_4.Employee;

public class ClassTest {
    public static void main(String[] args) throws Exception{
        Employee e = new Employee("Harry",1,1,1,1);
        Class cl = e.getClass();
        System.out.println(cl.getName()+" "+e.getName());

        try {
            Class cl2 = Class.forName("java.util.Random");
            System.out.println(cl2.getName());
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

        Class cl3 = Class.forName("java.util.Random");
        Object obj = cl3.getConstructor().newInstance();
    }
}
