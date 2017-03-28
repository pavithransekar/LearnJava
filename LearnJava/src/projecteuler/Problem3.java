package projecteuler;

public class Problem3 {

	public static int primeCheck(long p) {
		int k = 0;
		for (long j = 2l; j <= Math.sqrt(p); j++) {
			if (p % j == 0) {
				k = k + 1;

			}

		}

		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = 600851475143l;

		// int a=13195;

		for (long i = 2l; i <= a; i++) {
			if (a % i == 0) {
				a = a / i;

				if (primeCheck(i) == 0) {
					System.out.println(i + " is a prime number");

				} else {
					System.out.println(i + " is not a prime number");
				}
				i = 2;

			}

		}

	}

}
