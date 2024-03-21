package bancolombia.com;

import java.util.Scanner;

public class ProcesaCadenas {
    public static void reemplazaCaracter() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String frase = teclado.nextLine();
        System.out.print("Dame el caracter a reemplazar: ");
        String caracterAReemplazar = teclado.next();
        System.out.print("Dame el nuevo caracter: ");
        String caracterDeReemplazo = teclado.next();
        String nuevaFrase = frase.replace(caracterAReemplazar, caracterDeReemplazo);
        System.out.println("La nueva frase es:");
        System.out.println(nuevaFrase);
    }

    public static void convierteMayusculasMinusculas() {
        Scanner teclado = new Scanner(System.in);
        String respuesta = "fin";
        do {
            System.out.print("Dame una frase: ");
            String frase = teclado.nextLine();
            System.out.print("Deseas [ma]yusculas o [mi]nusculas o [fin]: ");
            respuesta = teclado.nextLine().toLowerCase();
//        if(respuesta.equals("ma")){
//            System.out.println("Frase en mayusculas:"+"\n"+frase.toUpperCase());
//        }else{
//            System.out.println("Frase en minusculas:");
//            System.out.println(frase.toLowerCase());
//        }
            switch (respuesta) {
                case "ma":
                    System.out.println("Frase en mayusculas:" + "\n" + frase.toUpperCase());
                    break;
                case "mi":
                    System.out.println("Frase en minusculas:");
                    System.out.println(frase.toLowerCase());
                    break;
                case "fin":
                    System.out.println("No hubo conversion!");
                    break;
            }
        }
        while (!respuesta.equals("fin"));
    }

    public static void imprimeLongitudFrase(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String frase = teclado.nextLine();
        System.out.println("La longitud de la frase es: "+frase.length());
    }

    public static void separaPalabras(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String frase = teclado.nextLine();
        String [] cadenas = frase.split(" ");
        for( String cadena:cadenas) {
            System.out.println(cadena);
        }
    }

    public static void extraeFrase(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String frase = teclado.nextLine();

        System.out.print("Qué quieres buscar?: ");
        String buscar = teclado.nextLine();

        if(frase.contains(buscar))
        {
            System.out.println("La frase original contiene la subfrase: "+ buscar);
            System.out.println("Se encuentra en la posición: "+ frase.indexOf(buscar));
        }
        else
        {
            System.out.println("La frase original no contiene la subfrase: "+ buscar);
        }
    }

}

