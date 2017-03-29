package projecteuler;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long d = 0;
		for (long i = 2l; i <= 2000000l; i++) {
			if (Problem3.primeCheck(i) == 0) {
				d = d + i;

			}
		}
		System.out.println(d);
	}

}
