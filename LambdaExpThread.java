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

	}

}
