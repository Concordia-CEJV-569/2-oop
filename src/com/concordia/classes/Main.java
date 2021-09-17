package com.concordia.classes;

public class Main {

	public static void main(String[] args) {
		// Instantiating =>

		// Ball basketBall = new Ball();
		//
		// basketBall.color = "Orange";
		// basketBall.type = "Basketball";
		// basketBall.capacity = -10;
		//
		// System.out.println(basketBall.capacity);

		Ball basketBall = new Ball("basketball", "orange", 10, 100);

		basketBall.bounce();
		basketBall.showColor();
		basketBall.showType();
		
		basketBall.setType("football");
		
		System.out.println("New type: " + basketBall.getType());
		
		System.out.println(basketBall);
	}

}
