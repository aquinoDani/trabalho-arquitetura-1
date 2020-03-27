import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor extends Aplicacao{
	public String pathEntrada;
	public String pathSaida;
	public String[] linha;
	public BufferedReader br;
	public Decodificador decodificador;
	
	public Leitor(String pathEntrada, String pathSaida) {
		try {
			this.br = new BufferedReader(new FileReader(pathEntrada));
			this.pathEntrada = pathEntrada;
			this.pathSaida = pathSaida;
		}
		catch(IOException e) {}
	}
	public void lerLinha() {
		try {
			String aux = this.br.readLine();
			String[] vetAux = aux.split(",");
			String linhaAux = vetAux[0];
			for(int i = 1; i < vetAux.length; i++) {
				linhaAux += vetAux[i];
			}
			this.linha = linhaAux.split(" ");
			for(int i = 0; i < linha.length; i++) {
				System.out.println(linha[i]);
			}
			this.decodificador = new Decodificador(linha, pathSaida);
			decodificador.chamaInstrucao();
		}
		catch(IOException e) {
			
		}
	}
	public boolean temProximaLinha() {
		try {
			BufferedReader aux = new BufferedReader(new FileReader(pathEntrada));
			return aux.readLine() != null;
		}
		catch(IOException e) {
			return false;
		}
	}
}
