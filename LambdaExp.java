import java.util.*;
import java.util.stream.*;

class Product
{
	int id;
	String name;
	float price;
	
	Product(int id,String name,float price)
	{
	    this.id = id;
        this.name = name;
		this.price = price;		
	}
	
}


public class LambdaExp 
{

	public static void main(String[] args) 
	{
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(101,"Book",408.89f));
		list.add(new Product(102,"Pen",8.79f));
		list.add(new Product(103,"Watch",3400.10f));
		list.add(new Product(104,"Bag",687.90f));
		list.add(new Product(105,"food",117.80f));
		
		Stream<Product> str = list.stream().filter(pr->(pr.price > 500));
		
		str.forEach(p->System.out.println(p.id+" "+p.name+" "+p.price));		

	}

}
