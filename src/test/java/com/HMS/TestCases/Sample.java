package com.HMS.TestCases;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phone_number = "B +1 (376) 268-8523";
		String[] out = phone_number.split("1 ");
		System.out.println(out[1]);

	}

}
