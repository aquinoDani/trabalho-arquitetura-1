
public class Registrador {
	private String nome;
	private int valor;
	
	public Registrador(String nome) {
		this.nome = nome;
	}
	public Registrador(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public int getValor() {
		return this.valor;
	}
	public String getNome() {
		return this.nome;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean eRegistrador(String str) {
		String aux = "$";
		return str.charAt(0) == aux.charAt(0);
	}
}
