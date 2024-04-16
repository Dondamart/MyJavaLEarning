
package vector;
import java.util.Scanner;

/**
 *
 * @author danim
 */
public class Vector {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num=teclado.nextInt();
        int vector[]= new int[num];
        for (int i = 0; i < num; i++) {
            vector[i]= i+10;
        }
        for (int i = 0; i <vector.length; i++) {
            System.out.println(vector[i]);    
        }
    }
}
