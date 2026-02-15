package initialization;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Legacy:");
        new DatabaseConnector();
        new DatabaseConnector();

        System.out.println("\n--- Eager Init створено наперед:");
        System.out.println(STR."Hash: \{ServiceEagerInit.getInstance().hashCode()}");

        System.out.println("\n--- Lazy Init створюється зараз:");
        System.out.println(STR."Hash: \{ServiceLazyInit.getInstance().hashCode()}");

        System.out.println("\n--- Static Block з обробкою помилок:");
        System.out.println(STR."Hash: \{ServiceStaticBlock.getInstance().hashCode()}");
    }
}