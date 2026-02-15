package advanced;
import initialization.DatabaseConnector;

public class Demo {
    public static void main(String[] args) {
        // 1. Тестування TenantMultiton з TenantKey
        System.out.println("--- Тестування TenantMultiton:");
        TenantMultiton admin = TenantMultiton.getInstance(TenantKey.ADMIN);
        TenantMultiton guest = TenantMultiton.getInstance(TenantKey.GUEST);

        System.out.println(STR."Admin Hash: \{admin.hashCode()}");
        System.out.println(STR."Guest Hash: \{guest.hashCode()}");

        // 2. Тестування TenantContext з ContextType
        System.out.println("\n--- Тестування TenantContext:");
        TenantContext primary = TenantContext.getInstance(ContextType.PRIMARY);
        primary.displayInfo();

        // 3. Тестування ComponentRegistry
        System.out.println("\n--- Тестування ComponentRegistry:");
        try {
            DatabaseConnector conn1 = ComponentRegistry.getComponent(DatabaseConnector.class);
            DatabaseConnector conn2 = ComponentRegistry.getComponent(DatabaseConnector.class);

            System.out.println(STR."Hash 1: \{conn1.hashCode()}");
            System.out.println(STR."Hash 2: \{conn2.hashCode()}");

        } catch (RuntimeException e) {
            System.out.println(STR."Error: \{e.getMessage()}");
        }
    }
}
