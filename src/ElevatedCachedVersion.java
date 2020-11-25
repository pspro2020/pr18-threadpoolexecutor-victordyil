import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ElevatedCachedVersion {
    private final ThreadPoolExecutor cachedThreadPool =
            (ThreadPoolExecutor) Executors.newCachedThreadPool();
    void execute(Task task){
        cachedThreadPool.execute(task);
    }

    void shutdown() throws InterruptedException {
        cachedThreadPool.shutdown();
        if (cachedThreadPool.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.printf("Max Threads is %d\n",
                    cachedThreadPool.getLargestPoolSize());
        } else {
            System.out.printf("Max Threads is %d\n",
                    cachedThreadPool.getLargestPoolSize());
        }
    }
}
