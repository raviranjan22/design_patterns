public class FancyHouseBuilder implements HouseBuilder{
    private House house;

    public FancyHouseBuilder(){
        this.house = new House("", "", "", "");
    }

    @Override
    public void buildFoundation() {
        this.house = new House("Fancy House Foundation", house.getWalls(), house.getColor(), house.getFloor());
    }

    @Override
    public void buildWalls() {
        this.house = new House(house.getFoundation(), "Fancy House Walls", house.getColor(), house.getFloor());

    }

    @Override
    public void paintColor() {
        this.house = new House(house.getFoundation(), house.getWalls(), "Blue", house.getFloor());

    }

    @Override
    public void installFloor() {
        this.house = new House(house.getFoundation(), house.getWalls(), house.getColor(), "Fancy House Floor");

    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
