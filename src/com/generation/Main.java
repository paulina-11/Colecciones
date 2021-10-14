package com.generation;

import netscape.security.UserTarget;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
        //se debe declarar el tamaño del arreglo, son estaticos
	String universidades[];
	    universidades = new String[8];
	    universidades [0] = "ITVH";
        universidades [1] = "ULA";
        universidades [2] = "UAM";
        universidades [3] = "UADM";
        universidades [4] = "UNAM";
        universidades [5] = "UPN";
        universidades [6] = "IPN";
        universidades [7] = "TESCO";


        //Universidades se va guardando en el string universida
        for(String universidad : universidades){
            //imprimiendo
            System.out.println(universidad);
        }
*/

         //grupo de objetos, diferentes formas de coleccionarlas
        //array-set-map

        //SET
        //NO puede contener elementos duplicados
        //El orden de los elementos puede variar- sin orden especifico
        //iniciar con un valor minimo
        //Si repetimos solo coloca un valor
        //Es el más rápido de todos
        //para numero INTEGER
        Set<String>frutas =new HashSet<>(3);
        frutas.add ("Mango");
        frutas.add ("Fresa");
        frutas.add ("Pera");
        frutas.add ("Uva");
        frutas.add ("Melon");
        frutas.add ("Lima");


        for(String fruta : frutas) {
            //imprimiendo la variable donde almacenamos frutas y las recorre
            System.out.println(fruta);


        }
        System.out.println("----------------------------");


        //TreeSet
        //Es mas lento
        //Ordena los elementos por orden alfabetico
        Set<String> frutas2 = new TreeSet<>();
        frutas2.add ("Mango");
        frutas2.add ("Fresa");
        frutas2.add ("Pera");
        frutas2.add ("Uva");
        frutas2.add ("Melon");
        frutas2.add ("Lima");

        //imprimir
        for(String fruta : frutas2) {
            System.out.println(fruta);
        }


        System.out.println("---------------------");


        //LinkedHashSet
        //Da los valores de forma que los vas agregando al set
        //respeta el orden que vamos agregando elementos
        Set<String> frutas3 = new LinkedHashSet<>(4);
        frutas3.add ("Mango");
        frutas3.add ("Fresa");
        frutas3.add ("Pera");
        frutas3.add ("Uva");
        frutas3.add ("Melon");
        frutas3.add ("Lima");

        //imprimir
        for(String fruta : frutas3) {
            System.out.println(fruta);
        }


        System.out.println("-------------------");


        //LIST
        //Si admite documentos duplicados
        //Puede hacer busqueda de elementos
        //Se ejecuta dependiendo de como se ingresaron
        List<String> frutas4 = new ArrayList<>();

        frutas4.add ("Mango");
        frutas4.add ("Fresa");
        frutas4.add ("Pera");
        frutas4.add ("Uva");
        frutas4.add ("Melon");
        frutas4.add ("Lima");
        frutas4.add ("Mango");

        //imprimir
        for(String fruta : frutas4) {
            System.out.println(fruta);}

        System.out.println("-------Elemento seleccionado------------");
        //Aqui selecciona uno de los valores y es el que nos va mostar
        //ponemos el valor del array
        System.out.println(frutas4.get(3));
        //Se puede seleccionar tambien por nombre con indice especifico
        int indice = frutas4.indexOf("Melon");
        System.out.println(frutas4.get(indice));

        //LinkedList
        // Lista doblemente enlazada
        //El elemento saber que hay antes y despues de el
        //la fresa sabe que antes va el mando y despues la pera
        //tiene un mejor rendimiento
        List<String> frutas5 = new LinkedList<>();
        frutas5.add ("Mango");
        frutas5.add ("Fresa");
        frutas5.add ("Pera");
        frutas5.add ("Uva");
        frutas5.add ("Melon");
        frutas5.add ("Lima");
        frutas5.add ("Mango");
        for(String fruta : frutas5) {
            System.out.println(fruta);}



        //MAP
        //Clave y valor
        //1ER Elemento clave y 2do valor
        //No puede tener claves repetidas
        //Solo puede tener UN valor asociado a la clave
        //método PUT que nos permite colocar la clave y el valor
        //DICCIONARIOS


        Map<Integer,String> universidades = new HashMap<Integer,String>();
        universidades.put(1,"IPN");
        universidades.put(2,"UNAM");
        universidades.put(3,"UAEM");
        universidades.put(4,"UAM");
        universidades.put(5,"TESCO");
        //Se puede buscar datos dependiendo de su clave

        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());


            System.out.println(universidades.get(3));


        }

    }
}
