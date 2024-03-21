package bancolombia.com;

import java.util.Scanner;

enum DiaDeLaSemana {
    Domingo, Lunes, Martes, Miercoles, Jueves, Viernes, Sabado
}

public class ImprimeDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un dia de la semana: ");
        String dia = teclado.nextLine();
        DiaDeLaSemana hoy=DiaDeLaSemana.Domingo;
        try {
            // Se hace la conversion de String a tipo enum
            hoy = DiaDeLaSemana.valueOf(dia);
//        DiaDeLaSemana hoy = DiaDeLaSemana.Viernes;
//        String resultado= switch (hoy){
//            case Lunes -> "A trabajar duro!!!";
//            case Martes -> "Resolviendo las solicitudes de trabajo";
//            default -> "Haciendo alguna otra actividad";
//        };
        switch (hoy){
            case Lunes:
                System.out.println("Hoy comienza la semana");
                break;
            case Martes:
                System.out.println("Aprendiendo Java en Martes");
                break;
            case Miercoles:
                System.out.println("Estoy a mitad de la semana!!!");
                break;
            default:
                System.out.println("Es otro dia!!!!");
                break;
        }
        }catch(Exception problema){
            System.out.println("No hay ese dia de la semana!!! :("+dia);
            System.out.println(problema.getMessage());
        }
    }
}
