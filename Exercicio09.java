package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio09 {
    
    public static void main(String[] args){
        
        int num;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Escolha um número: ");
        num = s.nextInt();
        
        if (num > 10 && num < 100){
            
            System.out.printf("%.5f",Math.pow(num,2));
            
        } else if (num > 100 || num < 10) {
            
            System.out.printf("%.5f ", Math.sqrt(num));
        }
        
    }
    
}