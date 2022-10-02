public class Main {

	public static void main(String[] args) {
		Vid24 function = new Vid24();
		Vid25_27 function2 = new Vid25_27();
		function.print();
		function2.add();
		function2.delete();
		function2.update();
		String city = function2.city();
		int sum = function2.sum2(10,5,6,7);
		System.out.println("City is: "+city+" -- Sum is: "+sum);
	}
}
