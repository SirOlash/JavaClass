public class  PangramChecker{
public boolean checkAlphabet(String sentence)
	
	boolean word = true;
	Boolean allWords = true;

	for(char letter = "a"; letter <= "z"; letter++){
		for(int index = 0;index <= sentence.length;index++){
			if (letter == sentence.toLowerCase().charAt(index)) {
				word = true;
				break;
			}

		}
		
		if (!word) {allWords = false;
				break;}
	}word = false;	
	return allWords;

}

}
