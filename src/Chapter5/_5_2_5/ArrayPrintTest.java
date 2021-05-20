package Chapter5._5_2_5;

import java.util.Arrays;

public class ArrayPrintTest {
    public static void main(String[] args) {
        var arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        var arr_2dimenson = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr_2dimenson));
    }
}
