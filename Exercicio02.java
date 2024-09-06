package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio02 {
    
    public static void main(String[] args){
        
        String nome;
        String cor;
        String esporte;
        String genero;
        int idade;
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
            
        System.out.print("Nome: ");
        nome = s.nextLine();
        
        System.out.print("Idade: ");
        idade = n.nextInt();
        
        System.out.print("Genero: ");
        genero = s.nextLine();
        
        System.out.print("Cor favorita: ");
        cor = s.nextLine();

        System.out.print("Esporte praticado: ");
        esporte = s.nextLine();
        
    }
    
}
