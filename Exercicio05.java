package Lista;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio05 {
    public static void main(String[] args){
        
        int num;
        Scanner s = new Scanner(System.in);
        
        System.out.print("N�mero: ");
        num = s.nextInt();
        
        if ((num % 2) == 0) {
            
           System.out.println(num + " � par"); 
        } else {
            
            System.out.println(num + " � �mpar");
        }
        
                
    }
}
