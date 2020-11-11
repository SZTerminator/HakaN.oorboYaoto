package com.company.dictionary;

//        Задание 1
//        Создайте проект, используя IntelliJ IDEA.
//        Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(),
//        который будет порождать экземпляры типа, указанного в качестве параметра типа
//        (указателя места заполнения типом – Т).

public class MyClass<T> {
    public static <T> Class<?> factoryMethod(T t){
        return t.getClass();
    }
}
