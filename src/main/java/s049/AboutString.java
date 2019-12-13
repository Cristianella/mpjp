package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));

        System.out.println("s < t: " + s.compareTo(t));
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3); // mi genera una nuova stringa, dove la posizione numero 3 non è inclusa.
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); // dalla posizione numero 3 in poi stampa.

        System.out.println("u equals u2? " + u.equals(u2)); // mi ritorna un valore booleano e confronta il contenuto delle stringhe. 
        System.out.println("u == u2? " + (u == u2)); // perché si tratta di Stringhe e hanno indirizzi diversi, quindi non si usa " == ";

        System.out.println("First index of 'l' is s: " + s.indexOf('l')); // mi ritorna la posizione in cui è contenuto un determinato valore. Parte da destra.
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l')); // parte da sinistra a controllare la posizione di un determinato valore.
        System.out.println("there is no 'x' in s: " + s.indexOf('x')); // ritorna -1 se il valore non è presente.
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty()); // va a vedere se la stringa è vuota e non ci deve essere null!!

        System.out.println("s length: " + s.length()); // va a vedere la lunghezza di una determinata stringa.

        String s2 = s.replace('l', 'q'); // permette di sostituisce un determinato carattere.
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2); // 

        String[] splits = "one for me, one for you".split(" "); // lavora su una stringa e la fa a pezzi usando un separatore. Il metodo mi ritorna un array di stringhe.
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token); // for each che mi stampa per ogni riga la stringa contenente nell'array.
        }
        String joined = String.join(" ", splits); // E' UN METODO STATICO: ricrea la stringa di array.
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase()); // converte tutti i caratteri in stampatello. Ritorna una COPIA in stampatello.
        System.out.println("lower: " + "SHUT UP!".toLowerCase()); // converte tutti i caratteri in minuscolo. Ritorna una COPIA in minuscolo.

        System.out.println("trim [" + " la la la ".trim() + "]"); // elimina gli spazi bianchi alla fine e all'inizio della stringa.
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x)); // è un metodo che mi converte la x nella sua rappresentazione stringa, ed è un metodo statico.
                                                                             // funziona anche se si ha Null.
    }
}
