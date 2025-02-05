package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
final class InMemoryKV implements KeyValueStorage {

    private final Map<String, String> storage;

    InMemoryKV(Map<String, String> map) {
        storage = new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        Map<String, String> map = new HashMap<>(storage);
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>(storage);
        return map;
    }
}
// END
