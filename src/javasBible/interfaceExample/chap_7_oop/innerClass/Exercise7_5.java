package javasBible.interfaceExample.chap_7_oop.innerClass;

class Product {
    int price; //제품의 가격
    int bonusPoint; //제품구매 시 제공하는 보너스 점수

    Product() {

    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {

    }

    public String toString() {
        return "Tv";
    }
}

public class Exercise7_5 {
}
