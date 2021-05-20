package Chapter5._5_2_4;

/**
 * hashcode 测试
 * @author zhuyongqi
 */
public class HashCodeTest {
    public static void main(String[] args) {
        //String类 hashcode 根据内容
        //StringBuilder默认继承Object类的hashcode，Obejct的hashcode 默认方法根据对象的存储地址
        var s = "OK";
        var sb = new StringBuilder(s);
        System.out.println(s.hashCode() + "  " + sb.hashCode());

        var t = new String("OK");
        var tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }
}
