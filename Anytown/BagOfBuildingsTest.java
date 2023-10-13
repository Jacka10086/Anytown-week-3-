package Anytown;

public class BagOfBuildingsTest {

    // 创建四个 Building 对象
    private static Building b1 = new Building("Address 1", "Owner 1");
    private static Building b2 = new Building("Address 2", "Owner 2");
    private static Building b3 = new Building("Address 3", "Owner 3");
    private static Building b4 = new Building("Address 4", "Owner 4");

    public static void main(String[] args) {

        // 创建一个 ArrayBag 对象
        ArrayBag buildings = new ArrayBag();

        System.out.println("--------------------------");
        System.out.println("BAG TEST:");
        System.out.println("Initial state of Bag:");

        // 输出当前 Bag 的状态
        bagStatusReport(buildings);
        System.out.println("\n");

        System.out.println("Adding 8 buildings to the bag: b1, b1, b2, b2, b3, b3, b4, b4");

        // TODO (1/5): 按照给定的顺序将以下 Building 对象添加到 Bag 中
        // 注意：Building 对象在上面定义为静态变量

        buildings.addNewEntry(BagOfBuildingsTest.b1);
        buildings.addNewEntry(BagOfBuildingsTest.b1);
        buildings.addNewEntry(BagOfBuildingsTest.b2);
        buildings.addNewEntry(BagOfBuildingsTest.b2);
        buildings.addNewEntry(BagOfBuildingsTest.b3);
        buildings.addNewEntry(BagOfBuildingsTest.b3);
        buildings.addNewEntry(BagOfBuildingsTest.b4);
        buildings.addNewEntry(BagOfBuildingsTest.b4);
