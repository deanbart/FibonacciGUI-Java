import java.math.BigInteger;
public class FibonacciIterative {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		BigInteger fib1 = BigInteger.valueOf(0);
		BigInteger  fib2 = BigInteger.valueOf(1);
		BigInteger fib3;
		sb.append("Fib 1: ").append(fib1).append('\n');
		sb.append("Fib 2: ").append(fib2).append('\n');
		for (int i = 3; i <= 1000; i++) {
			fib3 = fib1.add(fib2);
			fib1 = fib2;
			fib2 = fib3;
			sb.append("Fib ").append(i).append(": ").append(fib3).append('\n');
		}
		System.out.println(sb.toString());
	}

}
