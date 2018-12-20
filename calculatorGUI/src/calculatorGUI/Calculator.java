package calculatorGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Calculator {

	private JFrame frmTowsifsCalculator;
	private JTextField textDisplay;
	
	double firstnumber;
	double secondnumber;
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
					Calculator window = new Calculator();
					window.frmTowsifsCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTowsifsCalculator = new JFrame();
		frmTowsifsCalculator.getContentPane().setBackground(new Color(255, 0, 0));
		frmTowsifsCalculator.getContentPane().setForeground(Color.WHITE);
		frmTowsifsCalculator.getContentPane().setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		frmTowsifsCalculator.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 12));
		frmTowsifsCalculator.setForeground(Color.BLUE);
		frmTowsifsCalculator.setBackground(Color.WHITE);
		frmTowsifsCalculator.setTitle("TOWSIF'S CALCULATOR");
		frmTowsifsCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\calculator.png"));
		frmTowsifsCalculator.setBounds(100, 100, 257, 422);
		frmTowsifsCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textDisplay = new JTextField();
		textDisplay.setBackground(Color.WHITE);
		textDisplay.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setColumns(10);
		///////////////////////////////////////
		///// FIRST ROW
		//////////////////////////////////////
		
		JButton btnback = new JButton("<-");
		btnback.setBackground(new Color(0, 204, 255));
		btnback.setForeground(Color.WHITE);
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textDisplay.getText().length()> 0)
				{
					StringBuilder strB = new StringBuilder( textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length()-1);
					back = strB.toString();
					textDisplay.setText(back);
				}
			}
		});
		btnback.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(0, 204, 255));
		btnC.setForeground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btnpercent = new JButton("%");
		btnpercent.setBackground(Color.GRAY);
		btnpercent.setForeground(Color.WHITE);
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "%";
			}
		});
		btnpercent.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(Color.GRAY);
		btnplus.setForeground(Color.WHITE);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "+";
			}
		});
		btnplus.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		///////////////////////////////////////
		///// SECOND ROW
		//////////////////////////////////////
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.BLUE);
		btn7.setForeground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.BLUE);
		btn8.setForeground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.BLUE);
		btn9.setForeground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btnminus = new JButton("-");
		btnminus.setBackground(Color.GRAY);
		btnminus.setForeground(Color.WHITE);
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "-";
			}
		});
		btnminus.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		///////////////////////////////////////
		///// Third ROW
		//////////////////////////////////////
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.BLUE);
		btn4.setForeground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.BLUE);
		btn5.setForeground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.BLUE);
		btn6.setForeground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.setBackground(Color.GRAY);
		btnmultiply.setForeground(Color.WHITE);
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "*";
			}
		});
		btnmultiply.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		///////////////////////////////////////
		///// FOURTH ROW
		//////////////////////////////////////
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.BLUE);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.BLUE);
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.BLUE);
		btn3.setForeground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btndivide = new JButton("/");
		btndivide.setBackground(Color.GRAY);
		btndivide.setForeground(Color.WHITE);
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "/";
			}
		});
		btndivide.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		///////////////////////////////////////
		///// FIFTH ROW
		//////////////////////////////////////
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.BLUE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btndecimal = new JButton(".");
		btndecimal.setBackground(new Color(0, 204, 255));
		btndecimal.setForeground(Color.WHITE);
		btndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btndecimal.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btndecimal.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btnplusminus = new JButton("\u00B1");
		btnplusminus.setBackground(Color.GRAY);
		btnplusminus.setForeground(Color.WHITE);
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops=ops*(-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnplusminus.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		
		JButton btnequal = new JButton("=");
		btnequal.setForeground(Color.WHITE);
		btnequal.setBackground(Color.GREEN);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnumber = Double.parseDouble(textDisplay.getText());
				if(operation == "+")
				{
					result = firstnumber + secondnumber;
					answer =String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "-")
				{
					result = firstnumber - secondnumber;
					answer =String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "*")
				{
					result = firstnumber * secondnumber;
					answer =String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "/")
				{
					result = firstnumber / secondnumber;
					answer =String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "%")
				{
					result = firstnumber % secondnumber;
					answer =String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		GroupLayout groupLayout = new GroupLayout(frmTowsifsCalculator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textDisplay, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnback, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btnC, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(7)
							.addComponent(btnpercent, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btnplus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn7, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btn8, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(7)
							.addComponent(btn9, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btnminus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn4, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btn5, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(7)
							.addComponent(btn6, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btnmultiply, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btn2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(7)
							.addComponent(btn3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btndivide, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn0, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btndecimal, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(7)
							.addComponent(btnplusminus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(btnequal, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
					.addGap(8))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(textDisplay, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnback, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnC, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnpercent, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnplus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn7, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn8, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn9, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnminus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn4, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn5, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn6, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnmultiply, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btndivide, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn0, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btndecimal, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnplusminus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnequal, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(9))
		);
		frmTowsifsCalculator.getContentPane().setLayout(groupLayout);
		frmTowsifsCalculator.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textDisplay, btnback, btnC, btnpercent, btnplus, btn7, btn8, btn9, btnminus, btn4, btn5, btn6, btnmultiply, btn1, btn2, btn3, btndivide, btn0, btndecimal, btnplusminus, btnequal}));

		
		
	}
}
