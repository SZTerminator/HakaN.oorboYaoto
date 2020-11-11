package com.company.dictionary;

//        Задание 2 Создайте проект, используя IntelliJ IDEA.
//        Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования
//        его экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
//        экземпляром, должен включать метод добавления элемента, индексатор для получения значения элемента по
//        указанному индексу и свойство только для чтения для получения общего количества элементов.

import java.util.ArrayList;

public class MyList<T> {
    private ArrayList<T> ls = new ArrayList<>();
    private int addedItems;
    private int removedItems;
    public void add(T object){
        ls.add(object);
    }

    public int getAddedItems() {
        return addedItems;
    }

    public int getRemovedItems() {
        return removedItems;
    }

    public T get(int index){
        addedItems++;
        return ls.get(index);
    }
    public int size(){
        return ls.size();
    }
    public void remove(T object){
        ls.remove(object);
        removedItems++;
    }

}
