package com.sd.ch8;

public class turtle{
	public int nLimbs = 4;
	protected String food;
	public void setFood(String f){
		this.food=f;
	}
	public void eat() {
		System.out.println("Turtle eats "+food);
	}
}