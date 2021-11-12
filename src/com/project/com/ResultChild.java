package com.project.com;

public class ResultChild extends Add_Parent{

	
	@Override
	public int addMethod(int a, int b) {
		return super.addMethod(a, b);
	}
	
	
	public static void main(String[] args) {
		Add_Parent res= new ResultChild();
		int resultValue = res.addMethod(4,5);
		System.out.println(resultValue);
	}	
	
	
}
