public class MainCached {
    public static void main(String[] args) throws InterruptedException {
        ElevatedCachedVersion elevatedCachedVersion = new ElevatedCachedVersion();
        for (int i = 1; i < 11; i++) {
            Task task = new Task(i);
            elevatedCachedVersion.execute(task);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                return;
            }
        }
        elevatedCachedVersion.shutdown();
    }
}
