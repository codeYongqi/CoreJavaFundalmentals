package Chapter4._4_2;

import java.time.LocalDate;
import java.util.Date;

/**
 * 4.2日期类
 * @author zhuyongqi
 */
public class ClassDateTest {
    public static void main(String[] args) {
        //格式
        //System.out.println(new Date().toString());

        //格式 年-月-日
        System.out.println(LocalDate.now());
        //System.out.println();
        System.out.println(LocalDate.now().plusYears(1));

    }

}
