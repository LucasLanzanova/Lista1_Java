package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio04 {
    public static void main(String[] args){
        
        int num1, num2;
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Número 1: ");
        num1 = s.nextInt();
        System.out.print("Número 2: ");
        num2 = s.nextInt();
        
        if (num1>num2){
            
            System.out.println(num1 + " é maior que " +num2 );
            
        } else if (num1 < num2){
            
            System.out.println(num1 + " é menor que " +num2 );
            
        } else {
            
            System.out.println(num1 + " é igual a " + num2 );
            
        }
        
    }
}
