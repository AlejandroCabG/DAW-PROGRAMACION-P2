import java.util.Scanner;

/*3. Dada una frase y un carácter introducido por el usuario, indica en qué posiciones se encuentra ese carácter sin
utilizar indexOf.*/
public class EX_03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cadena1;
        char cadena2;

        System.out.print("Introduzca una frase: ");
        cadena1 = entrada.nextLine();
        System.out.print("Introduzca un caracter: ");
        cadena2 = entrada.next().charAt(0);

        String pos = "";

        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) == cadena2) {
                pos += i + ",";
            }

        }
        System.out.println(pos);
    }
}
