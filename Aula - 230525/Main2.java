import java.io.IOException;

public class Main2 {
	void m() throws IOException{
		throw new IOException("Erro de dispositivo");
	}
	public static void main(String args[]) {
	try {
		Main2 obj = new Main2();
		obj.m();
	}catch(IOException e) {
		System.out.println("Exceção tratada");
	}
	}
}
