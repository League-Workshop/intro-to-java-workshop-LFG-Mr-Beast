package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak ("zombs royale");
		// 2. Catch the user's answer in a String
String answer=JOptionPane.showInputDialog("Spell the word you just heard");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equals("zombs royale")){
	speak ("correct");
	}
		// 4. Otherwise say "wrong"
else {
	speak ("incorrect");
	}
		// 5. repeat the process for other words
		speak ("fortnite");
		answer=JOptionPane.showInputDialog("Spell the word you just heard");
		if(answer.equals("fortnite")) {
			speak ("correct");
		}
		else {
			speak ("incorrect");
		}
		speak ("yeetis");
		answer=JOptionPane.showInputDialog("Spell the word you just heard");
		if(answer.equals("yeetis")) {
			speak ("correct");
		}
		else {
			speak ("incorrect");
		}
		speak ("jebaited");
		answer=JOptionPane.showInputDialog("Spell the word you just heard");
		if(answer.equals("jebaited")) {
			speak ("correct");
		}
		else {
			speak ("incorrect");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


