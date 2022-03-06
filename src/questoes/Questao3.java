package questoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao3 {
	public static String LineColunmEncript(String phrase) {
		String phraseNWS = phrase.replace(" ", "");
		int lineSize = (int) Math.ceil(Math.sqrt(phraseNWS.length()));
		
		int ind = 0;
		int phraseInd = 0;
		
		String encPhrase = "";
		while (ind < lineSize) {
			try {
				encPhrase += phraseNWS.substring(phraseInd,phraseInd+1);
				phraseInd += lineSize;
			} catch(IndexOutOfBoundsException e) {
				encPhrase += " ";
				ind++;
				phraseInd = ind;
			}
		}
		return encPhrase.substring(0, encPhrase.length()-1);
	}

	@Test
	void test() {
		Assertions.assertEquals("taoa eum nmd hbi", LineColunmEncript("tenha um bom dia"));
		Assertions.assertEquals("omd luo an", LineColunmEncript("ola mundo"));
		Assertions.assertEquals("amai cipn angi dae ecm", LineColunmEncript("academina capgemini"));
	}
}
