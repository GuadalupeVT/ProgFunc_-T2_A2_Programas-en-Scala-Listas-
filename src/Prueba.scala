import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object Prueba {

  //Metodo para leer la lista de palabras
  def crearLista(): ListBuffer[String] ={
    var listaPalabras = new ListBuffer[String]()
    println("¿Cuantas palabras deseas ingresar a la lista?")
    val n=readInt()
    for(i <- 0 until n){
      println("Ingresa palabra "+(i+1)+": ")
      listaPalabras+=readLine()
    }
    listaPalabras
  }

  //1. Escriba un programa que permita crear una lista de palabras y que, a continuación, pida una
  //palabra y diga cuántas veces aparece esa palabra en la lista.
  def numRepDePalabrasEnLista(): Unit ={

  }

  //2. Escriba un programa que permita crear una lista de palabras y que, a continuación, pida dos
  //palabras y sustituya la primera por la segunda en la lista.


  //3. Escriba un programa que permita crear una lista de palabras y que, a continuación, pida una
  //palabra y elimine esa palabra de la lista.


  //4. Escriba un programa que permita crear dos listas de palabras y que, a continuación, elimine de la
  //primera lista los nombres de la segunda lista


  //5. Escriba un programa que permita crear dos listas de palabras y que, a continuación, escriba las
  //siguientes listas (en las que no debe haber repeticiones):
  //Lista de palabras que aparecen en las dos listas.
  //Lista de palabras que aparecen en la primera lista, pero no en la segunda.
  //Lista de palabras que aparecen en la segunda lista, pero no en la primera.
  //Lista de palabras que aparecen en ambas listas.
  //Nota: Para evitar las repeticiones, el programa deberá empezar eliminando los elementos
  //repetidos en cada lista.


  //6. Escriba una función que tome una lista de números y devuelva la suma acumulada, es decir, una
  //nueva lista donde el primer elemento es el mismo, el segundo elemento es la suma del primero
  //con el segundo, el tercer elemento es la suma del resultado anterior con el siguiente elemento y así
  //sucesivamente. Por ejemplo, la suma acumulada de [1,2,3] es [1, 3, 6].


  //7. Escribe una función llamada “obtenerPalindromas" que busque todas las palabras palíndromas de
  //una lista. Ejemplo de palabras inversas: radar, oro, rajar, rallar, salas, somos, etc...


  //8. Escribe una función llamada “obtenerCapicuas" que busque todos los números capicúas de una
  //lista.

  //9. Dada una lista de números enteros, escribir una función que:
  //a) Devuelva una lista con todos los que sean primos.
  //b) Devuelva la sumatoria y el promedio de los valores.
  //c) Devuelva una lista con el factorial de cada uno de esos números.


  //10. . Escribir una función empaquetar para una lista, donde empaquetar significa indicar la repetición
  //de valores consecutivos mediante el par: (valor, cantidad de repeticiones). Agregar esto en otra
  //lista.

  def main(args: Array[String]): Unit = {
    crearLista()
  }

}
