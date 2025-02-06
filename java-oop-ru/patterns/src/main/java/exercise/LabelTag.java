package exercise;

// BEGIN
class LabelTag implements TagInterface {

    String tag;
    TagInterface item;

    public LabelTag (String tag, TagInterface item) {
        this.tag = tag;
        this.item = item;
    }
    @Override
    public String render() {
        return "<label>" + tag + item.render() + "</label>";
    }
}
// END
