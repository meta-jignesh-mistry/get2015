package ThrowAndThrows;

class Example
{
 static void check() throws ArithmeticException
 {
  System.out.println("Inside check function");
  
  //throwing the exception manually
  
  throw new ArithmeticException("Custom Exception");
 }

 public static void main(String args[])
 {
  try
  {
   //calling the check() method
   check();
  }
  catch(ArithmeticException e)
  {
   System.out.println("caught " + e);
  }
 }
}
