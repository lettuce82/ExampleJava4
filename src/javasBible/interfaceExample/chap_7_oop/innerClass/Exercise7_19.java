package javasBible.interfaceExample.chap_7_oop.innerClass;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
    }
}

class Buyer {
    int money = 1000;
    Product1[] cart = new Product1[3]; //구입한 제품을 저장하기 위한 배열
    int i = 0; //Product배열 cart에 사용될 index

    void buy(Product1 product) {
        if (money < product.price) {
            return;
        } else {
            this.money -= product.price;
            Add(product);
        }
    }

    void Add(Product1 product) {
        if (i >= cart.length) {
            //1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
            Product1[] newCart = new Product1[cart.length * 2];
            //1.1.2 기존의 장바구늬의 내용을 새로운 배열에 복사한다.
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            //1.1.3 새로운 자ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅇ바구니와          기존의ㅣㅣㅣㅣㅣ
            cart = newCart;
        }
    }

    void summary(Product1 product) {

    }
}

class Product1 {
    int price;

    Product1(int price) {
        this.price = price;
    }
}

class Tv1 extends Product1 {
    Tv1(){
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product1 {
    Computer(){
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product1 {
    Audio(){
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}