package s073;

public class Tail {
    private int size;

    public Tail(int size) {
        this.size = size;
    }

    public int getSize() { // mi ritorna il valore della lunghezza della coda.
        return size;
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
