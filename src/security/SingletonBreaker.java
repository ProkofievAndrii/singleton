package security;


import naive.LazySingleton;
import java.lang.reflect.Constructor;

public class SingletonBreaker {
    public static void main(String[] args) throws Exception {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = null;

        Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        instance2 = constructor.newInstance();

        System.out.println(STR."Хеш-код 1: \{instance1.hashCode()}");
        System.out.println(STR."Хеш-код 2: \{instance2.hashCode()}");
    }
}
