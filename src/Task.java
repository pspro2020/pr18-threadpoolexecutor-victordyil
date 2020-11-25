import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task implements Runnable {
    private  int n;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("mm:ss:ms");
    public Task(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.printf("%s ->Thread %s :  %d elevated to %d: %d\n",
                    dateTimeFormatter.format(LocalDateTime.now()),
                    Thread.currentThread().getName(),
                    n,
                    i,
                    (int)Math.pow(n,i));
        }
    }
}
