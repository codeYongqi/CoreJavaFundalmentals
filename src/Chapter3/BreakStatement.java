package Chapter3;

import java.util.Scanner;

/**
 * 3.8.6 中断流程控制语句
 * @author 朱勇麒
 */
public class BreakStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        read_data:
        while(true){
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter a number >= 0:");
                n = in.nextInt();
                if(n < 0) break read_data;
            }
        }

        if(n < 0) System.out.println("请重新输入");
    }
}
