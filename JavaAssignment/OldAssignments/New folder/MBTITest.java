import java.util.Scanner;

public class MBTITest{
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

	System.out.print("Enter your name: ");
	String name = input.nextLine();

        String[][] questions = {
            {" A. Expend energy, enjoy groups"," B. Conserve energy, enjoy one-on-one"," C. try this"},
            {" A. Interpret literally"," B. look for meaning and possibilities",},
            {" A. logical, thinking, questioning"," B. empathetic, feeling, accommodating"},
            {" A. organized, orderly"," B. flexible, adoptable","C. Trty nity"},
            {" A. more outgoing, think out loud"," B. more reserved, think to yourself"},
            {" A. practical, realistic, experiential"," B. imaginative, innovative, theoretical"},
            {" A. candid, straight forward, frank"," B. tactful, kind, encouraging"},
            {" A. plan, schedule"," B. unplanned, spontaneous","C. Trty nity"},
            {" A. seek many tasks, public activities, interaction with others"," B. seek private, solitary activities with quiet to concentrate"},
            {" A. standard, usual, conventional"," B. different, novel, unique"},
            {" A. firm, tend to criticize, hold the line"," B. gentle, tend to appreciate, conciliate"},
            {" A. regulated, structured"," B. easy going, live and let live","C. Trty nity"},
            {" A. external, communicative, express yourself"," B. internal, reticent, keep to yourself"},
            {" A. focus on here and now"," B. look to the future, global perspective, big picture"},
            {" A. tough-minded, just"," B. tender-hearted, merciful"},
            {" A. preparation, plan ahead"," B. go with the flow, adapt as you go","C. Trty nity"},
            {" A. active, initiate"," B. reflective, deliberate"},
            {" A. facts things what is"," B. ideas dreams, what would be, philosophical"},
            {" A. matter of fact issue-oriented"," B. sensitive, people-oriented, compassionate"},
            {" A. control, govern"," B. latitude, freedom"}};

	
	int[] times = new int[4];
	for (int number = 0; number < 4; number++) {
		int countA = 0;
		int countB = 0;
		int countC = 0;
		for (int row = number; row < 20; row += 4) {
			String response = "";

			while(!response.equals("a") || !response.equals("b") || !response.equals("c")){
			System.out.print(questions[row][0] + " " + questions[row][1] + "\n Choose A or B or C: ");
   			response = input.nextLine();
				response = response.toLowerCase();

    				if (response.equals("a")){
       					countA++;
					break;}
				else if (response.equals("b")) {
        				countB++;
					break;}
				else if (response.equals("c")) {
        				countC++;
					break;}
				else {System.out.println("I know You made an error try again");}
				}
			}
		times[number] = countA;
		System.out.println("The number of A selected is: " + countA);
		System.out.println("The number of B selected is: " + countB);
		System.out.println("The number of C selected is: " + countC);
		System.out.println();
		}
		
		String myMbtiType =
		(times[0] > 2 ? "E" : "I") +
            	(times[1] > 2 ? "S" : "N") +
            	(times[2] > 2 ? "T" : "F") +
            	(times[3] > 2 ? "J" : "P");
	
       	System.out.println(name + ", Your MBTI type is: " + myMbtiType);
	System.out.println();

	switch (myMbtiType) {

            case "ENTJ":
                System.out.println("ENTJ (Commander) is a personality type with the Extroverted, Intuitive, Thinking, and Judging traits. Bold and imaginative, they are strong-willed leaders who enjoy organizing and directing people and projects.");
                break;

	    case "ENFJ":
                System.out.println("ENFJ (Protagonist) is a personality type with the Extroverted, Intuitive, Feeling, and Judging traits. They are charismatic and inspiring leaders, often driven to help others realize their potential.");
                break;

            case "ESFJ":
                System.out.println("ESFJ (Consul) is a personality type with the Extroverted, Sensing, Feeling, and Judging traits. Caring and social, they have a strong sense of duty and are eager to help others.");
                break;

	    case "ENTP":
                System.out.println("ENTP (Debater) is a personality type with the Extroverted, Intuitive, Thinking, and Prospecting traits. Quick-witted and clever, they enjoy the challenge of ideas and often think outside the box.");
                break;

	    case "ESTJ":
                System.out.println("ESTJ (Executive) is a personality type with the Extroverted, Sensing, Thinking, and Judging traits. Organized and driven, they focus on results and managing tasks efficiently.");
                break;

	    case "INFJ":
                System.out.println("INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
                break;

            case "ISFP":
                System.out.println("ISFP (Adventurer) is a personality type with the Introverted, Sensing, Feeling, and Prospecting traits. Creative and spontaneous, they value freedom and often express themselves through art and other forms of creativity.");
                break;

            case "ENFP":
                System.out.println("ENFP (Campaigner) is a personality type with the Extroverted, Intuitive, Feeling, and Prospecting traits. Enthusiastic and creative, they have a strong sense of possibility and are driven by their values and ideas.");
                break;

            case "INTP":
                System.out.println("INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
                break;

            case "ISFJ":
                System.out.println("ISFJ (Defender) is a personality type with the Introverted, Sensing, Feeling, and Judging traits. Warm and conscientious, they have a strong sense of duty and take pride in their responsibilities.");
                break;

	    case "ISTP":
                System.out.println("ISTP (Virtuoso) is a personality type with the Introverted, Sensing, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");
                break;

            case "ISTJ":
                System.out.println("ISTJ (Logistician) is a personality type with the Introverted, Sensing, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");
                break;

            case "ESFP":
                System.out.println("ESFP (Entertainer) is a personality type with the Extroverted, Sensing, Feeling, and Prospecting traits. Outgoing and spontaneous, they enjoy life in the moment and often seek new experiences.");
                break;

            case "ESTP":
                System.out.println("ESTP (Entrepreneur) is a personality type with the Extroverted, Sensing, Thinking, and Prospecting traits. Bold and perceptive, they take action to make things happen and enjoy living on the edge.");
                break;

	    case "INTJ":
                System.out.println("INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
                break;		

	    case "INFP":
                System.out.println("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. Idealistic and loyal to their values, they are driven by their beliefs and desire to make the world a better place.");
                break;

            default:
                System.out.println("Your personality type is not recognized.");break;
}
		
}
}