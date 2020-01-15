

public class ArithmeticExample{
  public static void main(String args[])
   {
      try{
         int num1=40, num2=0;
         int output=num1/num2;
         System.out.println ("Expected result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("dividing a number by zero is caused Exception");
      }
   }
  		
  }  


 












