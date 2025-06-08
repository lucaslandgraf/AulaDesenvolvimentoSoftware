
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa p = new Pessoa("Juliana", "03030303", "232323232");
        pessoas.add(p);
        p = new Pessoa("Katia", "03030303", "232323232");
        pessoas.add(p);
        p = new Pessoa("Elisangela", "585666", "28989932");
        pessoas.add(p);

        System.out.println("Lista sem ordenação: \n"+ pessoas);
        Collections.sort(pessoas);
        System.out.println("Lista após a ordenação: \n"+ pessoas);

        Pessoa p2 = new Pessoa("José", "5656884787", "585858");    
        System.out.println("Busca binária pelo último obj add:" + Collections.binarySearch(pessoas, p));
        System.out.println("Busca binária obj não add:" + Collections.binarySearch(pessoas, p2));
        // Só encontra strings exatas: teste com Ana Carolina - retorna index 0

        List<Pessoa> pessoas2 = new ArrayList<>();
        Pessoa p1 = new Pessoa("Maria das Neves", "8585858", "787878");
        pessoas2.add(p1);
        p1 = new Pessoa("Adriano Silva", "8585858", "787878");
        pessoas2.add(p1);
        p1 = new Pessoa("Eliane Moraes", "8585858", "787878");
        pessoas2.add(p1);
        System.out.println("os arrayList não possuem números em comum?" +
                                                         Collections.disjoint(pessoas, pessoas2));
        p1 = new Pessoa("Eliane Moraes", "85858", "787878");
        p1.setNome("Teste 2");
        pessoas2.add(p1);
        // Por que não id 2 nomes iguais ????
        System.out.println("Quantas vezes Eliane Moraes aparece em peessoas2? "+ 
                                                    Collections.frequency(pessoas2, p1));
        System.out.println("Lista: "+ pessoas2);
        System.out.println("Menor valor: " + Collections.min(pessoas2) + 
                            " - Maior valor: "+ Collections.max(pessoas2));
        Collections.reverse(pessoas2);
        System.out.println("inteiros2 Invertido" + pessoas2);
    }
}
