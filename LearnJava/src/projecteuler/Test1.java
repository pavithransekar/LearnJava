package projecteuler;

public class Test1 {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="HellO";
		char a;
		
		for(int i=0;i<s.length();i++)
		{
		
			char c=s.charAt(i);
			
			if(Character.isLowerCase(c))
			{
				c=Character.toUpperCase(c);
			}
			else
			{
				c=Character.toLowerCase(c);
			}

			System.out.println(c);
		}
		
	}
	
}
