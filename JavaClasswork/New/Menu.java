import java.util.Scanner;
public class Menu{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
	int answer;

  do{
	System.out.print("Choose One:\n1) Add\n2) View\n3) Delete\n4) Quit\n>>>");
   	answer = input.nextInt();
	if (answer == 1) System.out.println("You Selected Add!!");
	else if(answer == 2) System.out.println("You Selected View!!");
	else if(answer == 3) System.out.println("You Selected Delete!!");
	// else if(answer == 4) System.out.print("You Selected Quit!!");
}

  while(answer!=4);
}
}