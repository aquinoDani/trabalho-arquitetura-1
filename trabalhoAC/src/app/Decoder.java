package app;

public class Decoder {
		
		private String[] commands;
		private static String op;
		
		
		
		public Decoder(String[] commands) {
			super();
			this.commands = commands;
		}

		
		
		public static void decoderOp(String[] commands) {
			int i ;
			for(i=0 ; i < commands.length;i++) {
				switch(commands[i]) {
				case "add":
					op = "100000";
					System.out.print(op);
					break;
				
				case "addi":
					op = "1000";
					System.out.print(op);
					break;
				case "sub":
					op = "100010";
					System.out.print(op);
					break;
				case "mult":
					op = "11000";
					System.out.print(op);
					break;
				case "div":
					op = "11010";
					System.out.print(op);
					break;
				case "xor":
					op = "100110";
					System.out.print(op);
					break;
				case "nor":
					op = "100111";
					System.out.print(op);
					break;
				case "slt":
					op = "101010";
					System.out.print(op);
					break;
				case "and":
					op = "100100";
					System.out.print(op);
					break;
				case "sll":
					op = "0";
					System.out.print(op);
					break;
				case "srl":
					op = "10";
					System.out.print(op);
					break;
					
				case "jr":
					op = "1000";
					System.out.print(op);
					break;
					
				case "or":
					op = "100101";
					System.out.print(op);
					break;
				case "j":
					op = "10";
					System.out.print(op);
					break;
				case "jal":
					op = "11";
					System.out.print(op);
					break;
				case "lw":
					op = "100011";
					System.out.print(op);
					break;
				case "sw":
					op = "101011";
					System.out.print(op);
					break;
				case "beq":
					op = "100";
					System.out.print(op);
					break;
				case "bne":
					op = "101";
					System.out.print(op);
					break;
				case "slti":
					op = "1010";
					System.out.print(op);
					break;
				case "andi":
					op = "1100";
					System.out.print(op);
					break;
				case "ori":
					op = "1101";
					System.out.print(op);
					break;
					
				default: op="erro";
				break;
						
				}
				
			}
			
		}
		
		public static void decoderVar(String[] commands) {
			int i ;
			for(i=0 ; i < commands.length;i++) {
				switch(commands[i]) {
				case "zero":
					op = "0";
					System.out.print(op);
					break;
				case "at":
					op = "1";
					System.out.print(op);
					break;
				case "v0":
					op = "10";
					System.out.print(op);
					break;
				case "v1":
					op = "11";
					System.out.print(op);
					break;
				case "a0":
					op = "100";
					System.out.print(op);
					break;
				case "a1":
					op = "110";
					System.out.print(op);
					break;
				case "a3":
					op = "111";
					System.out.print(op);
					break;
				case "t0":
					op = "1000";
					System.out.print(op);
					break;
				case "t1":
					op = "1001";
					System.out.print(op);
					break;
				case "t2":
					op = "1010";
					System.out.print(op);
					break;
				case "t3":
					op = "1011";
					System.out.print(op);
					break;
					
				case "t4":
					op = "1100";
					System.out.print(op);
					break;
					
				case "t5":
					op = "1101";
					System.out.print(op);
					break;
				case "t6":
					op = "1110";
					System.out.print(op);
					break;
				case "t7":
					op = "1111";
					System.out.print(op);
					break;
				case "t8":
					op = "11000";
					System.out.print(op);
					break;
				case "s0":
					op = "10000";
					System.out.print(op);
					break;
				case "s1":
					op = "10001";
					System.out.print(op);
					break;
				case "s2":
					op = "10010";
					System.out.print(op);
					break;
				case "s3":
					op = "10011";
					System.out.print(op);
					break;
				case "s4":
					op = "10100";
					System.out.print(op);
					break;
				case "s6":
					op = "10110";
					System.out.print(op);
					break;
				case "s5":
					op = "10101";
					System.out.print(op);
					break;
				case "s7":
					op = "10111";
					System.out.print(op);
					break;
				case "s8":
					op = "11000";
					System.out.print(op);
					break;		
				case "s9":
					op = "11001";
					System.out.print(op);
					break;
				case "k1":
					op = "11011";
					System.out.print(op);
					break;
				case "gp":
					op = "11100";
					System.out.print(op);
					break;
				case "sp":
					op = "10110";
					System.out.print(op);
					break;
				case "fp":
					op = "11101";
					System.out.print(op);
					break;
				case "ra":
					op = "11111";
					System.out.print(op);
					break;
					
				default: op="erro";
				break;
						
				}
				
			}
			
		}
		/*
		public static void decoderNums(String[] commands) {
			String bin;
			for(int i = 0; i < commands.length; i++) {
			 if(Integer.toString(Integer.parseInt(commands[i]) instanceof Integer) {
			    bin = Integer.toString(Integer.parseInt(commands[i]), 2);
				System.out.println(bin);
				}
			}
		}
		*/
		
		
}
		




