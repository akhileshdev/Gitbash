import java.util.*;
import java.util.List;
import java.util.function.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class PredicateCollection
{   	
    String name,role;
    
    PredicateCollection(String name,String role)
    {
    	this.name = name;
    	this.role = role;
    }
    
    public String toString()
    {
    	
    	return name+" --> "+role;
    }
    
    public String getRole()
    {
    	return role;
    }
        
    public static void main(String args[])
    {
        List<PredicateCollection> users = new ArrayList<PredicateCollection>();
    	
        users.add(new PredicateCollection("Akhilesh","admin"));
        users.add(new PredicateCollection("Rahul","dialog"));
        users.add(new PredicateCollection("Amit","admin"));
        
        List<PredicateCollection> result = users.stream().filter((u)->u.getRole().equals("admin")).collect(Collectors.toList());
        
        System.out.println("Resulted List of Admins : "+result);
    }

}