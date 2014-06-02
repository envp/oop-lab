package lab9;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vaibhav
 */
public class Calculator extends JFrame {
	JTextField resultField;

	/**
	 * Constructor for Calculator
	 */
	Calculator() {
		super("Calculator");

		// Create the required panels
		JPanel mainPanel = new JPanel();
		JPanel resultArea = new JPanel();
		JPanel btnArea = new JPanel();
		JPanel submitArea = new JPanel();
		mainPanel.setSize(100, 100);

		// Create labels and text fields
		JLabel titleLabel = new JLabel("Calculator", JLabel.CENTER);
		resultField = new JTextField(10);
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("0");
		JButton btnDot = new JButton(".");
		JButton btnEql = new JButton("=");
		JButton btnAdd = new JButton("+");
		JButton btnSub = new JButton("-");
		JButton btnMul = new JButton("*");
		JButton btnDiv = new JButton("/");
		JButton btnClr = new JButton("AC");
		// setting layout for panels
		
		// divides panel into 5 regions
		mainPanel.setLayout(new BorderLayout());
		
		// adds components vertically
		resultArea.setLayout(new BoxLayout(resultArea, BoxLayout.Y_AXIS));

		//making a grid of 4 by 4
		btnArea.setLayout(new GridLayout(4, 4));
		add(mainPanel);
		resultArea.add(titleLabel);
		resultArea.add(resultField);
		mainPanel.add(BorderLayout.NORTH, resultArea);
		btnArea.add(btn1);
		btnArea.add(btn2);
		btnArea.add(btn3);
		btnArea.add(btn4);
		btnArea.add(btn5);
		btnArea.add(btn6);
		btnArea.add(btn7);
		btnArea.add(btn8);
		btnArea.add(btn9);
		btnArea.add(btn0);
		btnArea.add(btnDot);
		btnArea.add(btnEql);
		btnArea.add(btnAdd);
		btnArea.add(btnSub);
		btnArea.add(btnMul);
		btnArea.add(btnDiv);
		mainPanel.add(BorderLayout.CENTER, btnArea);
		mainPanel.add(BorderLayout.SOUTH, submitArea);
	}
	
	public static void main(String[] args) {
		JFrame frame = new Calculator();
		frame.setVisible(true);
		// make program quit when you close the window
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(250, 250);
	}
}
