/* 2) Faça um programa em Java que mostre a tabuada de 1 a 10 em uma mesma
tela. De 1 a 5 no primeiro bloco e do 6 ao 10 no segundo. Obrigatório o uso de
laço de repetição. */

public class exercicio2 {
	public static void main(String [] args){
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " * " + i + " = " + (j*i) + "\t");
			}
			System.out.println("");
			for(int m = 6; m <= 10; m++) {
				System.out.print(m + " * " + i + " = " + (m*i) + "\t");
			}
		}
	}
}
