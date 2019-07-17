package ThreadPool;
import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;
public class poll {
    public static void main(String[] args) {
        ThreadPoolExecutor poll =new ThreadPoolExecutor(10,15,60,TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());


    }
}
