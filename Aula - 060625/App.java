import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Integer> inteiros = new ArrayList<>();
		
		// Sorteador/Organizador de números
		
		inteiros.add(10);
		inteiros.add(50);
		inteiros.add(41);
		inteiros.add(0);
		inteiros.add(-1);
		
		System.out.println("Lista sem ordenação: "+ inteiros);
		Collections.sort(inteiros);
		System.out.println("lista com ordenação: "+ inteiros);
		
		
		// Sorteador/Organizador de nomes
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Ana Carolina");
		nomes.add("Eduardo Pelloso");
		nomes.add("Claudemir Junior");
		
		System.out.println("Lista antes da ordenação: "+ nomes);
		Collections.sort(nomes);
		System.out.println("Lista após a ordenação: "+ nomes);
		

		// Sorteador/Organizador na forma Binária
		
		System.out.println("Busca binária 10: "+ Collections.binarySearch(inteiros, 10));
		System.out.println("Busca binária 'Ana Carolina': " + Collections.binarySearch(nomes, "Ana Carolina"));
		
		// Só encontra String exatas: teste com Ana Carolina - retorna index 0
		
		System.out.println("Busca binária 'Ana': " + Collections.binarySearch(nomes, "Ana"));
		
		List<Integer> inteiros2 = new ArrayList<>();
		
		inteiros2.add(30);
		inteiros2.add(52);
		inteiros2.add(20);
		inteiros2.add(-10);
		inteiros2.add(100);
		
		System.out.println("Os ArrayList não possuem números em comum? "+ Collections.disjoint(inteiros, inteiros2));
		
		inteiros2.add(100);
		
		System.out.println("Quantas vezes 100 aparece em números 2? "+ Collections.frequency(inteiros2, 100));
		
		System.out.println("Menor valor: "+ Collections.min(inteiros2) + 
						   " \nMaior valor: "+ Collections.max(inteiros2));
		
		Collections.reverse(inteiros2);
		System.out.println("inteiros2 invertido: " + inteiros2);
		
	}
}
