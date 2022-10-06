import java.util.HashSet;
/*9. Escribe un programa que añada elementos a un hashSet y muestra el contenido.*/
public class EX_09 {
        public static void main(String[] args) {
            HashSet<String> tenistas = new HashSet<String>();
            tenistas.add("Federer");
            tenistas.add("Nadal");
            tenistas.add("Djokovic");
            tenistas.add("Murray");
            System.out.println(tenistas);
        }
    }
