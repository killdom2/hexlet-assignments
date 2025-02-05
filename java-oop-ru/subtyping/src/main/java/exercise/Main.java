package exercise;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        KeyValueStorage storage = new InMemoryKV(
                Map.of("key", "value", "key2", "value2"));

        App.swapKeyValue(storage);

        System.out.println(storage.get("key", "default")); // "default"
        System.out.println(storage.get("value", "default")); // "key"


        System.out.println(storage.toMap()); // => {value=key, value2=key2}
    }
}
