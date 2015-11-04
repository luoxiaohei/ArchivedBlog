/**
 * Created by leo on 15/11/3.
 * （代数：求解2 x 2线性方程） 可以使用Cramer规则解下面的2 x 2线性方程组：
 * 	        ax + by = e    x = (ed - bf) / (ad - bc)
 * 	        cx + dy = f    y = (af - ec) / (ad - bc)
 *  编写程序，求解以下方程组并显示 x 和 y 的值。
 *  		3.4x + 50.2y = 44.5
 *  		2.1x + 0.55y = 5.9
 */
public class Exercise_1_13 {
    public static void main(String[] args) {
        System.out.printf("x = %f\n", (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
        System.out.printf("y = %f\n", (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.5 - 50.2 * 2.1));
    }
}
