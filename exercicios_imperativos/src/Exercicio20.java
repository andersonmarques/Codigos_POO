import java.util.Scanner;

/**
* Crie um algoritmo/programa que receba os valores do nome, idade e telefone 
* de uma pessoa e mostre-os no seguinte formato:
* Nome: <mostre o nome aqui>
* Idade: <mostre a idade aqui>
* Telefone: <mostre otelefone aqui>
*
*    entrada                         Saida
* Fulano 33 987654321       |  Nome: Fulano
*                              Idade: 33
*                              Telefone: 987654321
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome, idade e telefone:");
        String[] dados = input.nextLine().split(" ");
        System.out.println("Nome: "+dados[0]+"\nIdade: "+dados[1]+"\nTelefone: "+dados[2]);
    }
}
