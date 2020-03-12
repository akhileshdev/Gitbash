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

class StreamExample3
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
    	  
    	  list.stream().filter(prod->prod.price > 30000f).forEach(prd->System.out.println(prd.name+" "+prd.price));
    	  
		  
		  System.out.println("Stream Example concise and compact code with Stream API");
    	  
      }
}






