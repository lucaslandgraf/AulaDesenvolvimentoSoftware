import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File {
	private static String fileName = "arquivo.txt";
	
	public void writeInsertStatement(String insert) {
		try {
			FileWriter fw = new FileWriter(fileName, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("\n" + insert + "\n");
			pw.close();
		} catch (IOException e) {
			System.err.println("Erro ao escrever no arquivo.txt \n" + e.getMessage());
		}
	}
}
