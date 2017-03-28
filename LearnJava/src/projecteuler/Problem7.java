package projecteuler;

public class Problem7 {

	public static void main(String[] args) {

		int j = 0;

		for (int i = 2; i < 2147483647; i++) {

			if (Problem3.primeCheck(i) == 0) {
				j = j + 1;

				if (j == 10001) {
					System.out.println(i + " is a prime number " + j);
					break;
				}
			}

		}

	}
}
