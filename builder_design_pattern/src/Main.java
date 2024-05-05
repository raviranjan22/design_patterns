public class Main {
    public static void main(String[] args) {
        HouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        ConstructionManager manager = new ConstructionManager(simpleHouseBuilder);

        manager.contructHouse();

        House simpleHouse = manager.getHouse();

        System.out.println("Simple House Detail::");
        System.out.println(simpleHouse.getFoundation());
        System.out.println(simpleHouse.getWalls());
        System.out.println(simpleHouse.getColor());
        System.out.println(simpleHouse.getFloor());

        HouseBuilder fancyHouseBuilder = new FancyHouseBuilder();
        ConstructionManager manager1 = new ConstructionManager(fancyHouseBuilder);

        manager1.contructHouse();

        House fancyHouse = manager1.getHouse();

        System.out.println("Fancy House Detail::");
        System.out.println(fancyHouse.getFoundation());
        System.out.println(fancyHouse.getWalls());
        System.out.println(fancyHouse.getColor());
        System.out.println(fancyHouse.getFloor());
    }
}
