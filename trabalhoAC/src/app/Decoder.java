package app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

	
public class Decoder  {
		
		private static String op;
		
	
		public Decoder(String[] commands) {
			
		}

		public static void decoderOp(String[] commands) throws IOException {
			int i ;
			File fout = new File("output.txt");
			FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			for(i=0 ; i < commands.length;i++) {
				switch(commands[i]) {
				case "add":
					op = "100000";
					bw.write(op);
					 
					System.out.print(op);
					break;
				
				case "addi":
					op = "1000";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "sub":
					op = "100010";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "mult":
					op = "11000";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "div":
					op = "11010";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "xor":
					op = "100110";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "nor":
					op = "100111";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "slt":
					op = "101010";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "and":
					op = "100100";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "sll":
					op = "0";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "srl":
					op = "10";
					bw.write(op);
					 
					System.out.print(op);
					break;
					
				case "jr":
					op = "1000";
					bw.write(op);
					 
					System.out.print(op);
					break;
					
				case "or":
					op = "100101";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "j":
					op = "10";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "jal":
					op = "11";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "lw":
					op = "100011";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "sw":
					op = "101011";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "beq":
					op = "100";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "bne":
					op = "101";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "slti":
					op = "1010";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "andi":
					op = "1100";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "ori":
					op = "1101";
					bw.write(op);
					 
					System.out.print(op);
					break;
					// A partir daqui variáveis 
				case "zero":
					op = "0";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "at":
					op = "1";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "v0":
					op = "10";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "v1":
					op = "11";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "a0":
					op = "100";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "a1":
					op = "110";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "a3":
					op = "111";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "t0":
					op = "1000";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "t1":
					op = "1001";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "t2":
					op = "1010";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "t3":
					op = "1011";
					bw.write(op);
					 
					System.out.print(op);
					break;
					
				case "t4":
					op = "1100";
					bw.write(op);
					 
					System.out.print(op);
					break;
					
				case "t5":
					op = "1101";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "t6":
					op = "1110";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "t7":
					op = "1111";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "t8":
					op = "11000";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s0":
					op = "10000";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s1":
					op = "10001";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s2":
					op = "10010";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s3":
					op = "10011";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s4":
					op = "10100";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s6":
					op = "10110";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s5":
					op = "10101";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s7":
					op = "10111";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "s8":
					op = "11000";
					bw.write(op);
					 
					System.out.print(op);
					break;		
				case "s9":
					op = "11001";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "k1":
					op = "11011";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "gp":
					op = "11100";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "sp":
					op = "10110";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "fp":
					op = "11101";
					bw.write(op);
					 
					System.out.print(op);
					break;
				case "ra":
					op = "11111";
					bw.write(op);
					 
					System.out.print(op);
					break;
					
				default: op="erro";
				break;
						
				}
				bw.write(op);
			}
			bw.close();
			
		}
		/*
		public static void decoderVar(String[] commands) throws IOException {
			int i ;
			FileWriter writer = new FileWriter("output.txt");
			PrintWriter printWriter = new PrintWriter(writer);
			for(i=0 ; i < commands.length;i++) {
				switch(commands[i]) {
				case "zero":
					op = "0";
					bw.write(op);
					System.out.print(op);
					break;
				case "at":
					op = "1";
					bw.write(op);
					System.out.print(op);
					break;
				case "v0":
					op = "10";
					bw.write(op);
					System.out.print(op);
					break;
				case "v1":
					op = "11";
					bw.write(op);
					System.out.print(op);
					break;
				case "a0":
					op = "100";
					bw.write(op);
					System.out.print(op);
					break;
				case "a1":
					op = "110";
					bw.write(op);
					System.out.print(op);
					break;
				case "a3":
					op = "111";
					bw.write(op);
					System.out.print(op);
					break;
				case "t0":
					op = "1000";
					bw.write(op);
					System.out.print(op);
					break;
				case "t1":
					op = "1001";
					bw.write(op);
					System.out.print(op);
					break;
				case "t2":
					op = "1010";
					bw.write(op);
					System.out.print(op);
					break;
				case "t3":
					op = "1011";
					bw.write(op);
					System.out.print(op);
					break;
					
				case "t4":
					op = "1100";
					bw.write(op);
					System.out.print(op);
					break;
					
				case "t5":
					op = "1101";
					bw.write(op);
					System.out.print(op);
					break;
				case "t6":
					op = "1110";
					bw.write(op);
					System.out.print(op);
					break;
				case "t7":
					op = "1111";
					bw.write(op);
					System.out.print(op);
					break;
				case "t8":
					op = "11000";
					bw.write(op);
					System.out.print(op);
					break;
				case "s0":
					op = "10000";
					bw.write(op);
					System.out.print(op);
					break;
				case "s1":
					op = "10001";
					bw.write(op);
					System.out.print(op);
					break;
				case "s2":
					op = "10010";
					bw.write(op);
					System.out.print(op);
					break;
				case "s3":
					op = "10011";
					bw.write(op);
					System.out.print(op);
					break;
				case "s4":
					op = "10100";
					bw.write(op);
					System.out.print(op);
					break;
				case "s6":
					op = "10110";
					bw.write(op);
					System.out.print(op);
					break;
				case "s5":
					op = "10101";
					bw.write(op);
					System.out.print(op);
					break;
				case "s7":
					op = "10111";
					bw.write(op);
					System.out.print(op);
					break;
				case "s8":
					op = "11000";
					bw.write(op);
					System.out.print(op);
					break;		
				case "s9":
					op = "11001";
					bw.write(op);
					System.out.print(op);
					break;
				case "k1":
					op = "11011";
					bw.write(op);
					System.out.print(op);
					break;
				case "gp":
					op = "11100";
					bw.write(op);
					System.out.print(op);
					break;
				case "sp":
					op = "10110";
					bw.write(op);
					System.out.print(op);
					break;
				case "fp":
					op = "11101";
					bw.write(op);
					System.out.print(op);
					break;
				case "ra":
					op = "11111";
					bw.write(op);
					System.out.print(op);
					break;
					
				default: op="erro";
				break;
				
				}
								
			}
			writer.close();
		}
		
		*/
			 
		 
}
		

		




