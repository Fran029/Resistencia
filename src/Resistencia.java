
import java.text.DecimalFormat;
import java.util.Scanner;
public class Resistencia {
    public static void main(String[] args) {

        // Se declaran las variables
        double rt;
        int r1;
        int r2;
        int r3;

        // Ingreso de datos por consola

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese el r1 (debe ser un valor mayor a cero):");
            r1 = sc.nextInt();
        } while (r1 <= 0);

        // Leer y verificar r2
        do {
            System.out.println("Ingrese el r2 (debe ser un valor mayor a cero):");
            r2 = sc.nextInt();
        } while (r2 <= 0);

        // Leer y verificar r3
        do {
            System.out.println("Ingrese el r3 (debe ser un valor mayor a cero):");
            r3 = sc.nextInt();
        } while (r3 <= 0);



        rt = 1/(1d/r1 + 1d/r2 + 1d/r3) ;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(" La resistencia total es de: " + df.format(rt) );



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}