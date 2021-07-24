/**
 * @author 闫亮23
 * @version 1.0
 */
public class ClockTest  {
    public static void main(String[] args) {
        // 测试 ： 假设 时间 为 12点 12 分 55 秒
        ExecClock execClock = new ExecClock(12, 12, 55);
        execClock.ExecTime();
        execClock.getTime();
        // 正确输出 如下
        //12:12:55  12:12:56  12:12:57  12:12:58
        // 12:12:59  12:13:0  12:13:1  12:13:2  12:13:3
        // 12:13:4  12:13:5  12:13:6  12:13:7  12:13:8
        // 12:13:9  12:13:10
    }
}
