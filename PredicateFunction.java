
import java.util.function.*;
import java.util.function.Predicate;

class PredicateFunction
{   	

    public static void checkAge(int a, Predicate<Integer> prd)
	{    
	   	 System.out.println("Result of predicate : "+prd.test(a));
	}

     
    public static void main(String args[])
    {
    	
         checkAge(60,(i)->i > 50);	
    }

}