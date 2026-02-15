package singletonVsDI;

interface Gateway {
    void send(String data);
}

public class SystemGatewayDI implements Gateway {
    public void send(String data) { System.out.println(STR."Gateway: \{data}"); }
}

class BusinessProcessorDI {
    private final Gateway gateway;
    public BusinessProcessorDI(Gateway gateway) {
        this.gateway = gateway;
    }
    public void run(String data) { gateway.send(data); }
}
