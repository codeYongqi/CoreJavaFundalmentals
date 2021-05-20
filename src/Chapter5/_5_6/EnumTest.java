package Chapter5._5_6;

import java.util.Scanner;

/**
 * 5.6 枚举类
 * @author zhuyongqi
 */
public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = null;

        try {
            size = Enum.valueOf(Size.class, input);
        }catch(IllegalArgumentException e){
            System.out.println("请从给定的单词中选一个");
        }

        System.out.println("abbreviation=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the _.");
        }
    }
}

enum Size{

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }

}

