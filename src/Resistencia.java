
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
        System.out.println("Ingrese el r1");
         r1 = sc.nextInt();
        System.out.println("Ingrese el r2");
        r2 = sc.nextInt();
        System.out.println("Ingrese el r3");
        r3 = sc.nextInt();

        rt = 1/(1d/r1 + 1d/r2 + 1d/r3) ;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(" La resistencia total es de: " + df.format(rt) );



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}