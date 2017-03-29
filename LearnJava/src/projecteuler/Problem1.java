package projecteuler;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int a=0;
		
		for(int i=2;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
			{
				a=a+i;
			}
			
		}

		System.out.println(a);		
		
	}

}