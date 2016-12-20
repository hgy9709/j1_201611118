import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Play extends JFrame implements ActionListener{
	JPanel game = new JPanel(new BorderLayout(0,20));

	JLabel title= new JLabel("yut game");
	JLabel result = new JLabel("result: ");
	JLabel result2 = new JLabel("result: ");
	JButton button = new JButton("player1");
	JButton button = new JButton("player2");

	public Play() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints gbc = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());

		game.add("North", title);
		game.add("Center", result);
		game.add("Center", result2);
		game.add("South", player1);
		game.add("South", player2);

		getContentPane().add(game, gbc); 

		jb_button.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {
	result.setText("result:" + choice());
	}
	public String choice() {
		int number = (int)(Math.random()*5);

		switch(number) {
			case 0:
			return "do";
			case 1:
			return "gae";
			case 2:
			return "gul";
			case 3:
			return "yut";
			case 4:
			return "mo";
	
		}
	return null;
	}	
	public static void main(String[] args) {
		new Play().setVisible(true);
	}
	}
