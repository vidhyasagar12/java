package G1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculatorgui implements ActionListener {
   JFrame j;
   JLabel l1,l2,l3;
   JTextField t1,t2,t3;
   JButton b1,b2,b3,b4;
   Calculatorgui()
   {
	   j = new JFrame("welcome");
	   j.setLayout(null);
	   j.setSize(500,500);
	   l1 = new JLabel("Input");
	     l1.setBounds(100,50,100,50);
	     j.add(l1);
	     t1=new JTextField();
			t1.setBounds(220, 50, 100, 50);
			j.add(t1);

	   l2  = new JLabel("Input 2");
	   l2.setBounds(100,150,100,50);
	     j.add(l2);
	     t2=new JTextField();
			t2.setBounds(220, 150, 100, 50);
			j.add(t2);

	   l3 = new JLabel("Output");
	   l3.setBounds(100, 250, 100, 50);
	     j.add(l3);
	     t3=new JTextField();
			t3.setBounds(220, 250, 100, 50);
			j.add(t3);

	     b1 =  new JButton("Add");
	     b1.setBounds(50, 350, 70, 30);
	     j.add(b1);
	     b2 =  new JButton("Sub");
	     b2.setBounds(140, 350, 70, 30);
	     j.add(b2);
	     b3 =  new JButton("Mul");
	     b3.setBounds(230, 350, 70, 30);
	     j.add(b3);
	     b4 =  new JButton("Div");
	     b4.setBounds(320, 350, 70, 30);
	     j.add(b4);
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	     b3.addActionListener(this);
	     b4.addActionListener(this);
	      j.setVisible(true);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Calculatorgui();
	}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		int a,b,c;
		a =Integer.parseInt(t1.getText());
		b =Integer.parseInt(t2.getText());
			c = a+b;
			t3.setText(Integer.toString(c));
	}
	if(e.getSource()==b2)
	{
		int a,b,c;
		a =Integer.parseInt(t1.getText());
		b =Integer.parseInt(t2.getText());
			c = a-b;
			t3.setText(Integer.toString(c));
	}
	if(e.getSource()==b3)
	{
		int a,b,c;
		a =Integer.parseInt(t1.getText());
		b =Integer.parseInt(t2.getText());
			c = a*b;
			t3.setText(Integer.toString(c));
	}
	if(e.getSource()==b4)
	{
		int a,b,c;
		a =Integer.parseInt(t1.getText());
		b =Integer.parseInt(t2.getText());
			c = a/b;
			t3.setText(Integer.toString(c));
	}
}


}