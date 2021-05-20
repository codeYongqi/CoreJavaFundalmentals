package Chapter3;

/**
 * 3.6 String
 * author 朱勇麒
 */
public class StringTest {
    public static void main(String[] args) {
        String greeting = "hello";
        //System.out.println(greeting.length());

        String str = "hello";
        //System.out.println(greeting.equals(str));

        //检查字符串是否为空串
        //System.out.println(str.equals(""));

        //比较字符串，忽略大小写
        //System.out.println(greeting.equalsIgnoreCase("Hello"));

        //判断字符串是否以某一个prefix
        //System.out.println("hello,kirin".startsWith("hello"));

        //判断字符串中第一个子串和最后一个子串的位置
        //System.out.println("hello".indexOf("l"));
        //System.out.println("hello".lastIndexOf("l"));

        //从零开始，左开右闭
        //System.out.println("hello".substring(0,2));

        //trim， 删除字符串首部空格
        //System.out.println("   hello");
        //System.out.println("   hello".trim());

        /**
        StringBuilder builder = new StringBuilder();
        builder.append("hello");
        builder.append("kirin");

        //提换对应位置的字符
        builder.setCharAt(0,'m');

        //删除对应区间（左开有闭）的部分
        builder.delete(0,5);
        System.out.println(builder.toString());
         */
    }
}
