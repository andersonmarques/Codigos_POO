/**
 * Elabore um algoritmo/programa para calcular e mostrar 
 * o valor da conversão de uma quantia em dólares para reais. 
 * Crie variáveis para guardar o valor da cotação do dólar do dia,
 *  o valor em dólares e o valor do resultado da conversão. 
 * Use a fórmula:
 * quantiaEmReais = quantiaEmDolares * cotacaoDoDolar
 */
public class Exercicio10 {
    public static void main(String[] args) {
        float quantiaEmReais = 0;
        float quantiaEmDolares = 4.70f;
        float cotacaoDoDolar = 4.65f;
    
        quantiaEmReais = quantiaEmDolares * cotacaoDoDolar;
        System.out.println(quantiaEmReais);
    }
}
