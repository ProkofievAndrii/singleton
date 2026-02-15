package initialization;

public class ServiceLazyInit {
    private static ServiceLazyInit instance;
    private ServiceLazyInit() {}
    public static ServiceLazyInit getInstance() {
        if (instance == null) {
            instance = new ServiceLazyInit();
        }
        return instance;
    }
    public void performAction() {
        System.out.println("Lazy initialization service: done.");
    }
}
