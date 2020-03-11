
class MethodThreadClass
{
    void threadMethod()
	{
	    System.out.println("Hello method reference");
	}
}

public class ThreadMethodReference
{
    public static void main(String args[])
    {
        
    	Thread th = new Thread(new MethodThreadClass()::threadMethod);
    	th.start();
    	
    }
}

