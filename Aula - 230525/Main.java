
public class Main {
	public static void main(String[] args) {
		try {
			int[] MyNumbers = {1, 2, 3};
			System.out.println(MyNumbers[10]);
		}catch(Exception e) {
			System.out.println("Algo deu errado. \n" + e);
		}finally {
			System.out.println("O 'try catch' acabou.");
		}
	}
}
