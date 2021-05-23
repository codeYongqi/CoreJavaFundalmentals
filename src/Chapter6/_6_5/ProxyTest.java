package Chapter6._6_5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTest {
    public static void main(String[] args) {
        var elements = new Object[1000];

        for(int i = 0; i < elements.length; i++){
            Integer value = i + 1;
            var handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[]{Comparable.class}, handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;

        int result = Arrays.binarySearch(elements, key);

        if(result >= 0) System.out.println(elements[result]);
    }
}

class TraceHandler implements InvocationHandler{
    private Object target;

    /**
     * Constructs a TraceHandler
     * @param t the implicit parameter of the method call
     */
    public TraceHandler(Object t){
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // print the implicit argument;
        System.out.print(target);

        // print the method name
        System.out.print("." + method.getName() + "(");

        // print explicit arguments
        if(args != null){
            for(int i = 0; i < args.length; i++){
                System.out.print(args[i]);
                if( i < args.length - 1) System.out.println(", ");
            }
        }

        System.out.println(")");

        // invoke actual method
        return method.invoke(target, args);
    }
}
