package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String beast=JOptionPane.showInputDialog(" Is lfg_mr_beast the best twitch streamer in the world? ");
		// 3.  Use an if statement to check if their answer is correct
		if (beast.equals("yes")){
		JOptionPane.showMessageDialog(null, "You are correct!");
		score+=1;
		JOptionPane.showMessageDialog(null, score + "");
		System.out.println(score);
		// 4.  if the user's answer was correct, add one to their score 
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String yeet=JOptionPane.showInputDialog(" Is Minecraft fun? ");
		if (yeet.equals("yes")){
			JOptionPane.showMessageDialog(null, "You are correct!");
			score+=1;
			JOptionPane.showMessageDialog(null, score + "");
			System.out.println(score);
			String fartnite=JOptionPane.showInputDialog(" What is 9+10? ");
			if (fartnite.equals("21")){
				JOptionPane.showMessageDialog(null, "You are correct!");
				score+=1;
				JOptionPane.showMessageDialog(null, score + "");
				System.out.println(score);
				String zartnite=JOptionPane.showInputDialog(" Is lfg_mr_beast bad at Zombs? ");
				if (zartnite.equals("no")){
					JOptionPane.showMessageDialog(null, "You are correct!");
					score+=1;
					JOptionPane.showMessageDialog(null, score + "");
					System.out.println(score);
					String halt=JOptionPane.showInputDialog(" Was this test fun? ");
					if (halt.equals("no")){
						JOptionPane.showMessageDialog(null, "You are correct!");
						score+=1;
						JOptionPane.showMessageDialog(null, score + "");
						System.out.println(score);
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
}
}
}
}