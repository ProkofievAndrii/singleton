package concurrent;

public class ThreadSafeDoubleCheck {
    private static volatile ThreadSafeDoubleCheck instance;
    private ThreadSafeDoubleCheck() {}
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
