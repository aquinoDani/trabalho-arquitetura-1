import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class Aplicacao {
//	public static Registrador $at;
//	public static Registrador $zero;
//	public static Registrador $v0;
//	public static Registrador $v1;
//	public static Registrador $a0;
//	public static Registrador $a1;
//	public static Registrador $a2;
//	public static Registrador $a3;
//	public static Registrador $t0;
//	public static Registrador $t1;
//	public static Registrador $t2;
//	public static Registrador $t3;
//	public static Registrador $t4;
//	public static Registrador $t5;
//	public static Registrador $t6;
//	public static Registrador $t7;
//	public static Registrador $s0;
//	protected static Registrador $s1;
//	protected static Registrador $s2;
//	public static Registrador $s3;
//	public static Registrador $s4;
//	public static Registrador $s5;
//	public static Registrador $s6;
//	public static Registrador $s7;
//	public static Registrador $t8;
//	public static Registrador $t9;
//	public static Registrador $gp;
//	public static Registrador $sp;
//	public static Registrador $fp;
//	public static Registrador $ra;
	public static void main(String[] args) {
		
		String pathEntrada = "C:\\Users\\Daniel\\Desktop\\TrabalhoArquitetura\\TrabalhoProject\\src\\Arquivos\\ArquivoEntrada.txt";
		String pathSaida = "C:\\Users\\Daniel\\Desktop\\TrabalhoArquitetura\\TrabalhoProject\\src\\Arquivos\\ArquivoSaida.txt";
		Leitor leitor = new Leitor(pathEntrada, pathSaida);
		while(leitor.temProximaLinha()) {
			leitor.lerLinha();
		}
		
	}

}
