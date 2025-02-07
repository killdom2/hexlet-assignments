package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
class PairedTag extends Tag {

    String body;
    List<Tag> children;

    PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (children != null) {
            for (Tag child : children) {
                sb.append(child.toString());
            }
        }
        sb.append(body).append("</").append(name).append(">");
        return sb.toString();
    }
}
// END
