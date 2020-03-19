import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Instrucao extends Aplicacao{
	public String pathSaida;
	public BufferedWriter bw;
	public Registradores regs;
	
	private String tipo;
	
	public Registrador r1;
	public Registrador r2;
	public Registrador r3;
	
	public Registrador $a0;
	public Registrador $a1;
	public Registrador $a2;
	public Registrador $a3;
	public Registrador $v0;
	
	public String rotulo;
	
	public int CONST;
	
	public Instrucao(String pathSaida, String tipo) {
		this.tipo = tipo;
		this.pathSaida = pathSaida;
		try {
			this.bw = new BufferedWriter(new FileWriter(pathSaida));
		}
		catch(IOException e) {
			
		}
	}
	public Instrucao(String pathSaida, String tipo, String rotulo) {
		this.tipo = tipo;
		this.rotulo = rotulo;
		this.pathSaida = pathSaida;
		try {
			this.bw = new BufferedWriter(new FileWriter(pathSaida));
		}
		catch(IOException e) {
			
		}
	}
	public Instrucao(String pathSaida, String tipo, Registrador r1) {
		this.tipo = tipo;
		this.r1 = r1;
		this.pathSaida = pathSaida;
		try {
			this.bw = new BufferedWriter(new FileWriter(pathSaida));
		}
		catch(IOException e) {
			
		}
	}
	public Instrucao(String pathSaida, String tipo, int constante) {
		this.tipo = tipo;
		this.CONST = constante;
		this.pathSaida = pathSaida;
		try {
			this.bw = new BufferedWriter(new FileWriter(pathSaida));
		}
		catch(IOException e) {
			
		}
	}
	public Instrucao(String pathSaida, String tipo, int constante, Registrador r1) {
		this.tipo = tipo;
		this.CONST = constante;
		this.r1 = r1;
		this.pathSaida = pathSaida;
		try {
			this.bw = new BufferedWriter(new FileWriter(pathSaida));
		}
		catch(IOException e) {
			
		}
	}
	public Instrucao(String pathSaida, String tipo, Registrador r1, Registrador r2, int constante) {
		this.tipo = tipo;
		this.r1 = r1;
		this.r2 = r2;
		this.CONST = constante;
		this.pathSaida = pathSaida;
		try {
			this.bw = new BufferedWriter(new FileWriter(pathSaida));
		}
		catch(IOException e) {
			
		}
	}
	public Instrucao(String pathSaida, String tipo, Registrador r1, Registrador r2) {
		if(tipo == "mult") {
			this.tipo = tipo;
			this.r1 = new Registrador("a0");
			this.r2 = new Registrador("a1");
			this.pathSaida = pathSaida;
			try {
				this.bw = new BufferedWriter(new FileWriter(pathSaida));
			}
			catch(IOException e) {
				
			}
		}
		if(tipo == "div") {
			this.tipo = tipo;
			this.r1 = new Registrador("a0");
			this.r2 = new Registrador("a1");
			this.pathSaida = pathSaida;
			try {
				this.bw = new BufferedWriter(new FileWriter(pathSaida));
			}
			catch(IOException e) {
				
			}
		}
		else {
			this.tipo = tipo;
			this.r1 = r1;
			this.r2 = r2;
			this.pathSaida = pathSaida;
			try {
				this.bw = new BufferedWriter(new FileWriter(pathSaida));
			}
			catch(IOException e) {
				
			}
		}
	}
	public Instrucao(String pathSaida, String tipo, Registrador r1, Registrador r2, Registrador r3) {
		this.tipo = tipo;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.pathSaida = pathSaida;
		try {
			this.bw = new BufferedWriter(new FileWriter(pathSaida));
		}
		catch(IOException e) {
			
		}
	}
//	public Registrador identificaORegistrador(String r) {
//		switch(r) {
//		case "$zero":
//			return $zero;
//		case "$at":
//			return $at;
//		case "$v0":
//			return $v0;
//		case "$v1":
//			return $v1;
//		case "$a0":
//			return $a0;
//		case "$a1":
//			return $a1;
//		case "$a2":
//			return $a2;
//		case "$a3":
//			return $a3;
//		case "$t0":
//			return $t0;
//		case "$t1":
//			return $t1;
//		case "$t2":
//			return $t2;
//		case "$t3":
//			return $t3;
//		case "$t4":
//			return $t4;
//		case "$t5":
//			return $t5;
//		case "$t6":
//			return $t6;
//		case "$t7":
//			return $t7;
//		case "$t8":
//			return $t8;
//		case "$t9":
//			return $t9;
//		case "$s0":
//			return $s0;
//		case "$s1":
//			return $s1;
//		case "$s2":
//			return $s2;
//		case "$s3":
//			return $s3;
//		case "$s4":
//			return $s4;
//		case "$s5":
//			return $s5;
//		case "$s6":
//			return $s6;
//		case "$s7":
//			return $s7;
//		case "$gp":
//			return $gp;
//		case "$sp":
//			return $sp;
//		case "$fp":
//			return $fp;
//		case "ra":
//			return $ra;
//		}
//		return $zero;
//	}
	public String getTipo() {
		return this.tipo;
	}
	public Registrador realizaOperacao() {
		switch(this.tipo) {
		case "add":
			this.r1.setValor(this.r2.getValor() + this.r3.getValor());
			try {
				this.bw.write(r1.getValor());
				System.out.println(r1.getValor() + "registrado no arquivo saída");
			}
			catch(IOException e) {
				
			}
			return r1;
//		case "addi":
//			this.r1.setValor(this.r2.getValor() + this.CONST);
//			return r1;
//		case "sub":
//			this.r1.setValor(this.r2.getValor() - this.r3.getValor());
//		case "mul":
//			this.r1.setValor(2);
//		case "div":
//			this.tipo = "aritmetica";
//		case "neg":
//			this.tipo = "aritmetica";
//		case "and":
//			this.tipo = "logica";
//		case "andi":
//			this.tipo = "logica";
//		case "or":
//			this.tipo = "logica";
//		case "ori":
//			this.tipo = "logica";
//		case "xor":
//			this.tipo = "logica";
//		case "nor":
//			this.tipo = "logica";
//		case "slt":
//			this.tipo = "logica";
//		case "slti":
//			this.tipo = "logica";
//		case "sll":
//			this.tipo = "deslocamento";
//		case "srl":
//			this.tipo = "deslocamento";
//		case "lw":
//			this.tipo = "acesso";
//		case "sw":
//			this.tipo = "acesso";
//		case "beq":
//			this.tipo = "desvio condicional";
//		case "bne":
//			this.tipo = "desvio condicional";
//		case "j":
//			this.tipo = "desvio incondicional";
//		case "jr":
//			this.tipo = "desvio incondicional";
//		case "jal":
//			this.tipo = "desvio incondicional";
//		case "nop":
//			this.tipo = "outro";
			default:
				return this.r1;
		}
	}
}
