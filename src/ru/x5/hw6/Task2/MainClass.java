package ru.x5.hw6.Task2;

public class MainClass {
    public static void main(String[] args) {
        //Тестирование методов класса MyArrayList
        MyArrayList<Integer> intArrayList = new MyArrayList<>();
        MyArrayList<String> strArrayList = new MyArrayList<>();
        System.out.println(intArrayList.size());
        System.out.println(strArrayList.size());
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);
        strArrayList.add("one");
        strArrayList.add("two");
        strArrayList.add("three");
        strArrayList.add("four");
        strArrayList.add("five");
        System.out.println(intArrayList);
        System.out.println(strArrayList);
        System.out.println(intArrayList.size());
        System.out.println(strArrayList.size());
        System.out.println(intArrayList.get(0));
        System.out.println(intArrayList.get(4));
        //System.out.println(intLinkList.get(5));
        System.out.println(strArrayList.get(0));
        System.out.println(strArrayList.get(4));
        //System.out.println(strLinkList.get(5));
        intArrayList.remove(0);
        intArrayList.remove(3);
        //intLinkList.remove(-1);
        System.out.println(intArrayList);
        strArrayList.remove(1);
        strArrayList.remove(0);
        //strLinkList.remove(4);
        System.out.println(strArrayList);
        intArrayList.remove((Integer)3);
        intArrayList.remove((Integer)4);
        intArrayList.remove((Integer)5);
        System.out.println(intArrayList);
        strArrayList.remove("one");
        strArrayList.remove("seven");
        strArrayList.remove("four");
        System.out.println(strArrayList);
        intArrayList.clear();
        strArrayList.clear();
        System.out.println(intArrayList.size());
        System.out.println(strArrayList.size());

        //Тестирование методов класса MyLinkedList
        MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
        MyLinkedList<String> strLinkedList = new MyLinkedList<>();
        System.out.println(intLinkedList.size());
        System.out.println(strLinkedList.size());
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        strLinkedList.add("one");
        strLinkedList.add("two");
        strLinkedList.add("three");
        strLinkedList.add("four");
        strLinkedList.add("five");
        System.out.println(intLinkedList);
        System.out.println(strLinkedList);
        System.out.println(intLinkedList.size());
        System.out.println(strLinkedList.size());
        System.out.println(intLinkedList.get(0));
        System.out.println(intLinkedList.get(4));
        //System.out.println(intLinkList.get(5));
        System.out.println(strLinkedList.get(0));
        System.out.println(strLinkedList.get(4));
        //System.out.println(strLinkList.get(5));
        intLinkedList.remove(0);
        intLinkedList.remove(3);
        //intLinkList.remove(-1);
        System.out.println(intLinkedList);
        strLinkedList.remove(1);
        strLinkedList.remove(0);
        //strLinkList.remove(4);
        System.out.println(strLinkedList);
        intLinkedList.remove((Integer)3);
        intLinkedList.remove((Integer)4);
        intLinkedList.remove((Integer)5);
        System.out.println(intLinkedList);
        strLinkedList.remove("one");
        strLinkedList.remove("seven");
        strLinkedList.remove("four");
        System.out.println(strLinkedList);
        intLinkedList.clear();
        strLinkedList.clear();
        System.out.println(intLinkedList.size());
        System.out.println(strLinkedList.size());
    }
}
