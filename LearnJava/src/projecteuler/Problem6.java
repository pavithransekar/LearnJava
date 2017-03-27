package projecteuler;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0;
		for (int i = 1; i <= 100; i++) {
			a = a + i;
			b = (i * i) + b;
		}
		int c = a * a;

		System.out.println("square of the sum: " + c);
		System.out.println("sum of the squares: " + b);
		int d = c - b;
		System.out.println("difference: " + d);
	}

}
