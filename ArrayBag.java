
package Anytown;

public class ArrayBag implements BagInterface {

    private Building[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity) {
        this.bag = new Building[capacity];
        this.numberOfEntries = 0;
    }

    public int getCurrentSize() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isArrayFull() {
        return this.numberOfEntries == this.bag.length;
    }

    public boolean addNewEntry(Building newEntry) {
        if (isArrayFull()) {
            return false;
        } else {
            this.bag[this.numberOfEntries++] = newEntry;
            return true;
        }
    }

    public Building remove()
    {
        return null;
    }

    public boolean remove(Building anEntry)
    {
        return false;
    }

    public void clear()
    {

    }

    public int getFrequencyOf(Building anEntry)
    {
        return 0;
    }

    public boolean contains(Building anEntry) {
        return false;
    }

    public String toString() {
        String strResult = "Bag[ \n";
        for ( int i = 0; i < this.numberOfEntries; i++) {
            strResult += this.bag[i] + "\n";
        }
        strResult += "]";
        return strResult;
    }




    
}
