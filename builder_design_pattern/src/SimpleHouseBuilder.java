public class SimpleHouseBuilder implements HouseBuilder {
    private House house;

    public SimpleHouseBuilder(){
        this.house = new House("", "", "", "");
    }

    @Override
    public void buildFoundation() {
        this.house = new House("Simple House Foundation", house.getWalls(), house.getColor(), house.getFloor());
    }

    @Override
    public void buildWalls() {
        this.house = new House(house.getFoundation(), "Simple House Walls", house.getColor(), house.getFloor());

    }

    @Override
    public void paintColor() {
        this.house = new House(house.getFoundation(), house.getWalls(), "White", house.getFloor());

    }

    @Override
    public void installFloor() {
        this.house = new House(house.getFoundation(), house.getWalls(), house.getColor(), "Simple House Floor");

    }

    @Override
    public House getHouse() {
        return this.house;
    }
}