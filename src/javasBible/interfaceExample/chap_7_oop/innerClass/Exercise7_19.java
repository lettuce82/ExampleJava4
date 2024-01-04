package javasBible.interfaceExample.chap_7_oop.innerClass;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Tv1());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();

    }
}

class Buyer {
    int money = 1000;
    Product1[] cart = new Product1[3];
    int i = 0;

    void buy(Product1 p) {
        //1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        } else {
            //1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
            money -= p.price;
            //1.3 장바구니에 구입한 물건을 담는다. (add메서드 호출)
            add(p);
        }
    }

    void add(Product1 p) {
        //1.1 i의 값이 장바구니의 크기보다 같거나 크면
        if (i >= cart.length) {
            //1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
            Product1[] newCart = new Product1[cart.length * 2];
            //1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
            System.arraycopy(cart,0,newCart,0, cart.length);
            //1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
            cart = newCart;
        }
        //1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
        cart[i++] = p;
    }

    void summary() {
        String itemList = "";
        int sum = 0;

        //1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
        //1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
        for (int j = 0; j < i; j++) {
            itemList += cart[j].toString() + ", ";
            sum += cart[j].price;
        }

        System.out.println("구입한 물건: " + itemList);
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);
    }
}

class Product1 {
    int price;

    Product1(int price) {
        this.price = price;
    }
}
class Tv1 extends Product1 {
    Tv1() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product1 {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product1 {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}
