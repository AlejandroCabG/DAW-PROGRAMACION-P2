import java.util.ArrayList;
import java.util.Iterator;

/*7. Escribe un programa que atraviese (itere) un ArrayList usando Iterator.*/
public class EX_07 {
    public static void main(String[] args) {
        ArrayList<String> tenistas = new ArrayList<String>();
        tenistas.add("Federer");
        tenistas.add("Nadal");
        tenistas.add("Djokovic");
        tenistas.add("Murray");
        //Iterar para recorrer la colección de tenistas
        Iterator<String> itere = tenistas.iterator();
        //Mostrar por pantalla los elementos de la colección
        System.out.println(itere.next());
        System.out.println(itere.next());
    }
}
