package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourTransaction fT = new FourTransaction();
		System.out.println(fT.sum(1, 6));
		System.out.println(fT.sum(2, 3, 4));
	}

}
