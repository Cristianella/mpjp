package s073;

public class Cat extends Mammal {
    private Tail tail;

    public Cat(int gestationDays, int tailLen) {
        super(gestationDays); // è un costruttore che mi chiama la classe madre. In questo casa "Mammal".
        this.tail = new Tail(tailLen); // this fa riferimento alla classe corrente.
    }

    @Override
    public String toString() {
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
