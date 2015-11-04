/**
 * Created by leo on 15/11/2.
 * （以公里计的平均速度） 假设一个跑步者1小时40分钟35秒跑了24英里。编写一个程序显示该跑步者的平均速度，以公里每小时为单位。（注意，1英里等于1.6公里。）
 */
public class Exercise_1_12 {
    public static void main(String[] args) {
        System.out.printf("The average speed is %f kilometers per hour.", 24 / 1.6 / (1 + ((40 * 60 + 35) / 3600.0)));
    }
}