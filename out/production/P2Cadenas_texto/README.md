## P2: Cadenas de texto y coleccionables

1. Lee una cadena de texto que contenga un nombre y los apellidos de alguien, devolviéndolos en formato “Apellidos, 
Iniciales”. Por ejemplo, si la entrada es “Francisco Mesas Cervilla”, la salida será: “Mesas Cervilla, F.”. Si la 
entrada es “Francisco José López Pérez”, la salida será: “López Pérez, F. J.”.

Mediante la función .split  String [] separa = nombre.split(" "); consigo que separe los apellidos y con 
__char caracter = nombre.charAt(0);__ obtengo el primer caracter del nombre para que solo me lo muestre. 

   
2. Dadas dos cadenas introducidas por el usuario, hay que juntarlas carácter a carácter. En caso de un espacio, ignorar 
ese carácter. Por ejemplo, si la entrada es “Fran” y “Manu”, la salida será: “FMraanu”.
Hago un if ternario __int longitud_max = (cadena1.length()>cadena2.length())?(cadena1.length()):(cadena2.length());__ 
para comprobar establecer el tamaño máximo de las cadenas introducidas y, posteriormente hago un bucle for e if para que 
vaya recorriendo las cadenas introducidas y vaya cogiendo carácter a carácter y los vaya seleccionando en función de su posición 
usando **charAt**.
3. Dada una frase y un carácter introducido por el usuario, indica en qué posiciones se encuentra ese carácter sin utilizar
indexOf.
Creo el bucle for, que muestro a continuación, para que vaya recorriendo la cadena y un bucle if que busca exactamente el carácter 
introducido en la segunda cadena y lo muestro por pantalla.
for (int i = 0; i < cadena1.length(); i++) {
if (cadena1.charAt(i) == cadena2) {
pos += i + ",";
}
4. Realice el ejercicio 3 usando indexOf.
El bucle es el mismo que en el ejercicio anterior con la diferencia que ahora defino una variable
**__int indice = cadena1.indexOf(cadena2);__** que busca en la primera cadena la posición del carácter introducido en la 
segunda cadena.
5. Dada una cadena de texto con una contraseña, indicar si la contraseña es fuerte o débil. Consideramos una contraseña
fuerte si contiene 8 o más caracteres, y entre ellos, por lo menos una mayúscula, una minúscula, un símbolo y un dígito.
para realizarlo he definido las variables: passwordLenght de 8, minusculas, mayusculas,simbolos,digitos y caracter. 
Seguidamente he hecho un bucle for que comprueba que el tamaño de la contraseña sea 8 y si es así entra en el bucle if, else if
para comprobar si se trata de una letra mayúscula con la función isUpperCase, minúscula isLowerCase o digito conisDigit.

6. Transforma los caracteres del String “Cadenas de texto y coleccionables” en ASCII. Muéstralos de la siguiente manera:
ASCII: 67 es equivalente a: C
ASCII: …
Hago un bucle for con la función codePointAt que hace un cast del carácter introducido a int. 
7. Escribe un programa que atraviese (itere) un ArrayList usando Iterator.
Creo un arrayList y luego uso iterator para recorrer el array y que me los muestre todos.

8. Escribe un programa que atraviese (itere) un ArrayList usando Lambdas.
Escribe un programa que convierte una List en un Array.
Uso el operador lambda (->) separa la declaración de parámetros de la declaración del cuerpo de la función.
Parámetros:
Al tener parámetros es necesario utilizar paréntesis.
Cuerpo de lambda:
Cuando el cuerpo de la expresión lambda tiene más de una línea se hace necesario utilizar las llaves y es necesario
 incluir la clausula return en el caso de que la función deba devolver un valor .
9. Escribe un programa que añada elementos a un hashSet y muestra el contenido.
Uso __HashSet<String> tenistas = new HashSet<String>();__ para crear una colección al igual que un arrayList.
10. Escribe un programa para ordenar un HashMap por su valor (Investigar sobre TreeMap, ArrayList, Collections.sort()… 
Existen varias soluciones posibles).
