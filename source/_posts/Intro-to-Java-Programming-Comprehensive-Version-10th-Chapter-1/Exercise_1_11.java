/**
 * Created by leo on 15/11/2.
 * （人口估算）美国人口调查局基于以下假设进行人口估算：
 *  ● 每7秒有一个人出生。
 *  ● 每13秒有一个人死亡。
 *  ● 每45秒有一个移民迁入。
 *    编写一个程序，显示未来5年的每年的人口数。假设当前的人口数是312032486，每年有365天。
 *    提示：Java 中，两个整数相除，结果还是整数，小数部分被去掉。例如，5/4等于1（而不是1.25），10/4等于2（而不是2.5）。
 *    如果想得到有小数部分的精确结果，进行除法运算的两个值之一必须是一个具有小数点的数值。例如，5.0/4等于1.25，10/4.0等于2.5。
 */
public class Exercise_1_11 {
    public static void main(String[] args) {
        int seconds = 365 * 24 * 3600; // 一年的秒数
        double births = Math.ceil(seconds / 7.0); // 出生数量
        double deaths = Math.ceil(seconds / 13.0); // 死亡数量
        double immigrants = Math.ceil(seconds / 45); // 移民迁入数量
        double added = births + immigrants - deaths; // 每年新增人口数
        int population = 312032486;
        for (int i = 0; i != 5; ++i) {
            population += added;
            System.out.printf("After %d years, the population is %d.\n", i+1, population);
        }
    }
}
