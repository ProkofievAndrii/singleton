import best.SmartSingleton;
import problem.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- БЕЗ ПАТТЕРНА ---");
        new DatabaseConnection();
        new DatabaseConnection();

        System.out.println("\n--- З ПАТТЕРНОМ (SmartSingleton) ---");
        SmartSingleton s1 = SmartSingleton.getInstance();
        SmartSingleton s2 = SmartSingleton.getInstance();

        System.out.println(STR."Хеш-код 1: \{s1.hashCode()}");
        System.out.println(STR."Хеш-код 2: \{s2.hashCode()}");
        System.out.println(STR."Об'єкти ідентичні: \{s1 == s2}");
    }
}