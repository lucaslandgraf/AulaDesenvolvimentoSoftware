/*Faça um programa em Java que mostre a tabuada de um número escolhido
pelo usuário (entre 1 e 10) Obrigatório o uso de laço de repetição. Repita o
exercício cm os 3 laços.*/

import java.util.Scanner;

public class exercicio1 {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 10 e veja sua tabuada: ");
		int numero = scan.nextInt();
		if(numero < 1 || numero > 10) {
			System.out.println("Número inválido. Fim do programa!");
		}else {
			for(int i = 1; i <= 10; i++) {
				System.out.println(numero + " * " + i  + " = " + (numero*i));
			}
		System.out.println("Versão com WHILE");
		int w = 1;
		while(w <= 10) {
			System.out.println(numero + " * " + w  + " = " + (numero*w));
			w++;
		}
		System.out.println("Versão com DO WHILE");
		int dw = 1;
		do {
			System.out.println(numero + " * " + dw  + " = " + (numero*dw));
			dw++;
		}while(dw <= 10);
		}
	}
}
