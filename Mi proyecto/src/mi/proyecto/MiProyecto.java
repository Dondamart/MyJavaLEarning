
package mi.proyecto;
import java.util.Scanner;
/**
 *
 * @author danim
 */
public class MiProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa una palabra:");
        Scanner teclado = new Scanner(System.in);
        String resultado= teclado.next();
        while(!resultado.equals("salir") ){
            System.out.println(resultado+ " - ");
            System.out.println("Siguiente palabra: ");
            resultado=teclado.next();
        }
        
    }
    
}
