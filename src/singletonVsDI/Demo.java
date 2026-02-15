package singletonVsDI;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Тест: Singleton");
        BusinessProcessorSingleton singletonProcessor = new BusinessProcessorSingleton();
        singletonProcessor.run("Повідомлення 1");

        System.out.println("\n--- Тест: DI");
        Gateway realGateway = new SystemGatewayDI();
        BusinessProcessorDI diProcessor = new BusinessProcessorDI(realGateway);
        diProcessor.run("Повідомлення 2");

        System.out.println("\n--- Тест: Mocking");
        Gateway testMockGateway = data -> System.out.println(STR."LOG:\{data}");

        BusinessProcessorDI mockProcessor = new BusinessProcessorDI(testMockGateway);
        mockProcessor.run("Секретні дані");
    }
}