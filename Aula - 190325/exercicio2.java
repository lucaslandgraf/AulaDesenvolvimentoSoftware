/* 2. Escreva um algoritmo que utiliza um arraylist para armazenar nomes de
pessoas. O seu algoritmo deve solicitar nomes inteiros de pessoas
enquanto a palavra “Fim” não foi digitada. Após isso, o seu algoritmo
deve solicitar ao usuário um nome e verificar se esse nome está no
arraylist. Em caso positivo, o seu algoritmo deve imprimir a posição do
nome no arraylist. • No mesmo algoritmo, solicite um nome ao usuário e remova o mesmo do arraylist. */

package aula19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		String nomeDigitado = "Fim";
		do {
			System.out.println("Digite um nome completo, ou fim para sair");
			nomeDigitado = scan.nextLine();
			// Verificar se o nome já exite no ArrayList
			
			if(nomes.contains(nomeDigitado)){
				System.out.println("O nome " + nomeDigitado + " esta na posição " + nomes.indexOf(nomeDigitado));                                                 
			}else {
				nomes.add(nomeDigitado);
			}
			
			
			nomes.add(nomeDigitado); // adiciona o nome no ArrayList
			
		}while(!nomeDigitado.equalsIgnoreCase("Fim"));
		
		System.out.println("Digite um nome que deseja remover do ArrayList");
		String nomeRemover = scan.nextLine();
		if(nomes.contains(nomeRemover)) {
			nomes.remove(nomes.indexOf(nomeRemover));
		}else{
			System.out.println("Nome" + nomeRemover + " não está cadastrado");
		}
		nomes.remove(nomes.indexOf(nomeRemover));
		scan.close(); // Encerra o leitor
	}
}
