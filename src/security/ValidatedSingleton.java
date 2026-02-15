package security;

import java.io.Serial;
import java.io.Serializable;

public class ValidatedSingleton implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static class Loader {
        private static final ValidatedSingleton INSTANCE = new ValidatedSingleton();
    }
    private ValidatedSingleton() {}
    public static ValidatedSingleton getInstance() {
        return Loader.INSTANCE;
    }
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}
