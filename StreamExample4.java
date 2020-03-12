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

class StreamExample4
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
    	  
    	  float totalPrice = list.stream().map(prd->prd.price).reduce(0.0f,(sum,prc)->sum+prc); //reduce method of stream API    	  
    	  float totalPrice1 = list.stream().map(prd->prd.price).reduce(0.0f,Float::sum);    //using method reference of Float class concept
    	  
    	  System.out.println("Total price of al the phone : "+totalPrice);
    	  System.out.println("Total price of phones : "+totalPrice1);
    	  		  
    	  double total3 = list.stream().collect(Collectors.summingDouble(prc->prc.price));   	  
    	  System.out.println("Total Sum using Collectors class method : "+total3);
    	  
    	  
    	  Product prdA = list.stream().max((prd1,prd2)->prd1.price > prd1.price ? 1:-1).get();
    	  System.out.println("Maximum Price of product : "+prdA.name+" "+prdA.price);
    	  
    	  
		  System.out.println("Stream Example with Stream API");
    	  
      }
}






