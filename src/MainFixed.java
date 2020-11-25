public class MainFixed {
    public static void main(String[] args) throws InterruptedException {
        ElevatedFixedVersion elevatedFixedVersion = new ElevatedFixedVersion();
        for (int i = 1; i < 11; i++) {
            Task task = new Task(i);
            elevatedFixedVersion.execute(task);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                return;
            }
        }
        elevatedFixedVersion.shutdown();
    }
}
