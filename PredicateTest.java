
import java.util.function.*;
import java.util.function.Predicate;

class PredicateTest
{
    public static void main(String args[])
    {
    	
    	Predicate<Integer> prd = i->i < 10;    	
    	
    	System.out.println(prd.test(10));
    	
    }

}