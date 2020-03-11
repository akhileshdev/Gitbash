
class ThreadClassMethod
{     
	public static void staticMethod()
	{
		System.out.println("Executing Thread static method using method reference");				
	}
	
	
      public static void main(String args[])
      {
    	  Thread th = new Thread(ThreadClassMethod :: staticMethod);
    	  th.start();
    	  
      }
}