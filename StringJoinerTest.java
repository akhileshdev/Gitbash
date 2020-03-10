
import java.util.*;

public class StringJoinerTest 
{

	public static void main(String[] args) 
	{
		StringJoiner sjoin = new StringJoiner(",");
		
		sjoin.add("Kamalnath");
		sjoin.add("Sindhiya");
		sjoin.add("Shivraj");
		
		System.out.println(sjoin);
		
		System.out.println("length : "+sjoin.length());

	}

}
