package Anytown;

public class House extends Building {

    private int numBedrooms; // 卧室数量
    private boolean hasGarage; // 是否有车库
    private static int numHouses = 0; // 房屋数量

    // 无参构造函数
    public House() {
        super();
        this.numBedrooms = 0;
        this.hasGarage = false;
        House.numHouses++;
    }
    
    // 带参构造函数
    public House (String address, String owner, int numBedrooms, boolean hasGarage) {
        super(address, owner);
        this.numBedrooms = numBedrooms;
        this.hasGarage = hasGarage;
        House.numHouses++;
    }

    // 获取卧室数量
    public int getNumBedrooms() {
        return this.numBedrooms;
    }

    // 设置卧室数量
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    // 获取是否有车库
    public boolean getHasGarage() {
        return this.hasGarage;
    }

    // 设置是否有车库
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
}
