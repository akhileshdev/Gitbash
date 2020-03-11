
interface Doable
{
      default void simple()
	  {
	      System.out.println("Done");	  
	  }
}

interface Functional extends Doable
{
    void say();
} 

class ClassFunctional implements Functional
{	  
	public void say()
	{
		System.out.println("Hello there");
	}

      public static void main(String args[])
      {
    	 ClassFunctional fun = new ClassFunctional();
    	 fun.say();
    	 
    	 fun.simple();
    	  
      }
}