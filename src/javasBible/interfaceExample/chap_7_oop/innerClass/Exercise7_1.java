package javasBible.interfaceExample.chap_7_oop.innerClass;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 | num == 3 | num == 8);
            cards[i] = new SutdaCard1(num, isKwang);
        }
    }

    void shuffle() {
        int j = (int) (Math.random() * cards.length);
        for (int i = 0; i < cards.length; i++) {
            SutdaCard1 temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    SutdaCard1 pick(int index) {

        if (index < 0 || index >= CARD_NUM) {
            return null;
        }
        return cards[index];
    }

    SutdaCard1 pick() {
        int index = (int) (Math.random() *  cards.length);
        return pick(index);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    //info() 대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}
