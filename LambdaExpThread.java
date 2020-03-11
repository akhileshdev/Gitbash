import java.util.*;
import java.util.stream.*;

public class LambdaExpThread 
{
	public static void main(String[] args) 
	{
		Runnable r = new Runnable()
		             {
						 public void run()
						 {
							 System.out.println("Thread is running");
						 }
						 
					 };
	
         Thread th = new Thread(r);
         th.start(); 
         
         Runnable r2 = ()->{System.out.println("Thread running using lambda expression")};
         
        
         
         Thread th1 = new Thread(r2);
         th1.start();
         
         System.out.println("Adding in branch2");

	}

}
