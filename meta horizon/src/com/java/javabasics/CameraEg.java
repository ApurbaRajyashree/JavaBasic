package com.java.javabasics;


public class CameraEg extends Camera  {
	public void Imple() {
		System.out.print("Hi i am from next package");
	}
	 public static void main(String[] args)
	 {
		 CameraEg borrow= new CameraEg();
		// borrow.Access();
		 borrow.Imple();
	 }
}