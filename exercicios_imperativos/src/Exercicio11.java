/**
* Elabore um algoritmo/programa que calcule e mostre a
* taxa de consumo em km/l que um carro tem em um deslocamento.
* Devem ser criadas variáveis para a distância percorrida 
* (em kilômetros), a quantidade de litros consumidos e o valor da 
* taxa de consumo (em km/l). 
* O cálculo é feito pela fórmula:
* taxaDeConsumo = distancia / litros
*/
public class Exercicio11 {
    public static void main(String[] args) {
        double distanciaKM = 161;
        double litros = 30;

        double taxaConsumo = distanciaKM / litros;

        System.out.println("A taxa de consumo é "+taxaConsumo+" km/l");
    }
}
