package bancolombia.com;

import java.util.ArrayList;

public class ArreglosDinamicos {
    public static void main(String[] args) {
        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("10"); // arreglo.add(new Integer(10)); a esto se le llama Autoboxing
        arreglo.add("hola");
        arreglo.add(1,"adios");
        System.out.println("Longitud actual:"+arreglo.size());

        for(String s:arreglo){
            System.out.println(s);
        }

        arreglo.remove("10");
        System.out.println(arreglo);
        System.out.println("Longitud actual:"+arreglo.size());


    }
}
