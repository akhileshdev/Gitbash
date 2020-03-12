import java.util.*;
import java.util.List;


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

class StreamExample
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
    	  
    	  List<Float> newList = new ArrayList<Float>();  //to store price list
    	  
    	  for(Product prd : list)
    	  {
    		  if(prd.price > 15000f)        //filtering criteria
    			  newList.add(prd.price);   //adding that new price list to new Arraylist
    	  }
    	  
    	  System.out.println(newList);
		  
		  System.out.println("Stream Example without Stream API");
    	  
      }
}






