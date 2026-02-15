package advanced;

import java.util.HashMap;
import java.util.Map;

public class ComponentRegistry {
    private static final Map<String, Object> components = new HashMap<>();

    public static synchronized <T> T getComponent(Class<T> cls) {
        if (!components.containsKey(cls.getName())) {
            try {
                components.put(cls.getName(), cls.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                throw new RuntimeException("Ошибка регистрации компонента");
            }
        }
        return cls.cast(components.get(cls.getName()));
    }
}
