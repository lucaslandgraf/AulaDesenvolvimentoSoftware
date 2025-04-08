/*
A empresa de saneamento de uma cidade que controla o índice de poluição da água e
mantém 3 grupos de indústrias que são altamente poluentes para o meio ambiente.
• O índice de poluição aceitável varia de 0,06 até 0,16.
• Se o índice sobe para 0,25 as indústrias do 1ž grupo são intimadas a reduzirem em 50%
suas atividades;
• Se o índice crescer para 0,4 as industrias do 1ž e 2ž grupo são intimadas a suspenderem
suas atividades.
• Se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
• Desenvolva um programa em Java Orientado a objetos, que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

import java.util.Scanner;

public class ValorIndice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o índice de poluição: ");
        float valorLido = scan.nextFloat();

        Poluicao poluicao = new Poluicao();  // Cria objeto
        poluicao.setIndice(valorLido);       // Define valor do índice

        String resultado = poluicao.verificarAviso();  // Chama método que analisa
        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
