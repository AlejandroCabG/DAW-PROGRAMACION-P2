/*6. Transforma los caracteres del String “Cadenas de texto y coleccionables” en ASCII. Muéstralos de la siguiente manera:
ASCII: 67 es equivalente a: C
ASCII: …*/
public class EX_06 {
    public static void main(String[] args) {
        String text = "Cadenas de texto y coleccionables";
        int i = 0;

        //Primera forma
        for(int x = 0;x < text.length(); x++)
            System.out.println("ASCII: " + text.codePointAt(x) + " es equivalente a: " + text.charAt(x));
        //Segunda forma
        /*while(i < text.length()) {
            System.out.println("ASCII: " + (int) text.charAt(i) + " es equivalente a: " + text.charAt(i));
            i++;

        }*/
    }
}
