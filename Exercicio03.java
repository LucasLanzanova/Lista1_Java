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
        
        System.out.print("Número 1: ");
        num1 = s.nextDouble();
        System.out.print("Número 2: ");
        num2 = s.nextDouble();
        
        System.out.print("Adição: ");
        System.out.println(num1 + num2);
        System.out.print("Subtração: ");
        System.out.println(num1 - num2);
        System.out.print("divisão: ");
        System.out.println(num1/num2);
        System.out.print("Multiplicação: ");
        System.out.println(num1*num2);
        
    }
}
