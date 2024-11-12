package arraylist;

import java.util.Arrays;

public class ArrayList {
    private int capacity;
    private int noOfItems;
    private int[] items;

    public ArrayList(int capacity, int noOfItems, int[] items) {
        this.capacity = capacity;
        this.noOfItems = noOfItems;
        this.items = items;
    }

    public void add(int pos, int e) {
        if (pos < 0 || pos > noOfItems) {
            throw new IndexOutOfBoundsException();
        }

        if (noOfItems == capacity) {
            capacity *= 2;
            items = Arrays.copyOf(items, capacity);
        }

        System.arraycopy(items, pos, items, pos + 1, noOfItems - pos);
        items[pos] = e;
        noOfItems++;
    }

    public void remove(int pos) {
        if (pos < 0 || pos >= noOfItems) {
            throw new IndexOutOfBoundsException();
        }

        System.arraycopy(items, pos + 1, items, pos, noOfItems - pos - 1);
        noOfItems--;
    }

    public int indexOf(int e) {
        for (int i = 0; i < noOfItems; i++) {
            if (items[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return noOfItems == 0;
    }

    public int first() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return items[0];
    }

    public int last() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return items[noOfItems - 1];
    }

    public int get(int pos) {
        if (pos < 0 || pos >= noOfItems) {
            throw new IndexOutOfBoundsException();
        }
        return items[pos];
    }

    public int size() {
        return noOfItems;
    }

}
