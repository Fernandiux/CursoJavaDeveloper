package bancolombia.com;

public class Arreglos {
    public static void main(String[] args) {

//        int años [] = new int[5];
        int años[] = {0, 6, 8, 10, 12};

        int edades[][] = {{15, 25, 10, 31, 50, 27, 90}, {1, 2, 3}};
        for (int[] arr : edades) { //foreach
            for (int j : arr) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
        System.out.println("=".repeat(30));
        // Igual que C y C++
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.print(edades[i][j] + ",");
            }
            System.out.println();
        }
    }
}
