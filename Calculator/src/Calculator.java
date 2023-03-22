import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txt_input;
	private double textNumber,answer;
	int operator;
	private String result;
	private double memory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void changeText(String str)
	{
		txt_input.setText(txt_input.getText()+str);
	}
	
	
	public void calculate()
	{
		switch(operator)
		{
		case 1:
			answer = textNumber + Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
		case 2:
			answer = textNumber - Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
			
		case 3:
			answer = textNumber * Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
		case 4:
			answer = textNumber / Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
		case 5:
			answer = textNumber % Double.parseDouble(txt_input.getText());
			txt_input.setText(Double.toString(answer));
			break;
		
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setBackground(Color.WHITE);
		setType(Type.UTILITY);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 426, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnl_input = new JPanel();
		pnl_input.setBounds(10, 11, 379, 91);
		contentPane.add(pnl_input);
		pnl_input.setLayout(null);
		
		txt_input = new JTextField();
		txt_input.setEditable(false);
		txt_input.setFont(new Font("Digital-7 Mono", Font.PLAIN, 55));
		txt_input.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_input.setBounds(10, 43, 359, 48);
		pnl_input.add(txt_input);
		txt_input.setColumns(10);
		
		JLabel lbl_result = new JLabel("");
		lbl_result.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_result.setFont(new Font("Digital-7 Mono", Font.PLAIN, 20));
		lbl_result.setBounds(118, 0, 251, 42);
		pnl_input.add(lbl_result);
		
		JPanel pnl_buttons = new JPanel();
		pnl_buttons.setBounds(10, 113, 391, 332);
		contentPane.add(pnl_buttons);
		pnl_buttons.setLayout(null);
		
		JButton btn_seven = new JButton("7");
		btn_seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_seven.setBounds(10, 80, 65, 55);
		pnl_buttons.add(btn_seven);
		btn_seven.setBackground(Color.LIGHT_GRAY);
		btn_seven.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btn_eight = new JButton("8");
		btn_eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_eight.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_eight.setBackground(Color.LIGHT_GRAY);
		btn_eight.setBounds(86, 80, 65, 55);
		pnl_buttons.add(btn_eight);
		
		JButton btn_nine = new JButton("9");
		btn_nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_nine.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_nine.setBackground(Color.LIGHT_GRAY);
		btn_nine.setBounds(161, 80, 65, 55);
		pnl_buttons.add(btn_nine);
		
		JButton btn_four = new JButton("4");
		btn_four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_four.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_four.setBackground(Color.LIGHT_GRAY);
		btn_four.setBounds(10, 146, 65, 55);
		pnl_buttons.add(btn_four);
		
		JButton btn_five = new JButton("5");
		btn_five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_five.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_five.setBackground(Color.LIGHT_GRAY);
		btn_five.setBounds(86, 146, 65, 55);
		pnl_buttons.add(btn_five);
		
		JButton btn_six = new JButton("6");
		btn_six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_six.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_six.setBackground(Color.LIGHT_GRAY);
		btn_six.setBounds(161, 146, 65, 55);
		pnl_buttons.add(btn_six);
		
		JButton btn_one = new JButton("1");
		btn_one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_one.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_one.setBackground(Color.LIGHT_GRAY);
		btn_one.setBounds(10, 207, 65, 55);
		pnl_buttons.add(btn_one);
		
		JButton btn_two = new JButton("2");
		btn_two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_two.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_two.setBackground(Color.LIGHT_GRAY);
		btn_two.setBounds(86, 207, 65, 55);
		pnl_buttons.add(btn_two);
		
		JButton btn_three = new JButton("3");
		btn_three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_three.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_three.setBackground(Color.LIGHT_GRAY);
		btn_three.setBounds(161, 207, 65, 55);
		pnl_buttons.add(btn_three);
		
		JButton btn_zero = new JButton("0");
		btn_zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// System.out.print(e.getActionCommand());
				changeText(e.getActionCommand());
				
			}
		});
		btn_zero.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_zero.setBackground(Color.LIGHT_GRAY);
		btn_zero.setBounds(10, 266, 65, 55);
		pnl_buttons.add(btn_zero);
		
		JButton btn_doubleZero = new JButton("00");
		btn_doubleZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_doubleZero.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_doubleZero.setBackground(Color.LIGHT_GRAY);
		btn_doubleZero.setBounds(86, 266, 65, 55);
		pnl_buttons.add(btn_doubleZero);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeText(e.getActionCommand());
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_dot.setBackground(Color.LIGHT_GRAY);
		btn_dot.setBounds(161, 266, 65, 55);
		pnl_buttons.add(btn_dot);
		
		JButton btn_delete = new JButton("->");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_input.getText().length() > 0)
				{
					String text = txt_input.getText();
					text =text.substring(0,text.length()-1);
					txt_input.setText(text);
				}
				else
					lbl_result.setText("");
				
			}
		});
		btn_delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_delete.setBackground(Color.LIGHT_GRAY);
		btn_delete.setBounds(10, 14, 65, 55);
		pnl_buttons.add(btn_delete);
		
		JButton btn_m = new JButton("M");
		btn_m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_input.setText(Double.toString(memory));
			}
		});
		btn_m.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_m.setBackground(Color.LIGHT_GRAY);
		btn_m.setBounds(161, 14, 65, 55);
		pnl_buttons.add(btn_m);
		
		JButton btn_mPlus = new JButton("M+");
		btn_mPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_input.getText().length()>0)
				{
					memory=Double.parseDouble(txt_input.getText());
					txt_input.setText("");
				}
				
			}
		});
		btn_mPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_mPlus.setBackground(Color.LIGHT_GRAY);
		btn_mPlus.setBounds(236, 14, 65, 55);
		pnl_buttons.add(btn_mPlus);
		
		JButton btn_mod = new JButton("Mod");
		btn_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_input.getText().length()>0)
				{
					textNumber = Double.parseDouble(txt_input.getText());
					operator=5;
					txt_input.setText("");
					lbl_result.setText(textNumber+"%");
				}
				
				
			}
		});
		btn_mod.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_mod.setBackground(Color.LIGHT_GRAY);
		btn_mod.setBounds(236, 80, 65, 55);
		pnl_buttons.add(btn_mod);
		
		JButton btn_multiply = new JButton("X");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(txt_input.getText().length()>0)
				{
					textNumber = Double.parseDouble(txt_input.getText());
					operator=3;
					txt_input.setText("");
					lbl_result.setText(textNumber+"*");
				}
				
				
			}
		});
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_multiply.setBackground(Color.LIGHT_GRAY);
		btn_multiply.setBounds(236, 146, 65, 55);
		pnl_buttons.add(btn_multiply);
		
		JButton btn_subtract = new JButton("-");
		btn_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(txt_input.getText().length()>0)
				{
					textNumber = Double.parseDouble(txt_input.getText());
					operator=2;
					txt_input.setText("");
					lbl_result.setText(textNumber+"-");
				}
				
				
				
				
					
				
				 
			}
		});
		btn_subtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_subtract.setBackground(Color.LIGHT_GRAY);
		btn_subtract.setBounds(236, 207, 65, 55);
		pnl_buttons.add(btn_subtract);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(txt_input.getText().length()>0)
				{
					textNumber = Double.parseDouble(txt_input.getText());
					operator=4;
					txt_input.setText("");
					lbl_result.setText(textNumber+"/");
				}
				
				
				
				
				
			}
		});
		btn_divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_divide.setBackground(Color.LIGHT_GRAY);
		btn_divide.setBounds(236, 266, 65, 55);
		pnl_buttons.add(btn_divide);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_input.getText().length()>0)
				{
					textNumber = Double.parseDouble(txt_input.getText());
					operator=1;
					txt_input.setText("");
					lbl_result.setText(textNumber+"+");
				}
				
				
				
				
			
				
				
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_add.setBackground(Color.LIGHT_GRAY);
		btn_add.setBounds(311, 14, 65, 121);
		pnl_buttons.add(btn_add);
		
		JButton btn_equals = new JButton("=");
		btn_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lbl_result.setText("");
					calculate();
					
				
				
				
			}
		});
		btn_equals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_equals.setBackground(Color.LIGHT_GRAY);
		btn_equals.setBounds(311, 146, 65, 175);
		pnl_buttons.add(btn_equals);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				memory=0;
				txt_input.setText("");
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_clear.setBackground(Color.LIGHT_GRAY);
		btn_clear.setBounds(86, 14, 65, 55);
		pnl_buttons.add(btn_clear);
	}
}
