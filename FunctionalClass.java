
interface Functional
{
    void corona();
} 

class FunctionalClass implements Functional
{	  
	public void corona()
	{
		System.out.println("COVID-19");
	}

      public static void main(String args[])
      {
    	 FunctionalClass fc = new FunctionalClass();
    	 fc.corona();
    	  
      }
}