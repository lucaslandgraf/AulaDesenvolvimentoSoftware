import java.util.ArrayList;
import java.util.List;

public class TestaVeiculos {
    public static void main(String[] args) {
        Carro carro1 = new Carro("HB20");
        Bicicleta bicicleta1 = new Bicicleta("Floresta");
        Caminhao caminhao1 = new Caminhao(2000.0);

        List<Veiculo>  listVeiculos = new ArrayList<>();
        listVeiculos.add(carro1);
        listVeiculos.add(bicicleta1);
        listVeiculos.add(caminhao1);

        for (Veiculo item : listVeiculos) {
            System.out.println(item.toString());
            item.acelerar();
        	item.frear();
        	item.obterTipo();
        }
		
	}
}
