package app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class Application {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Deseja puxar comandos de arquivo ou digitar? 1-Arquivo 2-Digitar ");
		int resposta = s.nextInt();
		String command;
		
		switch(resposta){
		case 1 :
		try {
			
		      File myObj = new File("type-i.in");
		      Scanner myReader = new Scanner(myObj);  
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        //System.out.println(data);
		        data = data.replaceAll(",","");
		        String[] values = data.split(" ");
		        System.out.println(Arrays.toString(values));  
		        Decoder d = new Decoder(values);
		        d.decoderOp(values);
		        System.out.println("");
		      }

		      myReader.close();

		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		break;
	      case 2 :
	      
	    	  System.out.println("Digite o comando que deseja");
	    	  command = s.next();
	    	  command = command.replaceAll(",","");
		      String[] values = command.split(" ");
		      System.out.println(Arrays.toString(values));  
	    	  Decoder d1 = new Decoder(values);
	    
	    	  d1.decoderOp(values);
	      break;
	      default:System.out.println("Valor inexistente");
	      break;
		
		
		}
	}
}
