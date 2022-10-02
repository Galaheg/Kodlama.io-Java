
public class Vid25_27 {

	public void add() {
		System.out.println("Added");
	}

	public void delete() {
		System.out.println("Deleted");
	}

	public void update() {
		System.out.println("Updated");
	}

	public int sum(int number1, int number2) {
		return number1 + number2;
	}

	public int sum2(int...numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum+=number;
		}
		return sum;
	}

	public String city() {
		return "Ankara";
	}
}
