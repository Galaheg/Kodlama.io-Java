package recap_demo_classes;

public class Main {

	public static void main(String[] args) {
		FourTransactions fourT = new FourTransactions();
		int sum = fourT.sum(1, 56);
		int div = fourT.div(8, 4);
		int multiply = fourT.multiply(2, 8);
		int subraction = fourT.subraction(2, 1);
		System.out.println(
				"Sum: " + sum + " -- Subraction: " + subraction + " -- Multiply: " + multiply + " -- Division: " + div);

	}

}
