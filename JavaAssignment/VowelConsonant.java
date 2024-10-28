import java.util.Scanner;
public class VowelConsonant{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a single character from the alphabet: ");
  String alphabet = input.nextLine();
  	
	if(alphabet.length() == 1 && Character.isLetter(alphabet.charAt(0))) {

		if("AEIOUaeiou".contains(alphabet)) {
			System.out.print("The alphabet entered is a vowel");}

		else{System.out.print("The alphabet entered is a consonant");}}
	
	 else{  System.out.print("Invalid entry, Please enter a single character of the alphabet");}

}
}