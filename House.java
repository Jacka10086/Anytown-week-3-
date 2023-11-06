package Anytown; // 定义包Anytown

// House类继承了Building类，代表一栋房子
public class House extends Building {

    private int numBedrooms; // 私有属性，卧室数量
    private boolean hasGarage; // 私有属性，是否有车库
    private static int numHouses = 0; // 静态属性，用于跟踪创建的房子数量

    // 默认构造器
    public House() {
        super(); // 调用父类的构造器
        this.numBedrooms = 0; // 默认卧室数量为0
        this.hasGarage = false; // 默认没有车库
        House.numHouses++; // 创建房子时，房子数量增加
    }
    
    // 构造器重载，带有地址、所有者、卧室数量和车库存在性参数
    public House (String address, String owner, int numBedrooms, boolean hasGarage) {
        super(address, owner); // 调用父类的构造器，设置地址和所有者
        this.numBedrooms = numBedrooms; // 设置卧室数量
        this.hasGarage = hasGarage; // 设置是否有车库
        House.numHouses++; // 创建房子时，房子数量增加
    }

    // 卧室数量的getter方法
    public int getNumBedrooms() {
        return this.numBedrooms;
    }

    // 卧室数量的setter方法
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    // 车库存在性的getter方法
    public boolean getHasGarage() {
        return this.hasGarage;
    }

    // 车库存在性的setter方法
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    // 重写toString方法，返回房子信息的字符串表示
    public String toString() {
        // 调用父类的toString方法，并追加房子的具体信息
        return super.toString() + " and is a house with " + 
               this.numBedrooms + " bedrooms. ";
    }

    // 获取创建的房子数量的静态方法
    public static int getNumHouses() {
        return House.numHouses;
    }
}
