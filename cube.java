package com.cd.ch8;
public class Cube extends Rectangle{
	double height;
	public Cube(double 1, double w, double h) {
		super(1,w);
		this.height = h;
	}
	public double getHeight(){
		return this.height;

	}
}