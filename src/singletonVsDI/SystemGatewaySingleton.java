package singletonVsDI;

public class SystemGatewaySingleton {
    private static final SystemGatewaySingleton instance = new SystemGatewaySingleton();
    private SystemGatewaySingleton() {}
    public static SystemGatewaySingleton getInstance() { return instance; }
    public void send(String data) { System.out.println(STR."Gateway: \{data}"); }
}

class BusinessProcessorSingleton {
    public void run(String data) {
        SystemGatewaySingleton.getInstance().send(data);
    }
}
