package bancolombia.com;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ManejoExcepciones {
    public static void main(String[] args) throws HuboUnProblemaException{
        int [] numeros = {1,2,3,4,5,6,7};
        for(int i=0;i<numeros.length;i++){
            System.out.println("numero: "+numeros[i]);
        }
//        String cadena=null;
        String cadena="Hola Mundo!!!";
        System.out.println(cadena.toLowerCase());

        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo!!!");
        }
        if(numeros.length==0) {
            throw new HuboUnProblemaException("No suficientes numeros para proseguir");
        }else{
            System.out.println("Procesa los numeros");
        }
    }
}
