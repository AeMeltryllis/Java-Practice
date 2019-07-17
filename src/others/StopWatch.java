package others;

public class StopWatch
{
    long start;
    public void StopWatch(){
         start = System.currentTimeMillis();

    }
    public void stopTimer(){
        long stop =System.currentTimeMillis();
        long time = (start - stop)/1000;
        System.out.println("已经花了" + time +"秒");
    }

}

