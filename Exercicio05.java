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
        
        System.out.print("Número: ");
        num = s.nextInt();
        
        if ((num % 2) == 0) {
            
           System.out.println(num + " é par"); 
        } else {
            
            System.out.println(num + " é ímpar");
        }
        
                
    }
}
