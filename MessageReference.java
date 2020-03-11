
@FunctionalInterface
interface Messagable
{
     Message getMessage(String msg);
}

class Message
{
     Message(String msg)
	 {
	     System.out.println(msg);
	 }
}

public class MessageReference
{
     public static void main(String args[])
     {
    	 Messagable ref = Message::new;
    	 ref.getMessage("Hello Constructer");
    	     	 
     }
} 