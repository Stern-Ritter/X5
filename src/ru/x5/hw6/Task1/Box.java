package ru.x5.hw6.Task1;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box (){
        list = new ArrayList<>();
    }

    public void addFruit(T fruit){
        list.add(fruit);
    }

    public double getWeigth() {
        double weightSum = 0;
        for (T obj : list) {
            weightSum += obj.getWeigth();
        }
        return weightSum;
    }

    public boolean compare(Box box) {
        return this.getWeigth() == box.getWeigth();
    }

    public void moveTo(Box<T> box){
        list.addAll(box.getList());
        box.getList().clear();
    }
}
