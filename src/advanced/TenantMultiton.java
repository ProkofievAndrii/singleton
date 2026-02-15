package advanced;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class TenantMultiton {
    private static final Map<TenantKey, TenantMultiton> instances = new ConcurrentHashMap<>();
    private final TenantKey key;

    private TenantMultiton(TenantKey key) { this.key = key; }

    public static TenantMultiton getInstance(TenantKey key) {
        return instances.computeIfAbsent(key, k -> new TenantMultiton(k));
    }
}
