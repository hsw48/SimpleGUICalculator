// Harrison Woodward	10/11/16
//
// Program allows user to add, subtract, multiply, or divide two integers.
// Built to practice with GUI components before a Software Development midterm exam



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame implements ActionListener {
	private JLabel l1,l2,l3;
	private JTextField f1,f2,f3;
	private JComboBox combo;
	private JButton button;
	private int total;
	
	public Calc() {
		l1 = new JLabel("Enter first integer");
		l2 = new JLabel("Enter second integer");
		l3 = new JLabel("Answer");
		
		f1 = new JTextField(10);
		f2 = new JTextField(10);
		f3 = new JTextField(20);
		f3.setEditable(false);
		
		String[] operations = {"Choose an operation", "Addition", "Subtraction", "Multiplication", "Division"};
		
		combo = new JComboBox(operations);
		button = new JButton("Calculate");
		setLayout(new FlowLayout());
		setVisible(true);
		add(l1);
		add(f1);
		add(l2);
		add(f2);
		add(combo);
		add(button);
		add(l3);
		add(f3);
		
		button.addActionListener(this);
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		int num1 = Integer.parseInt(f1.getText());
		int num2 = Integer.parseInt(f2.getText());
		String operation = (String) combo.getSelectedItem();
		
		switch (operation) 
		{
		case "Addition":
			total = num1 + num2;
			f3.setText(total + "");
			break;
		
		case "Subtraction":
			total = num1 - num2;
			f3.setText(total + "");
			break;
		
		case "Multiplication":
			total = num1 * num2;
			f3.setText(total + "");
			break;
	
		case "Division":
			total = num1/num2;
			f3.setText(total + "");
			break;
		}
	}
	
	public static void main(String[] args)
	{
		Calc calc = new Calc();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(300,200);
	}
	
	
}
