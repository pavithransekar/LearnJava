package com;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		boolean a=true;
		boolean b=false;
		String s1="Pavithran";
		String s20="Pavithran";
		String s2="ABC";
		String s3="DEF";
		String s4="";
		char[] ch2={'P','A','V','I'};
		String s15=null;
		
		//String Buffer
		
		StringBuffer sBuffer=new StringBuffer("Hello ");
		sBuffer.append("World!!!");
		System.out.println(sBuffer);
		
		//String Builder
		
		StringBuilder sBuilder=new StringBuilder("Its time ");
		sBuilder.append("to rock!!!!");
		System.out.println(sBuilder);

		//Append
		
		StringBuffer sBuffer1=new StringBuffer();
		sBuffer1.append(b);
		sBuffer1.append(" "+a);
		System.out.println(sBuffer1);
		
		//Reverse
		
		StringBuffer sBuffer2=new StringBuffer("Pavithran");
		sBuffer2.reverse();
		System.out.println(sBuffer2);
		 
		//Delete
		
		StringBuffer sBuffer3=new StringBuffer("Pavithran Sekar");
		sBuffer3.delete(9,15);
		System.out.println(sBuffer3);
		
		//Insert
		
		StringBuffer sBuffer4=new StringBuffer("Pavithran");
		sBuffer4.insert(9, " Sekar");
		System.out.println(sBuffer4);
		
		//Replace
		
		StringBuffer sBuffer5=new StringBuffer("Pavi");
		sBuffer5.replace(2, 3, "b");
		System.out.println(sBuffer5);

		//charAt
		
		char ch1=s1.charAt(5);
		System.out.println(ch1);
		
		//compareTo
		
		System.out.println(s3.compareTo(s2));
		
		//copyValueOf
		
		s4=String.copyValueOf(ch2,1,3);
		System.out.println(s4);
		
		//contentEquals() and equals()
		
		String s10="Pavi";
		StringBuilder s11=new StringBuilder("Pavi");
		
		
		System.out.println(s10.equals(s11));
		System.out.println(s10.contentEquals(s11));
				
		//hashCode()
		
		System.out.println(s20.hashCode());
		
		//indexOf()
		
		System.out.println(s20.indexOf("a",2));
		
		String s31 = "Anish";
        String s32 = "Anish".intern();

        String s33 = new String("Anish");		
		
        if(s32=="Anish")
        {
        	System.out.println("s31 and s32 are same");
        }
		
//        if(s31==s33)
//        {
//        	System.out.println("s31 and s33 are same");
//        }
//		        
	}

}
