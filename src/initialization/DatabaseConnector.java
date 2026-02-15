package initialization;

public class DatabaseConnector {
    private static int instanceCount = 0;
    public DatabaseConnector() {
        System.out.println(STR."Fake connection set at position: \{instanceCount}");
        instanceCount++;
    }
}
