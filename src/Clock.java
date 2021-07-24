/**
 * @author 闫亮23
 * @version 1.0
 */
public class Clock extends Thread {
    private int size; // 计量尺度 分针60，时针24，秒针60
    private int time; // 当前时间

    public Clock(int size) {
        this.size = size;
    }

    public int getSize() { // 获取 计量尺度
        return size;
    }

    public void setSize(int size) { // 设置 计量尺度
        this.size = size;
    }

    public int getTime() {  // 获取 当前时间
        return time;
    }

    public void setTime(int time) { // 设置 当前 时间
        this.time = time;
    }

    public void increase() {
        time++;
        if(time == size){
            time =0;
        }
    }
}