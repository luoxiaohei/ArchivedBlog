/**
 * Created by leo on 15/11/1.
 * （数列求和）编写程序，显示1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9的结果。
 */
public class Exercise_1_6 {
    public static void main(String[] args) {
        int result = 0;
        for (int i=1; i != 10; ++i) {
            result += i;
        }
        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = ");
        System.out.println(result);
    }
}
