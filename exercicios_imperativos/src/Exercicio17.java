import java.util.Scanner;
/**
 * Crie um algoritmo/programa que receba três nomes quaisquer e 
 * os mostre na tela na ordem inversa da que foi fornecida.
 */
public class Exercicio17 {
    public static void main(String[] args) {
        //Avisando o compilador que iremos fazer entrada de dados via teclado com Scanner:
        Scanner input = new Scanner(System.in);

        // split() -> recorte em uma string de acordo com um padrao.         
        System.out.print("Digite 3 nomes:\n");
        String[] nomes = input.nextLine().split(" ");        
        System.out.println(nomes[2]+", "+nomes[1]+", "+nomes[0]);
    }
}
