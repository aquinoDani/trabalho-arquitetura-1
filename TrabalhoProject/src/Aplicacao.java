import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

public class Aplicacao {
	public static Registrador $at = new Registrador("$at", 0);
	public static Registrador $zero = new Registrador("$zero", 0);
	public static Registrador $v0 = new Registrador("$v0", 0);
	public static Registrador $v1 = new Registrador("$v1", 0);
	public static Registrador $a0 = new Registrador("$a0", 0);
	public static Registrador $a1 = new Registrador("$a1", 0);
	public static Registrador $a2 = new Registrador("$a2", 0);
	public static Registrador $a3 = new Registrador("$a3", 0);
	public static Registrador $t0 = new Registrador("$t0", 0);
	public static Registrador $t1 = new Registrador("$t1", 0);
	public static Registrador $t2 = new Registrador("$t2", 0);
	public static Registrador $t3 = new Registrador("$t3", 0);
	public static Registrador $t4 = new Registrador("$t4", 0);
	public static Registrador $t5 = new Registrador("$t5", 0);
	public static Registrador $t6 = new Registrador("$t6", 0);
	public static Registrador $t7 = new Registrador("$t7", 0);
	public static Registrador $s0 = new Registrador("$s0", 0);
	public static Registrador $s1 = new Registrador("$s1", 2);
	public static Registrador $s2 = new Registrador("$s2", 3);
	public static Registrador $s3 = new Registrador("$s3", 0);
	public static Registrador $s4 = new Registrador("$s4", 0);
	public static Registrador $s5 = new Registrador("$s5", 0);
	public static Registrador $s6 = new Registrador("$s6", 0);
	public static Registrador $s7 = new Registrador("$s7", 0);
	public static Registrador $t8 = new Registrador("$s8", 0);
	public static Registrador $t9 = new Registrador("$s9", 0);
	public static Registrador $gp;
	public static Registrador $sp;
	public static Registrador $fp;
	public static Registrador $ra;
	
	public static void main(String[] args) {
		
		String pathEntrada = "C:\\Users\\Daniel\\Desktop\\trabArqGit\\trabalho-arquitetura-1\\TrabalhoProject\\src\\Arquivos\\ArquivoEntrada.txt";
		String pathSaida = "C:\\Users\\Daniel\\Desktop\\trabArqGit\\trabalho-arquitetura-1\\TrabalhoProject\\src\\Arquivos\\ArquivoSaida.txt";
		Leitor leitor = new Leitor(pathEntrada, pathSaida);
	
		Scanner ler = new Scanner(System.in);
		int op = 0;
		int continuar = 1;
		//String[] linha;
		
		Decodificador decodificador = new Decodificador();
		Instrucao instrucao;
		do {
			System.out.println("Trabalho de Arquitetura");
			System.out.println("1- Digitar entrada pelo Teclado");
			System.out.println("9- Sair");
			try {
				op = ler.nextInt();
				switch(op) {
				case 1:
					while(continuar == 1) {
						System.out.println("Digite uma linha de comando em Assembler: ");
						String comandos = ler.next();
						ler.nextLine();
						System.out.println(comandos);
						String[] linha = comandos.split(",");
						for(int i = 0; i < linha.length; i++) {
							System.out.println(linha[i]);
						}
						switch(linha.length) {
						case 3:
							System.out.println("entrou");
							String[] aux = linha[0].split(" ");
							if(aux[0] == "add") {
								identificaORegistrador(aux[1]).setValor(identificaORegistrador(linha[1].trim()).getValor() + identificaORegistrador(linha[2].trim()).getValor());
								System.out.println(identificaORegistrador(aux[1]).getValor());
							}
						}
						ler.nextLine();
						System.out.println("Deseja digitar mais uma linha?");
						System.out.println("1- Sim");
						System.out.println("2- Não");
						continuar = ler.nextInt();
					}
					System.out.println("Fim do programa.");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		} while(op != 9);
		
	}
	public static Registrador identificaORegistrador(String r) {
		switch(r) {
		case "$zero":
			return $zero;
		case "$at":
			return $at;
		case "$v0":
			return $v0;
		case "$v1":
			return $v1;
		case "$a0":
			return $a0;
		case "$a1":
			return $a1;
		case "$a2":
			return $a2;
		case "$a3":
			return $a3;
		case "$t0":
			return $t0;
		case "$t1":
			return $t1;
		case "$t2":
			return $t2;
		case "$t3":
			return $t3;
		case "$t4":
			return $t4;
		case "$t5":
			return $t5;
		case "$t6":
			return $t6;
		case "$t7":
			return $t7;
		case "$t8":
			return $t8;
		case "$t9":
			return $t9;
		case "$s0":
			return $s0;
		case "$s1":
			return $s1;
		case "$s2":
			return $s2;
		case "$s3":
			return $s3;
		case "$s4":
			return $s4;
		case "$s5":
			return $s5;
		case "$s6":
			return $s6;
		case "$s7":
			return $s7;
		case "$gp":
			return $gp;
		case "$sp":
			return $sp;
		case "$fp":
			return $fp;
		case "ra":
			return $ra;
		default:
			System.out.println("Não encontrado");
		}
		return $zero;
	}

}
