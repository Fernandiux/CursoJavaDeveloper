package bancolombia.com;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
//        ProcesaCadenas.reemplazaCaracter();
//        ProcesaCadenas.convierteMayusculasMinusculas();
//        ProcesaCadenas.imprimeLongitudFrase();
//        ProcesaCadenas.separaPalabras();
        System.out.println("El 10 es mayor que el 8? "+(10.8<=120));

        Persona p1 = new Persona();
        p1.nombre="Fernando";
        p1.edad=57;
        Persona p2 = new Persona();
        p2.nombre="Felipe";
        p2.edad=47;

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        for(Persona p:personas){
            System.out.println(p.nombre);
        }

    }
}