package Chapter3;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] smallPrimes = {1,2,3,4,5};

        String[] authors = {
                "Jams Gosling",
                "Bill Joy",
                "Guy Steele",
        };

        smallPrimes = new int[]{10,3,4};

        //调用Arrays工具类 序列化数组
        System.out.println(Arrays.toString(smallPrimes));

        //数组复制
        int[] smallCopy = Arrays.copyOf(smallPrimes,smallPrimes.length);
        Message.test(args);

        //数组排序，使用快排
        Arrays.sort(smallPrimes);
        System.out.println(Arrays.toString(smallPrimes));

        int[][] magicSquare = {
                {16,  3,  2, 13},
                { 5, 19, 11,  8},
                { 9,  6,  7, 12}
        };

        //打印二阶数组要用 deepToString
        System.out.println(Arrays.deepToString(magicSquare));

    }
}

class Message{
    static void test(String[] args){

        if (args.length == 0 || args[0].equals("-h"))
            System.out.println("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");

        for (int i = 1; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }
        System.out.println("!");

    }
}
