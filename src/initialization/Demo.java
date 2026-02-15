package initialization;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Legacy (кожен раз новий об'єкт):");
        new DatabaseConnector();
        new DatabaseConnector();

        System.out.println("\n--- Eager Init (Створено заздалегідь):");
        System.out.println(STR."Hash: \{ServiceEagerInit.getInstance().hashCode()}");

        System.out.println("\n--- Lazy Init (Створюється зараз):");
        System.out.println(STR."Hash: \{ServiceLazyInit.getInstance().hashCode()}");

        System.out.println("\n--- Static Block (З обробкою помилок):");
        System.out.println(STR."Hash: \{ServiceStaticBlock.getInstance().hashCode()}");
    }
}