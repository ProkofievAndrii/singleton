package best;

public class SmartSingleton {
    private SmartSingleton() {
        if (SingletonHelper.INSTANCE != null) {
            throw new RuntimeException("Екземпляр вже існує!");
        }
    }

    private static class SingletonHelper {
        private static final SmartSingleton INSTANCE = new SmartSingleton();
    }

    public static SmartSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
