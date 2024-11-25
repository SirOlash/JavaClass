import java.util.Scanner;
public class NokiaPhone{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Nokia Menu Functions, Please Press:\n1. To enter Phone Book\n2. To enter Messages\n3. To enter Chat\n4. To enter call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10 Reminders\n11. Clock\n12. SIM services\n>>>");

	int menuAnswer = input.nextInt();
	
	switch(menuAnswer) {
		case 1: System.out.print("Select one:\n1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6 Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags\n>>>");

	int taskAnswer = input.nextInt();
	switch(taskAnswer){
		case 1: System.out.print("Search....");
		       break;
		case 2: System.out.print("Service Nos......");
			break;
		case 3: System.out.print("Add your name.....");
			break;
		case 4: System.out.print("Erase.....");
			break;
		case 5: System.out.print("Edit.....");
			break;
		case 6: System.out.print("Assign tone.....");
			break;
		case 7: System.out.print("Send b'card.....");
			break;
		case 8: System.out.print("Select One:\n1. Type of view\n2. Memory status\n>>>");
	int optionAnswer = input.nextInt();
	switch(optionAnswer){
		case 1: System.out.print("The Type of view");
			break;
		case 2: System.out.print("Memory Status");}
			break;

		case 9: System.out.print("Speed dials.....");
			break;
		case 10: System.out.print("Voice tags");}
			break;


		case 2: System.out.print("Messages, Select one:\n1. Write messages\n2. Inbox\n3. Outbox\n4. Picture Messages\n5. Templates\n6 Smileys\n7. Message setings\n8. Info service\n9. Voice mailbox number\n10. Service command editor\n>>>");
	int messageAnswer = input.nextInt();
	switch(messageAnswer){
		case 1: System.out.print("Type your messages:......");
			break;
		case 2: System.out.print("Your inbox:......");
			break;
		case 3: System.out.print("Your Outbox:......");
			break;
		case 4: System.out.print("Your picture messages:......");
			break;
		case 5: System.out.print("Your Templates:......");
			break;
		case 6: System.out.print("Your Smileys:......");
			break;
		case 7: System.out.print("Choose One:\n1. Set 1\n2.Common\n>>>");
	int messageSettingsAnswer = input.nextInt();
	switch(messageSettingsAnswer){
		case 1: System.out.print("SET 1,  Choose one:\n1. Message centre number\n2. Messages sent as\n3. Message validity\n>>>");
	int set1Answer = input.nextInt();
	switch(set1Answer){
		case 1: System.out.print("Your Message centre number:......");
			break;
		case 2: System.out.print("Messages sent as:......");
			break;
		case 3: System.out.print("Message validity:......");}
			break;
		case 2: System.out.print("COMMON Settings,  Choose one:\n1. Delivery reports\n2. Reply via same centre\n3. Character support\n>>>");
	int commonAnswer = input.nextInt();
	switch(commonAnswer){
		case 1: System.out.print("Delivery reports:......");
			break;
		case 2: System.out.print("Reply via same centre:......");
			break;
		case 3: System.out.print("Character support:......");}
}
			break;
		case 8: System.out.print("Info service:......");
			break;
		case 9: System.out.print("Voice mailbox number:......");
			break;
		case 10: System.out.print("Service command editor:......");}
			break;
		
		case 3: System.out.print("Your chat.......");
			break;


		case 4: System.out.print("Call Register, Choose One:\n1. Missed calls\n2. Received calls\n3. Dialled number\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit\n>>>");

	int callRegisterAnswer = input.nextInt();
	switch (callRegisterAnswer){
		case 1: System.out.print("Your Missed calls.....");
			break;
		case 2: System.out.print("Your Received calls....");
			break;
		case 3: System.out.print("Your Dialled numbers....");
			break;
		case 4: System.out.print("Erase recent call lists....");
			break;
		case 5: System.out.print("Call duration, Choose One:\n1. Last call duration\n2. All calls' duration\n3. Received calls' duration\n4. Dialled calls' duration\n5. Clear timers\n>>>");
	int callDurationAnswer = input.nextInt();
	switch (callDurationAnswer){
		case 1: System.out.print("Last call duration.....");
			break;
		case 2: System.out.print("All calls' duration.....");
			break;
		case 3: System.out.print("Received calls' duration.....");
			break;
		case 4: System.out.print("Dialled calls' duration.....");
			break;
		case 5: System.out.print("Clear timers.....");}
			break;
		
		case 6: System.out.print("Call costs, Choose One:\n1.Last call cost\n2. All calls' cost\n3. Clear counters\n>>>");
	int callCostAnswer = input.nextInt();
	switch (callCostAnswer){
		case 1: System.out.print("Last call cost.....");
			break;
		case 2: System.out.print("All calls' cost.....");
			break;
		case 3: System.out.print("Clear counters.....");}
			break;

		case 7: System.out.print("Call cost settings, Choose One:\n1.Call cost limit\n2. Show costs in\n>>>");
	int costSettingsAnswer = input.nextInt();
	switch (costSettingsAnswer){
		case 1: System.out.print("Call cost limit....");
			break;
		case 2: System.out.print("Show costs in.....");}
			break;
		
		case 8: System.out.print("Prepaid credit.....");}
			break;


		case 5: System.out.print("Tones, Choose One:\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver");
	int tonesAnswer = input.nextInt();
	switch (tonesAnswer){
		case 1: System.out.print("Ringing tone....");
			 break;
		case 2: System.out.print("Ringing Volume....");
			break;
		case 3: System.out.print("Incoming call alert....");
			break;
		case 4: System.out.print("Composer....");
			break;
		case 5: System.out.print("Message alert tone....");
			break;
		case 6: System.out.print("Keypad tones....");
			break;
		case 7: System.out.print("Warning and game tones....");
			break;
		case 8: System.out.print("Vibrating alert....");
			break;
		case 9: System.out.print("Screen saver....");}
			break;

		case 6: System.out.print("Settings, ChooseOne:\n1. Call settings\n2. Phone Settings\n3. Security settings\n>>>");
	int settingsAnswer = input.nextInt();
	switch (settingsAnswer){
		case 1:  System.out.print("Call settings,  Choose One\n1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer\n>>> ");
	int callSettingsAnswer = input.nextInt();
	switch (callSettingsAnswer){
		case 1: System.out.print("Automatic redial....");
			break;
		case 2: System.out.print("Speed dialing....");
			break;
		case 3: System.out.print("Call Waiting Options....");
			break;
		case 4: System.out.print("Own number sending.....");
			break;
		case 5: System.out.print("Phone line in use......");
			break;
		case 6: System.out.print("Automatic answer....");}
			break;
		
	 	case 2: System.out.print("Phone settings,  Choose One\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service action\n>>> ");
	int phoneSettingsAnswer = input.nextInt();
	switch(phoneSettingsAnswer){
		case 1: System.out.print("Choose your language......");
			break;

		case 2: System.out.print("Cell info display......");
			break;

		case 3: System.out.print("Welcome note......");
			break;
		
		case 4: System.out.print("Network selection......");
			break;
		case 5: System.out.print("Lights......");
			break;
		case 6: System.out.print("Confirm SIM service action......");}
			break;
	
		case 3: System.out.print("Security settings,  Choose One\n1. Pin code Request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access codes\n>>> ");
	int securitySettingsAnswer = input.nextInt();
	switch(securitySettingsAnswer) {
		case 1:	System.out.print("PIN code request......");
			break;
		case 2:	System.out.print("Call barring service......");
			break;
		case 3:	System.out.print("Fixed dialling......");
			break;
		case 4: System.out.print("Closed user group......");
			break;
		case 5: System.out.print("Phone security......");
			break;
		case 6:	System.out.print("Change access codes......");}
			break;
 
		case 4: System.out.print("Restore factory settings......");}
			break;


		case 7: System.out.print("Call divert.......");
			break;
		
		case 8: System.out.print("Games.......");
			break;
		case 9: System.out.print("Calculator.......");
			break;
		case 10: System.out.print("Remainders.......");
			 break;
		case 11: System.out.print("Clock, Enter a number:\n1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time\n>>>");
	int clockAnswer = input.nextInt();
	switch(clockAnswer){
		case 1: System.out.print("Alarm clock.......");
			break;
		case 2: System.out.print("Clock setting.......");
			break;
		case 3: System.out.print("Date setting.......");
			break;
		case 4: System.out.print("Stopwatch.......");
			break;
		case 5: System.out.print("Countdown timer.......");
			break;
		case 6: System.out.print("Auto update of date and time.......");}
			break;

			 
		case 12: System.out.print("Profiles.......");
			 break;
		case 13: System.out.print("SIM Serive.......");
			 break;

}


}
}