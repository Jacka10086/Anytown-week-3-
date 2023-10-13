package Anytown;

public interface BagInterface {

    // 获取当前 Bag 中元素的数量
    public int getCurrentSize();

    // 判断当前 Bag 是否为空
    public boolean isEmpty();

    // 向 Bag 中添加一个新元素
    public boolean addNewEntry(Building newEntry);

    // 从 Bag 中删除一个元素
    public Building remove();

    // 从 Bag 中删除指定元素
    public boolean remove(Building anEntry);

    // 清空 Bag 中所有元素
    public void clear();    

    // 获取指定元素在 Bag 中出现的次数
    public int getFrequencyOf(Building anEntry);

    // 判断 Bag 中是否包含指定元素
    public boolean contains(Building anEntry);

    // 将 Bag 转换为字符串
    public String toString();
}
