package initialization;

public class ServiceStaticBlock {
    private static ServiceStaticBlock instance;
    private ServiceStaticBlock() {}
    static {
        try {
            instance = new ServiceStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Помилка при створенні статичного блоку");
        }
    }
    public static ServiceStaticBlock getInstance() { return instance; }
}
