package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String roblox = JOptionPane.showInputDialog(null,"what year was Roblox released?");
				// 3.  Use an if statement to check if their answer is correct
				if (roblox.equals("2006")){
					score += 1;
					JOptionPane.showMessageDialog(null,"correct!");
				}
				else {
					JOptionPane.showMessageDialog(null, "incorrect");
					score -=1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		String math = JOptionPane.showInputDialog("9+10");
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		if (math.equals("21")){
			score += 1;
			JOptionPane.showMessageDialog(null,"correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect");
			score -=1;
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, score);
	}
}
