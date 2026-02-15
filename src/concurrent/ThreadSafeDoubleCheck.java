package concurrent;

public class ThreadSafeDoubleCheck {
    private static volatile ThreadSafeDoubleCheck instance;

    //Додано в рамках демонстрації багатопоточності
    private ThreadSafeDoubleCheck() {
        try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public static ThreadSafeDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDoubleCheck.class) {
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheck();
                }
            }
        }
        return instance;
    }
}