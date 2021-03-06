
import java.util.function.*;
import java.util.function.Predicate;

class PredicateChain
{   	
    public static void main(String args[])
    {
    	
    	Predicate<Integer> lowerThan = i->i < 20;
    	Predicate<Integer> higherThan = i->i < 5;
    	
    	Boolean result = lowerThan.and(higherThan).test(10);
    	
    	boolean res = lowerThan.and(higherThan).negate().test(70);
    	
    	System.out.println("Using predicate negation in Chaining : "+res);   	
    	System.out.println("Using predicate test() method : "+result);
    	
    	
    	boolean res1;
    	for(int i = 0;i < 50;i++)
    	{
    	   res1 = lowerThan.or(higherThan).test(i);
    	   System.out.println("Predicate Testing or() method : "+res1);
    	
    	}
       	
    	
    }

}