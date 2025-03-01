package geoPolitical;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        while (true) {
            try {
                String userState = prompt();
                PoliticalZones zone = findZone(userState);
                System.out.println("Your state belongs to the " + zone + " zone!");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
    private static String prompt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your state:");
        return input.nextLine().trim();
    }

    private static PoliticalZones findZone(String userState){
        for (PoliticalZones zone : PoliticalZones.values()){
            for (String state : zone.getStates()){
                if (state.equalsIgnoreCase(userState)) {
                    return zone;
                }
            }
        }

        throw new RuntimeException("State not found");
    }
}