
@FunctionalInterface
interface Sayable
{
   void say();
}

class MethodClass
{
    void saySomething()
	{
	    System.out.println("Hello method reference");
	}
}

public class MethodReference
{
    public static void main(String args[])
    {
        MethodClass obj = new MethodClass();
    	
        Sayable ref = obj::saySomething;
        ref.say();
        
        Sayable ref1 = new MethodClass() :: saySomething;
        ref1.say();
        
        System.out.println("Method reference to Instance Method");
    	
    }
}

