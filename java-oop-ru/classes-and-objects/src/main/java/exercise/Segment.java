package exercise;

// BEGIN
class Segment {

    Point begin;
    Point end;

    Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBeginPoint() {
        return begin;
    }

    public Point getEndPoint() {
        return end;
    }

    public Point getMidPoint() {
        return new Point((begin.x + end.x) / 2, (begin.y + end.y) / 2);
    }
}
// END
