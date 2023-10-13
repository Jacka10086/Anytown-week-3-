package Anytown;

public class Shop extends Building {

    private int numEmployees; // 雇员数量
    private int averageTurnover; // 平均营业额
    private static int numShops = 0; // 商店数量

    // 无参构造函数
    public Shop() {
        super();
        this.numEmployees = 0;
        this.averageTurnover = 0;
        Shop.numShops++;
    }

    // 带参构造函数
    public Shop(String address, String owner, int numEmployees, int averageTurnover) {
        super(address, owner);
        this.numEmployees = numEmployees;
        this.averageTurnover = averageTurnover;
        Shop.numShops++;
    }

    // 获取雇员数量
    public int getNumEmployees() {
        return this.numEmployees;
    }

    // 设置雇员数量
    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    // 获取平均营业额
    public int getAverageTurnover() {
        return this.averageTurnover;
    }

    // 设置平均营业额
    public void setAverageTurnover(int averageTurnover) {
        this.averageTurnover = averageTurnover;
    }
}
