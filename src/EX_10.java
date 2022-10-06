import java.util.*;

/*10. Escribe un programa para ordenar un HashMap por su valor (Investigar sobre TreeMap, ArrayList, Collections.sort()…
Existen varias soluciones posibles).*/
public class EX_10 {
    public static void main(String[] args) {

        // Creo un objeto HashMap llamado tenistas
        HashMap<String, String> tenistas = new HashMap<String, String>();

        // Añado keys y valor (Nombre, Edad)
        tenistas.put("Federer", "Roger");
        tenistas.put("Nadal", "Rafael");
        tenistas.put("Djokovic", "Novak");

        TreeSet<String> valueSet = new TreeSet<>(tenistas.values());
        System.out.println("-- Sorted HashMap Values --");
        for(String str : valueSet) {
            System.out.println(" Value- " + str);
        }

    }
}
