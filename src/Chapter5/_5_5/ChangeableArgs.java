package Chapter5._5_5;

/**
 * 5.5 可变参数
 * @author zhuyongqi
 */
public class ChangeableArgs {
    public static void main(String[] args) {
        double max = max(1,3,4,5,6);
        System.out.println(max);
    }

    //可变参数 double... 相当于double[]
    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for(double v : values) if(v > largest) largest = v;
        return largest;
    }

}
