import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingSwingLambda
{
    public static void main(String args[])
	{
		JTextField jtf = new JTextField();		
		jtf.setBounds(50,50,200,20);
		
		JButton b = new JButton("Click me");
		b.setBounds(50,100,100,20);
		
		JFrame f = new JFrame();
		
		
		b.addActionListener(e->{jtf.setText("Hello Lambda Event");});
		
		
		f.add(b);
		f.add(jtf);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);		
	}
	

}