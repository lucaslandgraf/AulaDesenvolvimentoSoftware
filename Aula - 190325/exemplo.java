package aula19;

import java.util.ArrayList;
import java.util.Scanner;

public class exemplo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>(); // Declaração
		Integer n = -1;
		
		do {
			System.out.println("Digite um número inteiro positivo ou -1 para sair");
			n = scan.nextInt();
			if(n != -1) {
				numeros.add(n); // Adiciona elementos ao ArrayList 
			}
		}while(n != -1);
		System.out.println("Foram registrados " + numeros.size() + " números. \n");
		// Remove o elemento 0 do ArrayList
		numeros.remove(0);
		// Exibindo valores do ArrayList
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		// Verificar se um valor existe no ArrayList
		
		System.out.println("Digite um número para busca-lo na arraylist: ");
		
		int buscar = scan.nextInt();
		
		if(numeros.contains(buscar)){
			System.out.println("O número " + buscar + " esta no ArrayList");
		}else {
			System.out.println("O número " + buscar + " NÃO esta no ArrayList");
		}
		
	}
}
