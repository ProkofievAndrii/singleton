package singletonVsDI;

public class Demo {
    public static void main(String[] args) {

        // 1. Singleton: Hard dependence
        System.out.println("--- Використання Singleton:");
        SystemGateway gateway = SystemGateway.getInstance();
        gateway.send("Дані через статичний доступ");

        // 2.DI: Obj is created and injected
        System.out.println("\n--- Використання Dependency Injection:");
        SystemGateway diGateway = SystemGateway.getInstance();
        BusinessProcessor processor = new BusinessProcessor(diGateway);
        processor.run("Дані через ін'єкцію залежностей");

        System.out.println("\nВисновок: DI дозволяє уникнути глобального стану та робить код тестованим.");
    }
}