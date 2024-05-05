public class House {
    private String foundation;
    private String walls;
    private String color;
    private String floor;

    public House(String foundation, String walls, String color, String floor) {
        this.foundation = foundation;
        this.walls = walls;
        this.color = color;
        this.floor = floor;
    }

    public String getFoundation() {
        return foundation;
    }

    public String getWalls() {
        return walls;
    }

    public String getColor() {
        return color;
    }

    public String getFloor() {
        return floor;
    }
}
