package ru.x5.hw6.Task2;

public class MyArrayList<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private double loadFactor = 0.75;
    private Object [] arr;
    private int size;
    private int capacity;

    public MyArrayList(){
        arr = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }
    public MyArrayList(int capacity){
        if(capacity >= 0){
            arr = new Object[capacity];
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException("Incorrect capacity: " + capacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    private boolean checkCapacity(){
        return ((double)size / capacity) > loadFactor;
    }

    private void increaseCapacity(){
        capacity *= 2;
        Object[] newArr = new Object[capacity];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    private boolean checkIndex(int index){
        return index < 0 || index >= size;
    }

    @Override
    public void add(E item){
        if(checkCapacity()){
            increaseCapacity();
        }
        arr[size] = item;
        size++;
    }

    @Override
    public E get (int index){
        if(checkIndex(index)){
            throw new IllegalArgumentException("Incorrect index: " + index);
        } else {
            return (E)arr[index];
        }
    }

    @Override
    public void remove (int index){
        if(checkIndex(index)){
            throw new IllegalArgumentException("Incorrect index: " + index);
        } else {
            shiftArr(index);
            size--;
        }
    }

    @Override
    public void remove(E item){
        if(item == null){
            for (int i = 0; i < size; i++) {
                if (arr[i] == null){
                    shiftArr(i);
                    size--;
                    return;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (item.equals(arr[i])){
                    shiftArr(i);
                    size--;
                    return;
                }
            }
        }
    }
    private void shiftArr(int index){
        if (size - index >= 0) {
            System.arraycopy(arr, index + 1, arr, index, size - index);
        }
    }

    @Override
    public void clear(){
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(", ");
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
