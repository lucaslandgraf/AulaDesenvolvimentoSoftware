
public class exercicio1 {
	public static void main(String[] args) {
		String texto1 = ">> O operador de concatenação (+) ";
		String texto2 = "é muito prático";
		String texto3 = texto1 + texto2 + "!";
		System.out.println(texto3 + "<<");
		System.out.println(">> 2 + 5 = " + 2 + 5); // incorreto
		System.out.println(">> 2 + 5 = " + (2 + 5)); // correto
	}
}
