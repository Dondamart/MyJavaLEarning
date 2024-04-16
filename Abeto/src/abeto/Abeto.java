package abeto;
import java.util.Scanner;
/**
 *
 * @author danim
 */
public class Abeto {

    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce la altura:");
        int altura= teclado.nextInt();
        for (int fila = 0; fila < altura; fila++) {
            
            for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
                System.out.print(" ");    
            }
            
            for (int asterisco = 0; asterisco < (fila*2)+1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        int tronco=1;
        for (int base = 0; base < tronco; base++) {
            for (int espacio = 0; espacio <(altura-2); espacio++) {
                System.out.print(" ");    
            }
            System.out.print("||");
            System.out.println("");
        }
        

    }
    
}
