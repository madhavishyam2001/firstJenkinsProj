import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMathUtil{

   String message = "Welcome 2 math world";	
   int X1=3;
   int X2=3;
   int X3=0;
   MathUtil mathUtil = new MathUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage() of mathworld");     
      assertEquals(message,mathUtil.printMessage());
   }

   @Test
   public void testSumFunc1() {
      System.out.println("Inside testsumFunc1()");
      X3 = X1+X2;
      assertEquals(X3, mathUtil.sumFunc(X1,X2));
   }
	
   @Test
   public void testSumFunc2() {
      System.out.println("Inside testsumFunc2()");
      X3 = 6;
      assertEquals(X3, mathUtil.sumFunc(X1,X2));
   }   
   @Test
   public void testDiffFunc1() {
      System.out.println("Inside testDiffFunc1()");
      X3 = X1-X2;
      assertEquals(X3, mathUtil.diffFunc(X1,X2));
   }
   @Test
   public void testDiffFunc2() {
      System.out.println("Inside testDiffFunc2()");
      int ret[];
	  ret = new int[3];
	  ret[0] = 8;
	  ret[1] = 14;
	  ret[2] = 0;
	  mathUtil.diffFunc(ret[0],ret[1],ret[2]);
      assertEquals(X3, ret[2]);
   }
   @Test
   public void testMathFunc1() {
      System.out.println("Inside testMathFunc1()");
	  X2 = 5;
	  X1 = 10;
	  X3 = 50;
      assertEquals(X3, mathUtil.mathFunc("*",X1,X2));
	  
	  X3=5;
	  assertEquals(X3, mathUtil.mathFunc("-",X1,X2));
	  
	  X3=15;
	  assertEquals(X3, mathUtil.mathFunc("+",X1,X2));
	  
	  X3=2;
	  assertEquals(X3, mathUtil.mathFunc("/",X1,X2));
	  
	  X3=909;
	  assertEquals(X3, mathUtil.mathFunc("M",X1,X2));
	  
	  
   }   
}