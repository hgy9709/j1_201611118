package com.sd.ch8;
//import com.sd.ch8.Turtle;

public class landturtle extends turtle{
  public void walk() {
    System.out.print("A landturtle walks...");
  }
      public static void main(String[] args){
        landturtle l = new landturtle();
        l.setFood("insect");
        l.eat();
        l.walk();
        System.out.print("landturtle has"+l.nLimbs+"limbs");
      }
}