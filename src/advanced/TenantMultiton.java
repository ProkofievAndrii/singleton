package advanced;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class TenantMultiton {
    private static final Map<TenantKey, TenantMultiton> instances = new ConcurrentHashMap<>();

    private TenantMultiton(TenantKey key) {}

    public static TenantMultiton getInstance(TenantKey key) {
        return instances.computeIfAbsent(key, TenantMultiton::new);
    }
}
