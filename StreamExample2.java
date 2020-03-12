import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


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

class StreamExample2
{	  
      public static void main(String args[])
      {
    	 
    	  List<Product> list = new ArrayList<Product>();
    	  
    	  list.add(new Product(1,"Vivo",10000f));
    	  list.add(new Product(2,"Oppo",12000f));
    	  list.add(new Product(3,"Realme",14000f));
    	  list.add(new Product(4,"Samsung",17000f));
    	  list.add(new Product(5,"Oneplus",33000f));
    	  list.add(new Product(6,"IPhone",60000f));
    	  
    	  List<Float> newList = list.stream().filter(prd->prd.price > 30000f).map(p->p.price).collect(Collectors.toList());
    	  
    	  
    	  
    	  System.out.println(newList);
		  
		  System.out.println("Stream Example with Stream API");
    	  
      }
}






