
interface Sayable
{
    void say();
    
    default void method()
    {
    	System.out.println("Java 8");
    }
}

class DefaultMethod implements Sayable
{
      public void say()
      {
    	 System.out.println("Hello"); 
      }
	
      public static void main(String args[])
      {
           DefaultMethod df  = new DefaultMethod();
           
           df.say();
      }

}