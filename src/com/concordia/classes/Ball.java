package com.concordia.classes;

public class Ball { // blueprint
	// Properties or instance variables =>

	// public String color;
	// public String type;
	// public int bounceRate;
	// public int capacity;
	private String type;
	private String color;
	private int capacity;
	private int bounceRate;

	// Constructor
	public Ball() {
		// default
	}

	public Ball(String type, String color, int capacity, int bounceRate) {
		super();
		this.type = type;
		this.color = color;
		this.capacity = capacity;
		this.bounceRate = bounceRate;
	}

	// Behaviors
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBounceRate() {
		return bounceRate;
	}

	public void setBounceRate(int bounceRate) {
		this.bounceRate = bounceRate;
	}

	public void showColor() {
		System.out.println(color);
	}

	public void showType() {
		System.out.println(type);
	}

	public void bounce() {
		System.out.println("Bouncing...");
	}

	public void deflate() {
		System.out.println("Deflating...");
	}

	public void inflate() {
		System.out.println("Infalting...");
	}

	@Override
	public String toString() {
		return "Ball [type=" + type + ", color=" + color + ", capacity=" + capacity + ", bounceRate=" + bounceRate
				+ "]";
	}
}
