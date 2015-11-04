/**
 * Created by leo on 15/11/1.
 * （近似求p）可以使用以下公式计算p:
 * 		π = 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11..)
 * 编写程序，计算4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)和4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)的结果，在程序中使用1.0代替1。
 */
public class Exercise_1_7 {
    public static double get_p(long accuracy) {
        double p, t = 0;
        for (long i = 0; i <= accuracy / 2; ++i) {
            double j = 1.0 / (i * 2 + 1);
            t += (i % 2) == 0 ? j : -j;
        }
        p = 4 * t;
        return p;
    }
    public static void main(String[] args) {
        System.out.println(get_p(11));
        System.out.println(get_p(13));
    }
}
