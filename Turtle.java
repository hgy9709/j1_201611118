package com.sd.yutgame;
import ch.aplu.turtle.*;
import java.awt.Color;

public class Turtle {
	Turtle t1 = new Turtle();
	public void Turtle(double x1, double x2) {
		t1.penup();
		t1.setPos(x1,y1);
		t1.penDown();
	}
	public void color(){
		t1.setPenColor("blue");
	}

	public void run(int x1){
		t1.forward(x1*30);
	}

	public void back(){
		t1.back(30);
	}
}