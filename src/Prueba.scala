import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object Prueba {

  //Metodo para leer la lista de palabras
  def crearLista(p:Int): ListBuffer[String] ={
    var listaPalabras = new ListBuffer[String]()
    println("¿Cuantas palabras deseas ingresar a la lista "+p+"?")
    var n=readInt()
    for(i <- 0 until n){
      println("Ingresa palabra "+(i+1)+": ")
      listaPalabras+=readLine()
    }
    listaPalabras
  }

  //Metodo para crear la lista de numeros
  def crearListaNum(): ListBuffer[Int]={
    var lista = new ListBuffer[Int]()
    println("¿Cuantas numeros deseas en la lista?")
    var n=readInt()
    for(i <- 0 until n){
      lista+=(math.random * (100-10) + 20).toInt
    }
   lista
  }

  //Metodod para ingresar palabras
  def pedirPalabra(): String ={
    println("Ingresa la palabra: ")
    val palabra=readLine()
    palabra
  }

  //1. Escriba un programa que permita crear una lista de palabras y que, a continuación, pida una
  //palabra y diga cuántas veces aparece esa palabra en la lista.
  def numRepDePalabrasEnLista(palabra:String, lista: => ListBuffer[String]): Unit ={
    var sum=0
    for (elemento<- lista){
      if(elemento == palabra){
        sum+=1
      }
    }
    println("La palabra "+palabra+" aparece en la lista "+sum+" veces")
  }

  //2. Escriba un programa que permita crear una lista de palabras y que, a continuación, pida dos
  //palabras y sustituya la primera por la segunda en la lista.
  def sustitucionEnLaLista(palabra1:String, palabra2:String,lista: => ListBuffer[String]): ListBuffer[String] ={
    var sum=0
    for(i <- 0 until lista.size){
      if(lista(i)== palabra1){
        sum+=1
        lista.remove(i)
        lista.insert(i,palabra2)
      }
    }
    lista
  }


  //3. Escriba un programa que permita crear una lista de palabras y que, a continuación, pida una
  //palabra y elimine esa palabra de la lista.
  def eliminarPalabra(palabra:String,lista: => ListBuffer[String]): ListBuffer[String] ={
    var sum=0
    for(i <- 0 until lista.size){
      if(lista(i)== palabra){
        sum+=1
      }
    }
    for(e <- 0 until sum){
      lista-=palabra
    }
    lista
  }

  //4. Escriba un programa que permita crear dos listas de palabras y que, a continuación, elimine de la
  //primera lista los nombres de la segunda lista
  def eliminarPalabrasEnLaPrimeraDeLaSegunda(lista1: => ListBuffer[String], lista2: => ListBuffer[String]): ListBuffer[String] ={
    var list=lista1
    for(i <- 0 until lista2.size){
      list=eliminarPalabra(lista2(i),lista1)
    }
    list
  }


  //5. Escriba un programa que permita crear dos listas de palabras y que, a continuación, escriba las
  //siguientes listas (en las que no debe haber repeticiones):
  //Lista de palabras que aparecen en las dos listas.
  def unionDeListas(lista1: => ListBuffer[String], lista2: => ListBuffer[String]): ListBuffer[String] ={
    var listaPalabrasUnidas = lista1
    for(e <- 0 until lista2.size) {
      listaPalabrasUnidas+=lista2(e)
    }
    listaPalabrasUnidas
  }
  //Lista de palabras que aparecen en la primera lista, pero no en la segunda.
  //Lista de palabras que aparecen en la segunda lista, pero no en la primera.
  //Lista de palabras que aparecen en ambas listas.
  def unionDeListasSinRep(lista1: => ListBuffer[String], lista2: => ListBuffer[String]): ListBuffer[String] ={
    var listaN1=eliminarPalabrasEnLaPrimeraDeLaSegunda(lista1,lista2)
    var listaN2=eliminarPalabrasEnLaPrimeraDeLaSegunda(lista2,lista1)
    var listaPalabrasUnidasSinRep = ListBuffer[String]()
    listaPalabrasUnidasSinRep=listaN1
    for(e <- 0 until listaN2.size) {
      listaPalabrasUnidasSinRep+=listaN2(e)
    }
    listaPalabrasUnidasSinRep
  }
  //Nota: Para evitar las repeticiones, el programa deberá empezar eliminando los elementos
  //repetidos en cada lista.


  //6. Escriba una función que tome una lista de números y devuelva la suma acumulada, es decir, una
  //nueva lista donde el primer elemento es el mismo, el segundo elemento es la suma del primero
  //con el segundo, el tercer elemento es la suma del resultado anterior con el siguiente elemento y así
  //sucesivamente. Por ejemplo, la suma acumulada de [1,2,3] es [1, 3, 6].
  def listaSumaAculumada(lista: => ListBuffer[Int]):ListBuffer[Int]={
    var listaSuma = new ListBuffer[Int]()
    var sum=0
    for(e <- 0 until lista.size) {
      sum+=lista(e)
      listaSuma+=sum
      //println(sum)
    }
    //println(sum)
    listaSuma
  }


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
    var listaPalabras1=crearLista(1)
    var listaPalabras2=crearLista(2)
    var listaNumeros=crearListaNum()
    println(listaPalabras1)
    println(listaPalabras2)

    //Impresion de menu
    var menu=0
    while (menu<10 && menu>=0){
      println("------------- MENU --------------")
      println("Selecciona una opción....")
      println("0. Buscar una palabra en la lista y contar repeticiones")
      println("1. Sustituir una palabra por otra en la lista")
      println("2. Eliminar una palabra de la lista")
      println("3. Eliminar de la primera lista las palabras de la segunda")
      println("4. Crear listas de repeticion: ")
      println("  * Lista de palabras que aparecen en las dos listas")
      println("  * Lista de palabras que aparecen en la primera lista, pero no en la segunda")
      println("  * Lista de palabras que aparecen en la segunda lista, pero no en la primera")
      println("  * Lista de palabras que aparecen en ambas listas")
      println("5. Buscar todas la palabras palindromas en la lista")
//Lista de numeros
      println("6. Lista de la suma acumulada de la lista")
      println("7. Obtener todos los números capicúas de una lista")
      println("8. Con la lista de numeros obtener: ")
      println("  * Lista con todos los que sean primos.")
      println("  * Sumatoria y promedio de los valores de la lista")
      println("  * Lista con el factorial de cada uno de esos números")
      println("9. Empaquetar la lista (numeros y palabras) ")
      println ("10. Salir")

      menu=readInt()

      //Evaluacion

      //Repeticion de una palabra en la lista1
      if(menu==0){
        numRepDePalabrasEnLista(pedirPalabra(),listaPalabras1)
      }

      //sustituir la primera por la segunda en la lista
      if(menu==1){
        print("La lista original es: ")
        print(listaPalabras1)
        println()
        listaPalabras1=sustitucionEnLaLista(pedirPalabra(),pedirPalabra(),listaPalabras1)
        println()
        print("La lista modificada es: ")
        print(listaPalabras1)
        println()

      }

      //Eliminar una palabra de la lista
      if(menu==2){
        print("La lista original es: ")
        print(listaPalabras1)
        println()
        listaPalabras1=eliminarPalabra(pedirPalabra(),listaPalabras1)
        println()
        print("La lista modificada es: ")
        print(listaPalabras1)
        println()
      }

      //eliminar de la primera lista los nombres de la segunda lista
      if(menu==3){
        print("La lista original es: ")
        print(listaPalabras1)
        println()
        listaPalabras1=eliminarPalabrasEnLaPrimeraDeLaSegunda(listaPalabras1,listaPalabras2)
        println()
        print("La lista modificada es: ")
        print(listaPalabras1)
        println()
      }

      //Listas sin repeticiones
      if(menu==4){
        print("Las listas originales son: ")
        println(listaPalabras1)
        println(listaPalabras2)
        println("................................")
        println("Las listas resultantes son: ")
        println("Lista de palabras que aparecen en las dos listas: ")
        println(unionDeListas(listaPalabras1,listaPalabras2))
        println("Lista de palabras que aparecen en la primera lista, pero no en la segunda: ")
        println(eliminarPalabrasEnLaPrimeraDeLaSegunda(listaPalabras1,listaPalabras2))
        println("Lista de palabras que aparecen en la segunda lista, pero no en la primera")
        println(eliminarPalabrasEnLaPrimeraDeLaSegunda(listaPalabras2,listaPalabras1))
        println("Lista de palabras que aparecen en ambas listas sin repeticiones")
        println(unionDeListasSinRep(listaPalabras1,listaPalabras2))
      }



      //Lista de suma acumulada
      if(menu==6){
        println("La lista de numeros original es: ")
        println(listaNumeros)
        println("La suma acumulada: ")
        println(listaSumaAculumada(listaNumeros))
      }

    }
  }

}
