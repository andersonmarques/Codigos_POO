import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/**
 * Crie um algoritmo/programa que receba os valores de x, y e z (todos reais) do
 * usuário,
 * calcule e mostre o resultado da seguinte expressão e:
 * e = (2*x)-(y/7)+(z*5)
 * 
 *    entrada                Saida
    15 20 40       |  O valor de e é: 227.14
 */
public class Exercicio18 {
    public static void main(String[] args) {
        // entrada
        Scanner input = new Scanner(System.in);
        Format format = new DecimalFormat("0.00");
        System.out.print("Digite os valores de x, y e z:\n");
        String[] valores = input.nextLine().split(" ");
        
        // processamento
        float x = Float.parseFloat(valores[0]);
        float y = Float.parseFloat(valores[1]);
        float z = Float.parseFloat(valores[2]);
        float e = (2 * x) - (y / 7) + (z * 5);

        // saida
        System.out.println("O valor de e é: "+format.format(e));
    }
}
