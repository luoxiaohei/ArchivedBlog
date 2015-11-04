/**
 * Created by leo on 15/11/2.
 * （矩形的面积和周长）编写程序，使用以下公式计算并显示宽度为4.5、高度为7.9的矩形的面积和周长。
 * 		面积 = 宽 * 高
 */
public class Exercise_1_9 {
    public static double get_area(double width, double height) {
        return width * height;
    }

    public static double get_perimeter(double width, double height) {
        return (width + height) * 2;
    }

    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        System.out.print("The area is ");
        System.out.println(get_area(width, height));
        System.out.print("The perimeter is ");
        System.out.println(get_perimeter(width, height));
    }
}
