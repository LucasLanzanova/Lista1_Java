package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio06 {
    
    public static void main(String[] args) {
        
        int num;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = s.nextInt();
        
        System.out.print(num + " elevado a 2: ");
        System.out.println(Math.pow(num,2));
        System.out.print(num + " elevado a 4: ");
        System.out.println(Math.pow(num,4));
        System.out.print(num + " elevado a 6: ");
        System.out.println(Math.pow(num,6));
        System.out.print(num + " elevado a 8: ");
        System.out.println(Math.pow(num,8));
        System.out.print(num + " elevado a 10: ");
        System.out.println(Math.pow(num,10));
        
                
    }
}
