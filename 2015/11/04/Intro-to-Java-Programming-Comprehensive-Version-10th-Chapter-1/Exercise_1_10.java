/**
 * Created by leo on 15/11/2.
 * （以英里计的平均速度）假设一个跑步者45分钟30秒跑了14公里。编写一个程序显示该跑步者的平均速度，以英里每小时为单位.(注：1英里等于1.6公里。）
 */
public class Exercise_1_10 {
    public static void main(String[] args) {
        System.out.print("The average speed is ");
        System.out.print(14 * 1.6 / (45.5 / 60));
        System.out.println(" mile per hour.");
    }
}
