/* 7. Escreva uma aplicação capaz de receber 10 números (tipo ponto flutuante),
calcule e imprima:
• Os números digitados;
• A soma dos números;
• A média aritmética entre eles;
• O maior número;
• O menor número.
Obrigatório o uso de laço de repetição array.*/

import java.util.Scanner;

public class exercicio3 {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        double[] numeros = new double[10];  // Array para armazenar 10 números
	        double soma = 0;
	       
	        // Receber 10 números
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o número " + (i + 1) + " de 10: ");
	            numeros[i] = scan.nextDouble();  // Armazena o número no array
	        }
	        
	        // Imprimir os números digitados
	        System.out.println("\nNúmeros digitados:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
	            soma += numeros[i];
	        }
	  
	      	System.out.println("A soma dos números digitados é " + soma);
	        scan.close();  // Fechar o scanner após o uso
	    }
	}
