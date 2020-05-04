package lesson11;

// при использовании примитивного типа данных (primitive data types) в параметре метода применяется не сама переменная а ее значение

// когда в параметре используется ссылочная переменная (reference data types) используется копия этой переменной

import org.jetbrains.annotations.NotNull;

public class ParamMethod {

    String color;
    String engine;
    int doorsAmount;

    ParamMethod(String color, String engine, int doorsAmount) {
        this.color = color;
        this.engine = engine;
        this.doorsAmount = doorsAmount;
    }

    static void changeDoorsAmount(@NotNull ParamMethod car, int newDoorsAmount) {
        car.doorsAmount = newDoorsAmount;
    }

    static void exchangeColor(@NotNull ParamMethod car1, @NotNull ParamMethod car2) {
        String tempCarColor = car1.color;
        car1.color = car2.color;
        car2.color = tempCarColor;
    }

}

class CarTest {

    public static void main(String[] args) {

        ParamMethod car1 = new ParamMethod("red", "V6", 3);

        System.out.println(car1.doorsAmount);
        ParamMethod.changeDoorsAmount(car1, 4);
        System.out.println(car1.doorsAmount);

        ParamMethod car2 = new ParamMethod("green", "V8", 5);

        System.out.println(car1.color);
        System.out.println(car2.color);

        ParamMethod.exchangeColor(car1, car2);

        System.out.println(car1.color);
        System.out.println(car2.color);
    }

}
