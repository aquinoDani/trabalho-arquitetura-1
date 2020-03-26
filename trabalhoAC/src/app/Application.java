package app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		try {
		      File myObj = new File("type-r.in");
		      Scanner myReader = new Scanner(myObj);  
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        //System.out.println(data);
		        data = data.replaceAll(",","");
		        
		        String[] values = data.split(" ");
		        
		        System.out.println(Arrays.toString(values));  
		        Decoder d = new Decoder(values);
		        d.decoderOp(values);
		        d.decoderVar(values);
		       // d.decoderNums(values);
		        System.out.println("");
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		
			

	}
}
