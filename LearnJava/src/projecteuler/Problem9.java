package projecteuler;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 4; i < 1000; i++) {
			for (int j = 1; j < i; j++) {
				for (int k = j + 1; k < i; k++) {

					int d = (j * j) + (k * k);
					int e = i * i;
					if (d == e) {
						if (i + j + k == 1000) {

							System.out.println(i * j * k);
							break;
						}
					}
				}
			}
		}

	}

}
