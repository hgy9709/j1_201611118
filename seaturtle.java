package com.sd.ch8;
//import com.sd.ch8.Turtle;

public class seaturtle extends turtle{
  public void swim() {
      System.out.print("A seaturtle swims...");
  }
  public static void main(String[] args){
      seaturtle s = new seaturtle();
      s.setFood("fish");
      s.eat();
      s.swim();
      System.out.print("seaturtle has" +s.nLimbs+"limbs");
      }
}