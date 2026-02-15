package advanced;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TenantContext {
    private static final Map<ContextType, TenantContext> contexts = new ConcurrentHashMap<>();
    private final ContextType type;

    private TenantContext(ContextType type) { this.type = type; }

    public static TenantContext getInstance(ContextType type) {
        return contexts.computeIfAbsent(type, k -> new TenantContext(k));
    }

    public void displayInfo() {
        System.out.println(STR."Context type: \{type}");
    }
}
