package singletonVsDI;

public class SystemGateway {
    private static SystemGateway instance = new SystemGateway();
    private SystemGateway() {}

    public static SystemGateway getInstance() {
        return instance;
    }

    public void send(String data) { System.out.println(STR."Gateway: \{data}."); }
}

class BusinessProcessor {
    private final SystemGateway gateway;
    public BusinessProcessor(SystemGateway gateway) { this.gateway = gateway; }
    public void run(String data) { gateway.send(data); }
}
