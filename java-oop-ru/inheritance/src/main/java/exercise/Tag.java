package exercise;

import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
class Tag {
    String name;
    Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = new LinkedHashMap<>(attributes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("<").append(name);
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            sb.append(" ").append(entry.getKey()).append("=\"")
                    .append(entry.getValue()).append("\"");
        }
        sb.append(">");
        return sb.toString();
    }
}
// END
