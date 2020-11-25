public class Task implements Runnable {
    private int n;

    public Task(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.printf("Thread %s :  %d elevated to %d: %d\n",Thread.currentThread().getName(),n,i,(int)Math.pow(n,i));
        }
    }
}
