/*5. Dada una cadena de texto con una contraseña, indicar si la contraseña es fuerte o débil. Consideramos una contraseña
fuerte si contiene 8 o más caracteres, y entre ellos, por lo menos una mayúscula, una minúscula, un símbolo y un dígito.*/
import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        int passwordlength = 8, mayusculas = 0, minusculas=0;
        int simbolo = 0, digitos = 0;
        char caracter;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca la contraseña: ");
        String password = entrada.nextLine();

        int total = password.length();
        if(total < passwordlength)
        {
            System.out.println("\n TLa contraseña es inválida!");
           //return;
        }
        else
        {
            for(int i=0; i<total; i++)
            {
                caracter = password.charAt(i);
                if(Character.isUpperCase(caracter)) {
                    mayusculas = 1;
                }else if(Character.isLowerCase(caracter)) {
                    minusculas = 1;
                }else if(Character.isDigit(caracter)) {
                    digitos = 1;
                }else{
                    simbolo = 1;
                }
            }
            if(mayusculas==1 && minusculas==1 && digitos==1 && simbolo==1) {
                System.out.println("\nLa contraseña es fuerte.");
            }else {
                System.out.println("\nLa contraseña es débil.");
            }
        }
    }
}