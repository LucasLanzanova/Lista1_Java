package Atividades1609;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Atividade4 {
        public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = s.nextInt();
        
        System.out.print("Digite o tamanho da pizza (broto, pequena, média, grande): ");
        String tamanhoPizza = s.next().toLowerCase();

        int pessoasPorPizza;
        
        if (tamanhoPizza.equals("broto")) {
            pessoasPorPizza = 1;
        } else if (tamanhoPizza.equals("pequena")) {
            pessoasPorPizza = 2;
        } else if (tamanhoPizza.equals("média")) {
            pessoasPorPizza = 3;
        } else if (tamanhoPizza.equals("grande")) {
            pessoasPorPizza = 4;
        } else {
            System.out.println("Tamanho de pizza inválido.");
            return;
        }
        int quantidadePizzas = (int) Math.ceil((double) quantidadePessoas / pessoasPorPizza);

        System.out.println("Quantidade de pizzas necessárias: " + quantidadePizzas);
    
    }
}
