package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio03 {
    
    public static void main(String[] args){
        
        double num1, num2;
        Scanner s = new Scanner(System.in);
        
        System.out.print("N�mero 1: ");
        num1 = s.nextDouble();
        System.out.print("N�mero 2: ");
        num2 = s.nextDouble();
        
        System.out.print("Adi��o: ");
        System.out.println(num1 + num2);
        System.out.print("Subtra��o: ");
        System.out.println(num1 - num2);
        System.out.print("divis�o: ");
        System.out.println(num1/num2);
        System.out.print("Multiplica��o: ");
        System.out.println(num1*num2);
        
    }
}
