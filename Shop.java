package Anytown; // 定义包Anytown

// Shop类继承了Building类，代表商店
public class Shop extends Building {

    private int numEmployees; // 私有属性，员工数量
    private int averageTurnover; // 私有属性，平均营业额
    private static int numShops = 0; // 静态属性，用于跟踪创建的商店数量

    // 默认构造器
    public Shop() {
        super(); // 调用父类的构造器
        this.numEmployees = 0; // 默认员工数量为0
        this.averageTurnover = 0; // 默认平均营业额为0
        Shop.numShops++; // 创建商店时，商店数量增加
    }

    // 构造器重载，带有地址、所有者、员工数量和平均营业额参数
    public Shop(String address, String owner, int numEmployees, int averageTurnover) {
        super(address, owner); // 调用父类的构造器，设置地址和所有者
        this.numEmployees = numEmployees; // 设置员工数量
        this.averageTurnover = averageTurnover; // 设置平均营业额
        Shop.numShops++; // 创建商店时，商店数量增加
    }

    // 员工数量的getter方法
    public int getNumEmployees() {
        return this.numEmployees;
    }

    // 员工数量的setter方法
    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    // 平均营业额的getter方法
    public int getAverageTurnover() {
        return this.averageTurnover;
    }

    // 平均营业额的setter方法
    public void setAverageTurnover(int averageTurnover) {
        this.averageTurnover = averageTurnover;
    }

    // 重写toString方法，返回商店信息的字符串表示
    public String toString() {
        // 调用父类的toString方法，并追加商店的具体信息
        return super.toString() + " and is a shop with " +
               this.numEmployees + " employees ";
    }

    // 获取创建的商店数量的静态方法
    public static int getNumShops() {
        return Shop.numShops;
    }
}
