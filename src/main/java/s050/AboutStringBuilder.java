package s050;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // se non si dice nulla i caratteri saranno 16.
        StringBuilder sb2 = new StringBuilder(20); // al costruttore dello StringBuilder si può associare un numero e questa è una cosa particolare.
        StringBuilder sb3 = new StringBuilder("hello"); // aggiunge a 5 altri 16 caratteri.
        
        System.out.println("capacity 1: " + sb.capacity()); // stampa la capacità della stringa, ovvero lo spazio allocato per il lavoro sullo string builder.
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity());
        
        System.out.println("appending: " + sb3.append(' ').append("world")); // non si creano nuove stringhe le modifiche avvengono sullo String builder originale. E' come la concatenazione.
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'"); // 
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2)); // lavora sull'intervallo e dice di elimare tutti i caratteri tra 5 a 10 con 10 escluso.
        
        System.out.println("index of \"elo\": " + sb3.indexOf("elo")); // esiste la sub stringa "elo" nel sb3?
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c")); // permette di inserire caratteri a partire da una certa posizione.
        
        System.out.println("current sb3 length: " + sb3.length());// inserisce la lunghezza dello String builder
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r")); // prende l'intervallo da 2 a 7 e sostituisce i valori con i valori che gli vengono passati.
        
        System.out.println("reversing: " + sb3.reverse()); // gira la frase. 
        
        sb3.setCharAt(5, 'a');
        System.out.println("setCharAt: " + sb3); // aggiunge un carattere in un determinato indice
        
        sb3.setLength(3);
        System.out.println("setLength: " + sb3); // permette di cambiare la lunghezza dello String builder 
    }
}
