package kalkulator_2511532026;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator_2511532026 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator_2511532026 window = new kalkulator_2511532026();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kalkulator_2511532026() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		textField.setBounds(10, 10, 253, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bttnBackspace = new JButton("\uF0E7");
		bttnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if (textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder (textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		bttnBackspace.setFont(new Font("Windings", Font.BOLD, 18));
		bttnBackspace.setBounds(10, 81, 63, 64);
		frame.getContentPane().add(bttnBackspace);
		
		JButton bttn7 = new JButton("7");
		bttn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn7.getText();
				textField.setText(number);
			}
		});
		bttn7.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn7.setBounds(10, 143, 63, 64);
		frame.getContentPane().add(bttn7);
		
		JButton bttn4 = new JButton("4");
		bttn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn4.getText();
				textField.setText(number);
			}
		});
		bttn4.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn4.setBounds(10, 205, 63, 64);
		frame.getContentPane().add(bttn4);
		
		JButton bttn1 = new JButton("1");
		bttn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn1.getText();
				textField.setText(number);
			}
		});
		bttn1.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn1.setBounds(10, 263, 63, 64);
		frame.getContentPane().add(bttn1);
		
		JButton bttn0 = new JButton("0");
		bttn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn0.getText();
				textField.setText(number);
			}
		});
		bttn0.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn0.setBounds(10, 327, 63, 56);
		frame.getContentPane().add(bttn0);
		
		JButton bttnClear = new JButton("C");
		bttnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		bttnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnClear.setBounds(73, 81, 63, 64);
		frame.getContentPane().add(bttnClear);
		
		JButton bttn8 = new JButton("8");
		bttn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn8.getText();
				textField.setText(number);
			}
		});
		bttn8.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn8.setBounds(73, 143, 63, 64);
		frame.getContentPane().add(bttn8);
		
		JButton bttn5 = new JButton("5");
		bttn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn5.getText();
				textField.setText(number);
			}
		});
		bttn5.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn5.setBounds(73, 205, 63, 64);
		frame.getContentPane().add(bttn5);
		
		JButton bttn2 = new JButton("2");
		bttn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn2.getText();
				textField.setText(number);
			}
		});
		bttn2.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn2.setBounds(73, 263, 63, 64);
		frame.getContentPane().add(bttn2);
		
		JButton bttnDot = new JButton(".");
		bttnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttnDot.getText();
				textField.setText(number);
			}
		});
		bttnDot.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnDot.setBounds(73, 327, 63, 56);
		frame.getContentPane().add(bttnDot);
		
		JButton bttn00 = new JButton("00");
		bttn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn00.getText();
				textField.setText(number);
			}
		});
		bttn00.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn00.setBounds(136, 81, 63, 64);
		frame.getContentPane().add(bttn00);
		
		JButton bttn9 = new JButton("9");
		bttn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn9.getText();
				textField.setText(number);
			}
		});
		bttn9.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn9.setBounds(136, 143, 63, 64);
		frame.getContentPane().add(bttn9);
		
		JButton bttn6 = new JButton("6");
		bttn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn6.getText();
				textField.setText(number);
			}
		});
		bttn6.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn6.setBounds(136, 205, 63, 64);
		frame.getContentPane().add(bttn6);
		
		JButton bttn3 = new JButton("3");
		bttn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bttn3.getText();
				textField.setText(number);
			}
		});
		bttn3.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttn3.setBounds(136, 263, 63, 64);
		frame.getContentPane().add(bttn3);
		
		JButton bttnEqual = new JButton("=");
		bttnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		bttnEqual.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnEqual.setBounds(136, 327, 63, 56);
		frame.getContentPane().add(bttnEqual);
		
		JButton bttnPlus = new JButton("+");
		bttnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		bttnPlus.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnPlus.setBounds(199, 81, 63, 64);
		frame.getContentPane().add(bttnPlus);
		
		JButton bttnSub = new JButton("-");
		bttnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		bttnSub.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnSub.setBounds(199, 143, 63, 64);
		frame.getContentPane().add(bttnSub);
		
		JButton bttnMul = new JButton("*");
		bttnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		bttnMul.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnMul.setBounds(199, 205, 63, 64);
		frame.getContentPane().add(bttnMul);
		
		JButton bttnDiv = new JButton("\\");
		bttnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		bttnDiv.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnDiv.setBounds(199, 265, 63, 62);
		frame.getContentPane().add(bttnDiv);
		
		JButton bttnPercent = new JButton("%");
		bttnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		bttnPercent.setFont(new Font("Arial Black", Font.BOLD, 18));
		bttnPercent.setBounds(199, 327, 63, 56);
		frame.getContentPane().add(bttnPercent);
	}
}
