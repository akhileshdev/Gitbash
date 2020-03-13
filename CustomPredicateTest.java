
import java.util.function.*;
import java.util.function.Predicate;


class CustomPredicateTest
{   
	static Boolean checkAge(int age)
	{
		if(age > 19)
			return true;
		else
			return false;
	}
	
	
    public static void main(String args[])
    {
    	
    	Predicate<Integer> prd =  CustomPredicateTest :: checkAge;   	
    	
    	System.out.println(prd.test(10));
    	
    }

}