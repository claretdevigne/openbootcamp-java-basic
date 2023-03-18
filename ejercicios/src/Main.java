import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {

    System.out.println("Ingrese una frase: ");
    Scanner scan = new Scanner(System.in);
    String text = scan.nextLine();
    Funciones funciones = new Funciones();
    String result = funciones.reverse(text);
    System.out.println(result);

    // Ejercicio 1: Crea un array unidimensional de Strings y recórrelo,
    // mostrando únicamente sus valores.
    System.out.println("\nEjercicio 1: Array unidimensional.");
    char[] arrayEjercicio1 = {'a', 'b', 'c', 'd', 'e'};
    for (char letter : arrayEjercicio1) {
      System.out.println(letter);
    }

    // Ejercicio 2: Crea un array bidimensional de enteros y recórrelo, mostrando la posición
    // y el valor de cada elemento en ambas dimensiones.
    System.out.println("\nEjercicio 2: Array Bidimensional.");
    int[][] arrayEjercicio2 = {{1, 2, 3}, {4, 5, 6}};

    for (int i = 0; i < arrayEjercicio2.length; i++) {
      for (int j = 0; j < arrayEjercicio2[i].length; j++) {
        System.out.println("Fila: " + i + ". Columna: " + j + ". Valor: " + arrayEjercicio2[i][j] + ".");
      }
    }

    // Ejercicio 3: Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
    // Elimina el 2o y 3er elemento y muestra el resultado final.
    System.out.println("\nEjercicio 3: Vector.");
    Vector<String> vector = new Vector<>();
    vector.add("Hola");
    vector.add("Bonjour");
    vector.add("Hello");
    vector.add("Hallo");
    vector.add("Ciao");
    vector.remove(1);
    vector.remove(1);
    System.out.println(vector);

    // Ejercicio 4: Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
    // si tuviésemos 1000 elementos para ser añadidos al mismo.

    // Tiene que ver con el rendimiento un vector por defecto su capacidad se duplica al desbordarse
    // y cada vez que realiza este proceso hace una copia del Vector original en otra vector que crea
    // lo que consume muchos recursos.

    // Ejercicio 4: Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
    // Recorre ambos mostrando únicamente el valor de cada elemento.
    System.out.println("\nEjercicio 4: ArrayList.");
    ArrayList<String> arrayList = new ArrayList<>(4);
    arrayList.add("Elemento 1");
    arrayList.add("Elemento 2");
    arrayList.add("Elemento 3");
    arrayList.add("Elemento 4");

    LinkedList<String> linkedList = new LinkedList<>(arrayList);

    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println("ArrayList[" + i + "]: " + arrayList.get(i) + ". LinkedList[" + i + "]: " + linkedList.get(i));
    }

    // Ejercicio 6: Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    // A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
    // y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
    // el primer "for" de relleno.

    System.out.println("\nEjercicio 6: Array List For Impares.");
    ArrayList<Integer> ejercicio6 = new ArrayList<>(10);

    for (int i = 0; i < ejercicio6.size(); i++) {
      ejercicio6.add(i);
    }

    for (int i = 0; i < ejercicio6.size(); i++) {
      if ( ejercicio6.get(i) % 2 != 0) {
        System.out.println(i);
      }
    }

    // Ejercicio 7: Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
    // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
    // mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

    System.out.println("\nEjercicio 7: Excepción Aritmética de división por cero: ");
    try {
      funciones.dividePorCero();
    } catch (ArithmeticException e) {
      System.out.println("Esto no puede hacerse.");
    } finally {
      System.out.println("Demo de código.");
    }

    // Ejercicio 8: Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
    // "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro
    // "fileIn" al fichero dado en "fileOut".

    System.out.println("\nEjercicio 8: InputStream y PrintStream.");
    funciones.copyFile("/Users/mian/Desktop/prueba.txt", "/Users/mian/Desktop/copia.txt");

  }
}

class Funciones {
  public String reverse(String text) {
    String newText = "";
    String[] array = text.split("");
    for (int i = array.length - 1; i >= 0; i-- ) {
      newText += array[i];
    }
    return newText;
  }

  public int dividePorCero() {
    return 2 / 0;
  }

  public void copyFile(String fileIn, String fileOut) {
    try {
      InputStream input = new FileInputStream(fileIn);
      byte[] data = input.readAllBytes();
      PrintStream print = new PrintStream(fileOut);
      print.write(data);
      System.out.println("Fichero copiado.");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}


