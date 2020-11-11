package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Loader
{
    static Random ran = new Random();
    static ArrayList<Cat> cats = new ArrayList<>();
    public static void main(String[] args)
    {

        int x = ran.nextInt(6) + 5;
        //        Задание 1.Понятие класса и объекта
//        Создать 5-7 кошек и вызвать у них различные методы:

        for (int i = 0; i < ran.nextInt(2)+5;i++){
            //        создайте кошку
            cats.add(new Cat());
        }


        for (Cat cat:cats) {
            cat.drink(ran.nextDouble() * 200);
            cat.feed(ran.nextDouble() * 150);
            //        напечатайте в консоль вес созданных кошек
            System.out.println(cat.getStatus());
        }
        System.out.println(Cat.getCount());

        //        покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
        int i =0;
        for(Cat cat: getCats(2)){

            cat = getRadomCat();
            System.out.printf("cat #%s weight BEFORE %s\n",i,cat.getWeight());;
            cat.feed();
            System.out.printf("cat #%s weight AFTER %s\n",i,cat.getWeight());
            i++;
        }
        //        перекормите кошку
        Cat cat;
        cat = getRadomCat();
        while (cat.isAlive()){
            cat.feed();
        }
        //        "замяукайте" кошку до смерти
        cat = getRadomCat();
        while (cat.isAlive()){
            cat.meow();
        }

    {
        cat = getRadomCat();
        System.out.printf("Before Feeding %s\n",cat.getEatedFood());
        cat.feed();
        System.out.printf("Atfer Feeding %s\n",cat.getEatedFood());
        //        покормите кошку кормом весом 150.00
        cat = new Cat();
        cat.feed(150.0);
        //        вызовите метод pee() несколько раз
        cat.pee();
        cat.pee();
        cat.pee();
        //        распечатайте значение съеденного корма, в консоль должно напечататься 150.00
        System.out.println(cat.getEatedFood());
    }

        ;
        System.out.println(Cat.getCount());
    }

    public static Cat getRadomCat(){
        Cat cat;
        do {
            cat =  cats.get(ran.nextInt(cats.size()));
        }while (!cat.isAlive());
        return cat;
    }
    public static ArrayList<Cat> getCats(int amount){
        Iterator c = cats.iterator();
        Cat cat = new Cat();
        ArrayList<Cat> returnList = new ArrayList<>();
        while (returnList.size()<amount){
            cat = (Cat)c.next();
            if (cat.isAlive()){
                returnList.add(cat);
            }
        }
        return returnList;
    }
    //        Создать в главном классе Loader метод генерации котенка private static Cat getKitten(),
//        который будет возвращать кошку с весом 1100.00, используя конструктор в который передаем вес кошки,
//        как описано в видеоуроке. // Каком видеоуроке?
    private static Cat getKitten(){
        return new Cat(1100.0);
    }
}