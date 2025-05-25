import java.io.IOException;

public class App {
	void m() throws IOException{
		throw new IOException("Erro de dispositivo");
	}
	public static void main(String args[]) {
		Conta c1 = new Conta();
		c1.sacar(200);
	}
}
