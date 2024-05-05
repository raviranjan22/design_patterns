public class ConstructionManager {

    private HouseBuilder builder;

    public ConstructionManager(HouseBuilder builder){
        this.builder = builder;
    }

    public void contructHouse(){
        builder.buildFoundation();
        builder.buildWalls();
        builder.paintColor();
        builder.installFloor();
    }

    public House getHouse(){
        return builder.getHouse();
    }
}
