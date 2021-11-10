import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question20 {

	
	public static void Information() {
		
		  BufferedReader reader = null;
          try{
              reader = new BufferedReader(new FileReader("C:\\Users\\dkiop\\eclipse-workspace\\PortfolioQuestions\\src\\Data.txt"));
              String line;
              while((line = reader.readLine()) != null){

                  String[] data = line.split(":");

                  System.out.println("Name: "+data[0]+" "+data[1]);
                  System.out.println("Age: "+ data[2]+" years");
                  System.out.println("State: "+ data[3]+" State");
                  System.out.println("\n");
              }
          }catch(IOException ex){
              ex.printStackTrace();
          }finally{
              if(reader != null){
                  try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              }
          }
      }
		
		
		
		
		
		
	}
	

