package security;

import initialization.ServiceLazyInit;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) {
        // 1. Взлом незахищеного сінглтона
        System.out.println("--- Атака на ServiceLazyInit (Reflection):");
        try {
            ServiceLazyInit s1 = ServiceLazyInit.getInstance();

            Constructor<ServiceLazyInit> constructor = ServiceLazyInit.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            ServiceLazyInit s2 = constructor.newInstance();

            System.out.println(STR."Obj 1 Hash: \{s1.hashCode()}");
            System.out.println(STR."Obj 2 Hash: \{s2.hashCode()}");
            System.out.println(STR."Результат : \{s1 != s2 ? "вдало створено два Obj" : "помилка"}");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2. Спроба взлому захищеного сінглтона
        System.out.println("\n--- Атака на ValidatedSingleton (перевірка в конструкторі):");
        try {
            ValidatedSingleton v1 = ValidatedSingleton.getInstance();

            Constructor<ValidatedSingleton> vConstructor = ValidatedSingleton.class.getDeclaredConstructor();
            vConstructor.setAccessible(true);
            ValidatedSingleton v2 = vConstructor.newInstance();
        } catch (Exception e) {
            System.out.println(STR."\{e.getCause().getMessage()}");
        }

        // 3. Повністю захищений Enum
        System.out.println("\n--- SecurityEnum:");
        SecurityEnum.INSTANCE.processData();
        System.out.println("JVM на рівні мови забороняє створення нових екземплярів Enum через рефлексию.");
    }
}
