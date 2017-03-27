package projecteuler;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,c=0,d=0;

		
		for(long i=0;i<400000;i++)
		{
			c=a+b;
			a=b;
			b=c;
			

			
			if(c%2==0)
			{	d=c+d; 
			}

			if(c>4000000)
			{
				break;
			}
			
			
	}
		
		System.out.println(d);
	}
}
