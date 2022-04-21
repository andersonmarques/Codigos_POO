/**
 * Escreva um algoritmo para calcular e exibir o valor de e
 * [e = (2*x)-(y%7)+(z*5)]. (x = 10; y = 49 e z = 25);
 */
public class Exercicio14 {
    public static void main(String[] args) {
        int x = 10;
        int y = 49;
        int z = 25;
        //o simbolo % significa resto da divisao
        int e = (2 * x) - (y % 7) + (z * 5);

        System.out.println("O valor de e é: "+e+".");
    }
}
