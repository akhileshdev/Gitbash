
import java.util.function.*;
import java.util.function.Predicate;

class PredicateChain
{   	
    public static void main(String args[])
    {
    	
    	Predicate<Integer> lowerThan = i->i < 20;
    	Predicate<Integer> higherThan = i->i > 5;
    	
    	Boolean result = lowerThan.and(higherThan).test(10);
    	
    	System.out.println(result);
    	
    }

}