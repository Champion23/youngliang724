/**
 * @author 闫亮23
 * @version 1.0
 */
public class ExecClock extends Thread  {
      Clock hour = new Clock(24); // 时钟
      Clock minute = new Clock(60); // 分钟
      Clock second = new Clock(60); // 秒针

      // 通过 构造器 设置 当前时间
      public ExecClock(int hour, int minute, int second) {
        this.hour.setTime(hour);
        this.minute.setTime(minute);
        this.second.setTime(second);
      }

      // 使用 多线程 控制 时间变换
     public void ExecTime(){
         Thread thread = new Thread(new Runnable() {
             @Override
             public void run() {
                 while (true) {
                     try {
                         sleep(1000);
                         second.increase();
                         if (second.getTime() == 0  ) {
                             minute.increase();
                             if (minute.getTime() == 0) {
                                 hour.increase();
                             }}
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
         });
         thread.start();
     }
     //开启线程
     public void getTime(){
         Thread thread1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     while(true){
                         sleep(1000);
                         System.out.printf("%d:%d:%d  ",hour.getTime(),minute.getTime(),second.getTime());
                     }
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         });
         thread1.start();
     }
     }

