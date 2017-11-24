package com.GitTest;



public class GitTest1 {
	
	public final void Test1(){
		
		System.out.println("This is working fine...");
		
	}
	
	public final void Test2(){
		Test1();
		System.out.println("This is TestMethod 2");
		
	}
public static void main(String args[]){
	GitTest1 t=new GitTest1();
	t.Test2();
}
}