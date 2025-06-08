
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAula {
    public static void main(String[] args) throws Exception {
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(50);
        inteiros.add(41);
        inteiros.add(0);
        inteiros.add(-1);

        System.out.println("Lista sem ordenação: "+ inteiros);
        Collections.sort(inteiros);
        System.out.println("Lista após a ordenação: "+ inteiros);

        List<String> nomes = new ArrayList<>();
        nomes.add("Claudemir Junior");
        nomes.add("Ana Carolina");
        nomes.add("Eduardo Pelloso");
        System.out.println("Lista sem ordenação: "+ nomes);
        Collections.sort(nomes);
        System.out.println("Lista após a ordenação: "+ nomes);

        System.out.println("Busca binária 10:" + Collections.binarySearch(inteiros, 10));
        System.out.println("Busca binária 20:" + Collections.binarySearch(inteiros, 20));
        // Só encontra strings exatas: teste com Ana Carolina - retorna index 0
        System.out.println("Busca binária 'Ana':" + Collections.binarySearch(nomes, "Ana"));

        List<Integer> inteiros2 = new ArrayList<>();
        inteiros2.add(30);
        inteiros2.add(52);
        inteiros2.add(20);
        inteiros2.add(-10);
        inteiros2.add(100);
        System.out.println("os arrayList não possuem números em comum?" +
                                                         Collections.disjoint(inteiros, inteiros2));
        inteiros2.add(100);
        System.out.println("Quantas vezes 100 aparece em numeros2? "+ 
                                                    Collections.frequency(inteiros2, 100));
        System.out.println("Menor valor: " + Collections.min(inteiros2) + 
                            " - Maior valor: "+ Collections.max(inteiros2));
        Collections.reverse(inteiros2);
        System.out.println("inteiros2 Invertido" + inteiros2);

    }
}
