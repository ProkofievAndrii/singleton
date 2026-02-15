package initialization;

public class ServiceEagerInit {
    private static final ServiceEagerInit instance = new ServiceEagerInit();
    private ServiceEagerInit() {}
    public static ServiceEagerInit getInstance() { return instance; }
    public void execute() { System.out.println("Eager Service: Работа выполнена."); }
}
