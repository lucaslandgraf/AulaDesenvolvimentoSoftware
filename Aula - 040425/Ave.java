import java.lang.classfile.Superclass;

public class Ave extends Animal {
	private String local;
	private boolean migracao = false;
	
	public Ave() {}
	public Ave(String nome, float peso, int recinto, String local, boolean migracao) {
		super(nome, peso, recinto);
		this.local = local;
		this.migracao = migracao;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public boolean isMigracao() {
		return migracao;
	}
	public void setMigracao(boolean migracao) {
		this.migracao = migracao;
	}
	
	
	@Override
	public void emitirSom(int quantidade) {
		for(int i = 1; i <= quantidade; i++) {
			System.out.print("có ");
		}
		System.out.println("");
	}
	
	public String tostring() {
		return super.toString() + "\n" + "Local: " + this.local + "Migração: " + (this.migracao == true ? "SIM" : "NÃO"); // Operador Ternário
	}
	
}
