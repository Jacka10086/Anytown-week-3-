
package Anytown; // 定义包名为Anytown

// 定义一个名为ArrayBag的公共类，它实现了BagInterface接口
public class ArrayBag implements BagInterface {

    private Building[] bag; // 定义一个Building类型的数组，用于存储元素
    private int numberOfEntries; // 定义一个整数，表示数组中的实际元素数量
    private static final int DEFAULT_CAPACITY = 25; // 定义一个静态常量，表示数组的默认容量

    // 默认构造函数，初始化数组的容量为默认容量
    public ArrayBag() {
        this(ArrayBag.DEFAULT_CAPACITY);
    }

    // 带参数的构造函数，根据给定的容量初始化数组
    public ArrayBag(int capacity) {
        this.bag = new Building[capacity];
        this.numberOfEntries = 0;
    }

    // 返回数组中的实际元素数量
    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    // 判断数组是否为空
    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    // 判断数组是否已满
    public boolean isArrayFull() {
        return this.numberOfEntries == this.bag.length;
    }

    // 向数组中添加一个新元素，如果数组已满则返回false，否则返回true
    public boolean addNewEntry(Building newEntry) {
        if (isArrayFull()) {
            return false;
        } else {
            this.bag[this.numberOfEntries++] = newEntry;
            return true;
        }
    }

    // 私有方法，从指定索引处删除元素，并返回被删除的元素
    private Building removeElmentAt(int index) {
        Building result = null;
        if (!isEmpty() && (index >= 0 && index < this.numberrOfEntries)) {
            result = this.bag[index];
            this.bag[index] = this.bag[numberOfEntries - 1];
            this.bag[numberOfEntries - 1] = null;
            this.numberOfEntries--;
        }
        return result;
    }

    // 删除并返回数组中的最后一个元素
    public Building remove() {
        return removeElmentAt(this.numberOfEntries - 1);
    }

    // 删除指定的元素，如果删除成功则返回true，否则返回false
    public boolean remove(Building anEntry) {
        boolean found = false;
        int index = 0;
        while(!found && (index < this.numberOfEntries - 1)) {
            if (this.bag[index].equals(anEntry)) found = true;
             else index++;
        }
        if (found) removeElmentAt(index);
        return found;
    }

    // 清空数组中的所有元素
    public void clear() {
        while (!isEmpty()) 
            remove();
    }

    // 返回指定元素在数组中的出现次数
    public int getFrequencyOf(Building anEntry) {
        int count = 0;
        for (int i = 0; i < this.numberOfEntries; i++) {
            if (this.bag[i].equals(anEntry)) {
                count++;
            }
        }
        return count;
    }

    // 判断数组中是否包含指定的元素
    public boolean contains(Building anEntry) {
        boolean found = false;
        int index = 0;
        while(!found && (index < this.numberOfEntries)) {
            if (this.bag[index].equals(anEntry)) {
                found = true;
            } else {
                index++;
            }
        }
        return found;
    }

    // 返回数组中的所有元素的字符串表示形式
    public String toString() {
        String strResult = "Bag[ \n";
        for ( int i = 0; i < this.numberOfEntries; i++) {
            strResult += this.bag[i] + "\n";
        }
        strResult += "]";
        return strResult;
    }
}
