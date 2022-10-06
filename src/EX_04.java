import java.util.Scanner;

/*4. Realice el ejercicio 3 usando indexOf.*/
public class EX_04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cadena1;
        char cadena2;

        System.out.print("Introduzca una frase: ");
        cadena1 = entrada.nextLine();
        System.out.print("Introduzca un caracter: ");
        cadena2 = entrada.next().charAt(0);

        int indice = cadena1.indexOf(cadena2);
        System.out.println("Posiciones: "+indice);
        String pos = "";

        for (int i = 0; i < cadena1.length(); i++){
            if(cadena1.charAt(i) == cadena2){
                pos += i+",";
            }

        }
        System.out.println(pos);
    }
}