package com;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		StringBuffer sBuffer=new StringBuffer("Hello ");
		sBuffer.append("World!!!");
		System.out.println(sBuffer);
		
		StringBuilder sBuilder=new StringBuilder("Its time ");
		sBuilder.append("to rock!!!!");
		System.out.println(sBuilder);
				
	}

}
