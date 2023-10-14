package Anytown;

public class ArrayBag implements BagInterface {

    private Building[] bag; // 存储元素的数组
    private int numberOfEntries; // 当前元素数量
    private static final int DEFAULT_CAPACITY = 25; // 默认容量

    // 无参构造函数，创建一个容量为 DEFAULT_CAPACITY 的 ArrayBag 对象
    public ArrayBag() {
        this(ArrayBag.DEFAULT_CAPACITY);
    }

    // 带参构造函数，创建一个容量为 capacity 的 ArrayBag 对象
    public ArrayBag(int capacity) {
        this.bag = new Building[capacity];
        this.numberOfEntries = 0;
    }

    // 获取当前元素数量
    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    // 判断 ArrayBag 是否为空
    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    // 判断 ArrayBag 是否已满
    public boolean isArrayFull() {
        return this.numberOfEntries == this.bag.length;
    }

    // 向 ArrayBag 中添加一个新元素
    public boolean addNewEntry(Building newEntry) {
        if (isArrayFull()) {
            return false;
        } else {
            this.bag[this.numberOfEntries++] = newEntry;
            return true;
        }
    }
}
