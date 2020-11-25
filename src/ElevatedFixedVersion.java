import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ElevatedFixedVersion {
    private final ThreadPoolExecutor fixedThreadPool =
            (ThreadPoolExecutor) Executors.newFixedThreadPool(Thread.activeCount());

    void execute(Task task) {
        fixedThreadPool.execute(task);
    }

    void shutdown() throws InterruptedException {
        fixedThreadPool.shutdown();
        if (fixedThreadPool.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.printf("Max Threads is %d\n",
                    fixedThreadPool.getLargestPoolSize());
        } else {
            System.out.printf("Max Threads is %d\n",
                    fixedThreadPool.getLargestPoolSize());
        }
    }
}
