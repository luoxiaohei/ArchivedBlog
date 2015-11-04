/**
 * Created by leo on 15/11/2.
 * （圆的面积和周长）编辑程序，使用以下公式计算并显示半径为5.5的圆的面积和周长。
 * 		周长 = 2 * 半径 * π
 * 		面积 = 半径 * 半径 * π
 */
public class Exercise_1_8 {
    public static double get_area(double radius) {
        return radius * radius * 3.14;
    }

    public static double get_perimeter(double radius) {
        return 2 * radius * 3.14;
    }

    public static void main(String[] args) {
        double radius = 5.5;
        System.out.print("The area is ");
        System.out.println(get_area(radius));
        System.out.print("The perimeter = ");
        System.out.println(get_perimeter(radius));
    }
}
