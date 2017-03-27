package projecteuler;

public class Problem4 {

	public static int palindromeCheck(int p) {
		int b = 0, c = 0, e;
		e = p;

		while (p > 0) {
			b = p % 10;
			c = b + (c * 10);
			p = p / 10;
		}

		if (e == c) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, d = 0, f = 0;

		for (int i = 100; i <= 999; i++) {

			for (int j = i + 1; j <= 999; j++) {

				a = i * j;

				d = palindromeCheck(a);

				if (d == 0) {

					if (a > f) {
						f = a;
					}

				}
			}
		}
		System.out.println(f);
	}

}
