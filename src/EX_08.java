/*8. Escribe un programa que atraviese (itere) un ArrayList usando Lambdas.*/

import java.util.ArrayList;
public class EX_08 {
    public static void main(String[] args) {
        ArrayList<String> tenistas = new ArrayList<String>();
        tenistas.add("Federer");
        tenistas.add("Nadal");
        tenistas.add("Djokovic");
        tenistas.add("Murray");

        tenistas.forEach( (n) -> { System.out.println(n); } );

       // Escribe un programa que convierte una List en un Array.
        ArrayList <String> list = new ArrayList<String>();
        list.add("Federer");
        list.add("Nadal");
        list.add("Djokovic");
        list.add("Murray");
        //print con el contenido de la lista
        System.out.print("Los elementos de la lista son :");
        System.out.println(list);
        //creo un String array
        //list.size() para conocer el tamaño de la list
        String[] array =new String[list.size()];
        System.out.println("Los elementos del array son :");
        //assigning of element of list one by one to array ar
        for(int i=0;  i < list.size();  i++) {
            array[i]=list.get(i);
            //print de los elementos del array
            System.out.println(array[i]);
        }
    }
}
