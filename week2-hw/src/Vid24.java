
public class Vid24 {
	protected void print()
	{
		int[] numbers = new int[] { 1, 2, 5, 6, 7, 9, 0 };
		int search = 6;
		boolean found = false;

		for (int number : numbers) {
			if (search == number) {
				found = true;
				break;
			}
		}
		String message = "Number found";
		if (found) {
			found(message,search);
		} else
			System.out.println("Number not found: " + search);

	}

	public static void found(String message, int search) {
		System.out.println("Number found: " + search);
	}
	
}
