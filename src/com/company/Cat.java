package com.company;

public class Cat
{
    private double originWeight;
    private double weight;
    //        Создать у кошки константы: “количество глаз”, “минимальный вес” и “максимальный вес”.
    private static final double minWeight = 1000.0;
    private static final double maxWeight = 9000.0;
    private  final int amountOfEyes = 2;
    private double eatedFood;
    private boolean tail = true;
    private CatColors catColor;

    public CatColors getCatColor() {
        return catColor;
    }

    public void setCatColor(CatColors catColor) {
        this.catColor = catColor;
    }

    //        Создать у класса Cat статическую переменную count, которая будет увеличиваться,
//        если кошку создали, и убывать, если кошка взорвалась или умерла
private static int count;
    { // Так нормально?
        count++;
    }
    public Cat() {

        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;

    }
    //        Создать в классе Cat ещё один конструктор так,
    //        чтобы можно было создать кошку с весом переданным в конструктор
    public Cat(double weight){
        this.weight = weight;
        originWeight = weight;
    }
    //        Задание 7. Копирование объектов
//        Создать у кошки метод создания её “глубокой” копии.
//        Для создания копии кошки вы можете использовать метод копирования или конструктор копирования.
    public Cat(Cat cat){
    this.originWeight = cat.originWeight;
    this.weight = cat.weight;
    this.eatedFood = cat.eatedFood;
    this.catColor = cat.catColor;
    this.tail = cat.tail;

    }
    public Cat clone(Cat cat){
        return new Cat(this);
    };
    private void kill(){
        count--;
    }
    //        Создать статический метод getCount(), который будет возвращать количество кошек
    public static int getCount() {
        return count;
    }

     public void meow()
    {
        if (!this.isAlive()) {
            System.out.println("Cat is dead");
            return;
        }
        weight = weight - 1;
        System.out.println("Meow");
    }
    public void feed(){
        feed(Math.random() * 150);
    }
    //        *Задание c : придумайте способ проверять жива ли кошка или нет на основе значения ее веса,
    //        и используя это запретите кормить, пить, ходить в туалет неживой кошке.

    //        метод возвращающий результат проверки “Жива ли кошка?” можно назвать isAlive(),
//        если кошка жива - мы ожидаем возврат значение true
    public boolean isAlive(){
        if(minWeight < weight && weight < maxWeight)
            return true;
        else return false;
    }
    public void  feed(Double amount) {
        if (!isAlive()) {
            System.out.println("Cat is dead");
            return;
        }
        eatedFood += amount;
        weight = weight + amount;

        if (!isAlive())
            kill();
    }
    public void drink(Double amount) {
        if (!this.isAlive()) {
            System.out.println("Cat is dead");
            return;
        }
        weight = weight + amount;
        if (!isAlive())
            kill();
    }
    public Double getWeight() {
        return weight;
    }
    public String getStatus() {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
        return "Exploded";
    }
        else if(weight > originWeight) {
        return "Sleeping";
    }
        else {
        return "Playing";
    }
    }
//        Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
    public double getEatedFood() {
        return eatedFood;
    }
    public void pee(){
        if (!this.isAlive()) {
            System.out.println("Cat is dead");
            return;
        }
        weight-= Math.random() *300;
        System.out.println("A cat's bathroom is dirty now");
        if (!isAlive())
            kill();
    }
    //        Рекомендации: имена методов, возвращающие значения полей типа boolean,
//        принято именовать с префиксами is/has. Например:
//    intelliJ : isHasTail

    //        метод возвращающий результат проверки “Есть ли у кошки хвост?” можно назвать hasTail(),
//        если кошка с хвостом - мы ожидаем возврат значение true
    public boolean hasTail() {
        return tail;
    }
}

