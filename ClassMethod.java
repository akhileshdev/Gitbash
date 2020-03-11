interface  Referencable
{
   void meth();
}

class ClassMethod
{     
	public static void staticMethod()
	{
		System.out.println("Executing static method using method reference");				
	}
	
	
      public static void main(String args[])
      {
    	  Referencable ref = ClassMethod::staticMethod;
    	  
    	  ref.meth();
    	  
    	  
      }
}