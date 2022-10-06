import java.util.Scanner;

/*1. Lee una cadena de texto que contenga un nombre y los apellidos de alguien, devolviéndolos en formato “Apellidos, Iniciales”.
 Por ejemplo, si la entrada es “Francisco Mesas Cervilla”, la salida será: “Mesas Cervilla, F.”. Si la entrada es “Francisco
 José López Pérez”, la salida será: “López Pérez, F. J.”.*/
public class EX_01 {
    public static void main(String[] args) {

        String nombre ="Alejandro Cabrera Gonzalez";

        char caracter = nombre.charAt(0);
        String [] separa = nombre.split(" ");
        String apellido = separa[1];
        String apellido2 = separa[2];


        System.out.println(apellido+" "+apellido2+" "+caracter);

    }
}
