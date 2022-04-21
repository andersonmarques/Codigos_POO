/**
* Escreva um algoritmo para solucionar e exibir o resultado da seguinte questão: 
* um pendrive pode armazenar 8GB de dados, sabendo que ele já está armazenando 3584MB, 
* quanto esse pendrive ainda pode armazenar em GB?
*/
public class Exercicio15 {
    public static void main(String[] args) {
        double capacidadeTotal = 8; //em Giga
        double valorJaArmazenado = 3584; //em Mega

        //convertendo valorArmazenado de Mega para Giga
        // 1GB -- 1024MB
        // x   -- 3584MB
        // x = 3584/1024
        //Esse resultado estara em Giga
        valorJaArmazenado = valorJaArmazenado / 1024;

        double armazenamentoSobrando = capacidadeTotal - valorJaArmazenado;

        System.out.println(armazenamentoSobrando);
    }
}
