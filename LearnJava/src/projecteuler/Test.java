package projecteuler;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNumberOfDivisors(36));
		long k = 0, n = 0;

		long current = 1;
		int divisors = 0;
		for (long i = 1;; i++) {

			current = current + i;
			System.out.println(i);
			divisors = getNumberOfDivisors(current);
			// System.out.println(current+" "+divisors);
			if (divisors > 500) {
				System.out.println(divisors + " " + current);
				break;
			}

		}
	}

	public static int getNumberOfDivisors(long n) {

		int[] a = new int[100];
		int i = 2;
		long num = n;
		boolean uniq = true;
		int count=1;
		Arrays.fill(a, 1);
		while (i <= Math.sqrt(n)) {
			if (num % i == 0) {
				a[i] += 1;
				num /= i;
			} else {
				i++;
			}
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] != 1)
				count *= a[i];
		}
		return count;
	}

}
