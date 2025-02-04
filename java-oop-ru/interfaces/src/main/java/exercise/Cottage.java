package exercise;

// BEGIN
class Cottage implements Home {
    double area;
    int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    public String toString () {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    @Override
    public int compareTo(Home another) {
        if (this.area < another.getArea()) {
            return -1;
        } else if (this.area > another.getArea()) {
            return 1;
        }
        return 0;
    }
}
// END
