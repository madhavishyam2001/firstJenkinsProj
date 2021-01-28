/*
* This class prints the given message on console.
*/

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
} 