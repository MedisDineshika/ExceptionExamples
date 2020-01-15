

public class NumberFormatExample{
  public static void main(String args[])
   {
      try{
         String str="test";  
		 int i=Integer.parseInt(str); 
      }
      catch(NumberFormatException e){
         System.out.println (" Caused NumberFormatException");
      }
   }
  		
  }  


 












