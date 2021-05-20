package Chapter3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * 3.9 大数
 * @author zhuyongqi
 */
public class BigMath {
    public static void main(String[] args) {
        BigIntegerTest.test();

        //加减乘除取余
        BigInteger bigInteger = BigInteger.valueOf(10);
        BigInteger bigInteger1 = new BigInteger("1");

        bigInteger.add(bigInteger1);
        bigInteger.subtract(bigInteger1);
        bigInteger.multiply(bigInteger1);
        bigInteger.divide(bigInteger1);
        bigInteger.mod(bigInteger1);

        BigDecimal bigDecimal = BigDecimal.valueOf(999);

        //得到四舍五入小数，不指定取舍方法会 导致运算无限不循环小数异常
        bigDecimal.divide(BigDecimal.valueOf(444), RoundingMode.HALF_UP);
    }
}

class BigIntegerTest{
    public static void test(){
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw ?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw ?");
        int n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for(int i = 1; i <= k; i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i +1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
