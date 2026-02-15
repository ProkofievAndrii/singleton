package singletonVsDI;

public class SystemGateway {
    public static SystemGateway instance = new SystemGateway();
    private SystemGateway() {}
    public void send() { System.out.println("Gateway: sent."); }
}

class BusinessProcessor {
    private final SystemGateway gateway;
    public BusinessProcessor(SystemGateway gateway) { this.gateway = gateway; }
    public void run() { gateway.send(); }
}
