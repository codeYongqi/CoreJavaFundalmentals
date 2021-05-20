package Chapter5._5_7_7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * This program shows how to invoke methods through reflection
 * @author zhuyongqi
 */
public class MethodTableTest {
    public static void main(String[] args) throws Exception{
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1,10,10, sqrt);
    }

    /**
     * Returns the square of a number
     * @param x a number
     * @return x squared
     */
    public static double square(double x){
        return x * x;
    }

    /**
     * Prints a table with x- and y-values fro a method
     * @param from the lower bound for the x-values
     * @param to the upper bound for the x-values
     * @param n the number of rows in the table
     * @param f a method with a double parameter and double return value
     */
    public static void printTable(double from, double to, int n, Method f) throws InvocationTargetException, IllegalAccessException {
        // print our the method as table header
        System.out.println(f);

        double dx = (to - from) / (n - 1);

        for(double x = from; x <= to; x += dx){
            double y = (double) f.invoke(null,x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
    }
}
