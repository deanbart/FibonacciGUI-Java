import java.math.BigInteger;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class FibonacciGUI {
public void go() {
	//Create Frame
	JFrame frame = new JFrame("Fibonacci GUI");
	//Create Components
	JEditorPane editorPane = new JEditorPane("text/html", generateFibonacciSequence(1000));
	editorPane.setEditable(false);
	JScrollPane scrollPane = new JScrollPane(editorPane);
	//Add components to the frame
	frame.add(scrollPane);
	//Set Frame properties
	frame.setSize(800, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
private String generateFibonacciSequence(int num) {
	StringBuilder sb = new StringBuilder();
	BigInteger fib1 = BigInteger.valueOf(0);
	BigInteger fib2 = BigInteger.valueOf(1);
	BigInteger fib3;
	sb.append("<html><body><h1>Fibonacci Sequence</h1><ol>");
	sb.append("<li>").append(fib1).append("</li>");
	sb.append("<li>").append(fib2).append("</li>");
	for (int i = 3; i <= num; i++) {
		fib3 = fib1.add(fib2);
		fib1 = fib2;
		fib2 = fib3;
		sb.append("<li>").append(fib3).append("</li>");
	}
	sb.append("</ol></body></html>");
	return sb.toString();
}
public static void main(String[] args )
{
	new FibonacciGUI().go();
}
}
