public static boolean palindrome(String text){
	String reversed = "";
	for(int letter = 0; letter < text.length(); letter++){
		reversed = text.charAt(letter) + reversed;
	}
		if(reversed.equals(text)){
			return true;
		}
		return false;
	}