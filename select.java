package com.sd.ch8;

import java.util.*;

public class Selection {
	ArrayList<Rectangle> sArr = new ArrayList<Rectangle>();
	public Selection(){}
	public void select(Rectangle r) {
		r.setSelected(true);
		sArr.add(r);
		System.out.println("selected: "+r.getSelected());
	}
	pubilc void print() {
		for(Rectangle r:sArr){
			System.out.printin(r.toString());
		}
	]
	public static void main(String[] args){
		Selection s= new Selection();
		Rectangle r = new Rectangle(40, 50);
		Cube c = new Cube(60,60,60);
		s.select(r);
		s.select(c);
		s.print();
	}
}