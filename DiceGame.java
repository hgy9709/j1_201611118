package com.sd.yutgame;

public class DiceGame {
    private Player p1;
    private Player p2;
	public DiceGame(String name1, String name2) {
		p1 = new Player(name1);
        	p2 = new Player(name2);
	}
	public void play() {
		p1.play(1);
		p2.play(1);

	}
	public Player getP1() {
		return p1;
	}
	public Player getP2() {
		return p2;
	}


	public String score() {
		int P1score = p1.getNum();
		int p2score= p2.getNum();
        if (P1score > P2score) {
            return "Winner :" + p1.getName();
        }

        else if (P1score < P2score) {

            return "Winner :" + p2.getName();

        }
    }

}