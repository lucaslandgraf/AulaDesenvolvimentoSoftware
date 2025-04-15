import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<String> names = new ArrayList();
		// adicionar elementos no array
		
		names.add("Nome 1");
		names.add("Nome 2");
		names.add("Nome 3");
		names.add("Nome 4");
		
		
		// Como buscar um elemento pelo índice get()
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		// Buscar índice a partir de um elemento
		int index = names.indexOf("Nome 2");		
		
		
		// Verifica se a lista esta vazia
		System.out.println(names.isEmpty());
		
		
		// Verifica se a lista contém algum elemento
		
		System.out.println(names.contains("Nome 14"));
		
		// Verifica o tamanho da lista
		System.out.println(names.size());
		
		// Limpa de vez a lista
		names.clear();
		System.out.println(names.isEmpty());
	}
}
