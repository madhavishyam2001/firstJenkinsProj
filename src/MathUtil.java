/*
* This class prints the given message on console.
*/
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileReader;


public class MathUtil {

   private String message;
   private int num1;
   private int num2;

   //Constructor
   //@param message to be printed
   public MathUtil(String message){
      this.message = message; 
   }

   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   

   public int sumFunc(int num1, int num2){
      return (num1+num2);
   }
	
   public int diffFunc(int num1, int num2){
      return (num1-num2);
   }   

   public int[] diffFunc(int num1, int num2, int num3){
	   int ret[];
	   ret = new int[2];
		ret[0] = num3;
		ret[1] = (num1-num2);
		return ret;
   } 
   public int mathFunc(String opr, int num1, int num2){
	   System.out.println("IP - " + num2 + " IP - " + num1);
	   System.out.println(message);
	   int ret=0;
	   switch (opr){
		case "+":
			ret = (num1)+(num2);
			break;
		case "-":
			ret = (num1)-(num2);
			break;
		case "*":
			ret = (num1)*(num2);
			break;			
		case "/":
			ret = (num1)/(num2);
			break;
		default :
			ret = 909;
			break;
	   }
	   return ret;
   }

   
   public void readTestIP() throws IOException{
    String filePath = ".\test\testIP.txt";
    HashMap<String, String> map = new HashMap<String, String>();

    String line;
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((line = reader.readLine()) != null)
    {
        String[] parts = line.split(":", 2);
        if (parts.length >= 2)
        {
            String key = parts[0];
            String value = parts[1];
            map.put(key, value);
        } else {
            System.out.println("ignoring line: " + line);
        }
    }

    for (String key : map.keySet())
    {
        System.out.println(key + ":" + map.get(key));
    }
    reader.close();
}
   
} 