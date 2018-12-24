package Other;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * <Description> 在高并发下System.currentTimeMillis()比较耗时<br>
 * 可以采取这个类来减少时间的消耗
 * 调用的时候只需要SystemClock.millisClock().now();就可以了
 * 测试后效率差大概在4倍
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/23 20:57 <br>
 * @see Other <br>
 */
public class SystemClock {
    private static final String THREAD_NAME = "system.clock";
    private static final SystemClock MILLIS_CLOCK = new SystemClock(1);
    //准确性
    private final long precision;
    private final AtomicLong now;

    private SystemClock(long precision) {
        this.precision = precision;
        now = new AtomicLong(System.currentTimeMillis());
        scheduleClockUpdating();
    }

    public static SystemClock millisClock() {
        return MILLIS_CLOCK;
    }

    private void scheduleClockUpdating() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
            Thread thread = new Thread(runnable, THREAD_NAME);
            thread.setDaemon(true);//设置守护线程
            return thread;
        });
        scheduler.scheduleAtFixedRate(() ->
                now.set(System.currentTimeMillis()), precision, precision, TimeUnit.MILLISECONDS);
    }

    public long now() {
        return now.get();
    }

}
