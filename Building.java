package Anytown; // 定义包Anytown

// Building类代表建筑物
public class Building {
    
    private String address; // 私有属性地址
    private String owner; // 私有属性所有者
    private static int numBuildings = 0; // 静态属性，用于跟踪创建的建筑数量

    // 默认构造器
    public Building() {
        this.address = ""; // 默认地址为空
        this.owner = ""; // 默认所有者为空
        Building.numBuildings++; // 创建建筑时，建筑数量增加
    }

    // 构造器重载，带有地址和所有者参数
    public Building(String address, String owner) {
        this.address = address; // 设置地址
        this.owner = owner; // 设置所有者
        Building.numBuildings++; // 创建建筑时，建筑数量增加
    }

    // 地址的getter方法
    public String getAddress() {
        return this.address;
    }

    // 地址的setter方法
    public void setAddress(String address) {
        this.address = address;
    }

    // 所有者的getter方法
    public String getOwner() {
        return this.owner;
    }

    // 所有者的setter方法
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 重写toString方法，返回建筑物信息的字符串表示
    public String toString() {
        return this.address + " occupied by " + this.owner;
    }

    // 获取创建的建筑数量的静态方法
    public static int getNumBuildings() {
        return Building.numBuildings; 
    }

    // 判断两个建筑是否相等的方法，基于地址比较
    public boolean equals(Building anotherBuilding) {
        return this.getAddress().equals(anotherBuilding.getAddress());
    }

    // main方法，用于测试Building类
    public static void main(String[] args) {
        Building b1 = new Building(); // 创建一个无参的建筑实例
        Building b2 = new Building("27 Main Street", "Rex Dog Groomer"); // 创建一个带有地址和所有者的建筑实例
        Building b3 = new Building("18 Low Street", "Mary Jones"); // 创建另一个带有地址和所有者的建筑实例

        b1.setAddress("3 High Street"); // 为b1设置地址
        b1.setOwner("Smith's Newsagent"); // 为b1设置所有者

        // 打印建筑物信息
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
