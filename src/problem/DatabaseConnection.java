package problem;

public class DatabaseConnection {
    private static int counter = 0;

    public DatabaseConnection() {
        counter++;
        System.out.println(STR."Створення з'єднання №\{counter}");
    }
}
