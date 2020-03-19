
public class Registradores {
	public static Registrador $at;
	public static Registrador $zero;
	public static Registrador $v0;
	public static Registrador $v1;
	public static Registrador $a0;
	public static Registrador $a1;
	public static Registrador $a2;
	public static Registrador $a3;
	public static Registrador $t0;
	public static Registrador $t1;
	public static Registrador $t2;
	public static Registrador $t3;
	public static Registrador $t4;
	public static Registrador $t5;
	public static Registrador $t6;
	public static Registrador $t7;
	public static Registrador $s0;
	public static Registrador $s1;
	public static Registrador $s2;
	public static Registrador $s3;
	public static Registrador $s4;
	public static Registrador $s5;
	public static Registrador $s6;
	public static Registrador $s7;
	public static Registrador $t8;
	public static Registrador $t9;
	public static Registrador $gp;
	public static Registrador $sp;
	public static Registrador $fp;
	public static Registrador $ra;
	
	public Registradores() {
		
	}
	public Registrador identificaORegistrador(String r) {
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
		}
		return $zero;
	}
}
