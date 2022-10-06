import java.util.Scanner;

/*2. Dadas dos cadenas introducidas por el usuario, hay que juntarlas carácter a carácter. En caso de un espacio, ignorar
ese carácter. Por ejemplo, si la entrada es “Fran” y “Manu”, la salida será: “FMraanu”.*/
public class EX_02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cadena1;
        String cadena2;
        String cadena3 = "";
        System.out.print("Introduzca una primera cadena: ");
        cadena1 = entrada.nextLine();
        System.out.print("Introduzca una segunda cadena: ");
        cadena2 = entrada.nextLine();


        int longitud_max = (cadena1.length()>cadena2.length())?(cadena1.length()):(cadena2.length());

        for(int i = 0; i<longitud_max ;i++){
            if(i>=cadena1.length()){

            }else{
                System.out.print(cadena1.charAt(i));
            }
            if(i>=cadena2.length()) {
            }else{
                System.out.print(cadena2.charAt(i));
                }

            }
        }

    }

