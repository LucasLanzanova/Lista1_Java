package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio01 {
    
        public static void main(String[] args) {
            
        double nota;
        Scanner s = new Scanner(System.in);
        
            
        
        System.out.print("nota: ");
        nota = s.nextDouble();
               
        
        if (nota < 6 && nota > 4) {
            
            System.out.println("Precisa fazer prova sub");
        }
                    
        else if (nota>=6){
                
                System.out.println("Aprovado");
        }
        
        else {
            System.out.println("Reprovado");
        }
        }
}
