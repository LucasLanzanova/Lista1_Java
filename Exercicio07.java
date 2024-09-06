package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio07 {
    
    public static void main(String[] args){
        
        int num1, num2;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Número 1: ");
        num1 = s.nextInt();
        System.out.print("Número 2: ");
        num2 = s.nextInt();
        
        System.out.println("Maior: " + (num1>num2));
        System.out.println("Menor: " + (num1<num2));
        System.out.println("Igual: " + (num1==num2));
        System.out.println("Diferente: " + (num1!=num2));
        
    }
    
}
