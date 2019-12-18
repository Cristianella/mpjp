package s073;

public abstract class Mammal {
    protected int gestation; // è una proprietà (variabile all'interno della classe);

    public Mammal(int gestation) { //costruttore
        this.gestation = gestation; // quello di colore marrone è il valore che mi passa l'utente.
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
