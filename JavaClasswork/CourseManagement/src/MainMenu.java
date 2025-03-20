import java.util.Scanner;

public class MainMenu {
    private static Scanner input = new Scanner(System.in);
    private static Admin admin = new Admin();


    public static void main(String[] args){
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("""
                Welcome to the course management Menu
                1. Login
                2. Register
                3. Exit
                """);
        int choice = intInput("Enter your choice: ");
        switch (choice) {
            case 1: System.out.println("i. Login as a student\n2. Login as a Facilitator\n3. Exit");
                    int loginChoice = intInput("Enter your choice: ");
                    switch (loginChoice) {
                        case 1:studentLogin();
                            break;
                        case 2: facilitatorLogin();
                            break;
                        case 3: System.exit(0);
                    }

                break;
            case 2:register();
                break;
            case 3:System.out.println("Thank you for using Course Management System");
                   System.exit(0);
                   break;
            default:System.out.println("Invalid choice");
        }
    }

    private static void studentMenu(Student student) {
        String message = String.format("""
                Welcome to your Portal %s!
                1. View Available Courses
                2. Register for a Course
                3. View Registered Courses
                4. Go back to Main Menu
                """,student.getLastName());
        System.out.println(message);
        int choice = intInput("Enter your choice: ");
        switch (choice) {
            case 1:availableCourses(student);
                break;
            case 2:
                courseRegistration(student);
                break;
//            case 3:viewRegisteredCourses(student);
//                break;
            case 4: mainMenu();
                break;
        }

    }

    private static void facilitatorMenu(Facilitator facilitator) {
//        Facilitator facilitator = admin.getFacilitatorByEmail(email);
        String message = String.format("""
                Welcome to your Portal Mr/Mrs %s!
                1. Add a Course
                2. View Registered student per Course
                3. Assign Grade to student
                4. Go back to Main Menu
                """,facilitator.getLastName());
        System.out.println(message);
        int choice = intInput("Enter your choice: ");
        switch (choice) {
            case 1:addCourse(facilitator);
                break;
            case 2:viewRegisteredStudents(facilitator);
                break;
//            case 3:assignGrade(email);
//                break;
            case 4: mainMenu();
                break;
        }

    }

    private static void viewRegisteredStudents(Facilitator facilitator) {
        facilitator.viewCreatedCourses();
    }

    private static void courseRegistration(Student student) {
        student.viewAllCourses();
        String courseName = courseInput();
        int courseCode = intInput("Enter course code: ");
        student.registerCourse(courseName,courseCode);
        studentMenu(student);
    }

    private static void availableCourses(Student student) {
        loadingScreen("Checking available courses");
        student.viewAllCourses();
        studentMenu(student);

    }

    private static void addCourse(Facilitator facilitator) {
        String courseName = courseInput();
        int courseCode = intInput("Enter Course Code: ");
        try{
            facilitator.createCourse(courseName, courseCode);
            loadingScreen("Creating Course " + courseName);
            System.out.println("Course " + courseName + " created successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            facilitatorMenu(facilitator);
        }

    }

    private static void facilitatorLogin(){
        String email = emailInput();
        String password = passwordInput();
        try{
            Facilitator currentFacilitator = admin.facilitatorLogin(email, password);
            loadingScreen("Loading");
            facilitatorMenu(currentFacilitator);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            mainMenu();
        }
    }

    private static void studentLogin() {
        String email = emailInput();
        String password = passwordInput();
        try{
            Student currentStudent = admin.studentLogin(email, password);
            loadingScreen("Loading");
            studentMenu(currentStudent);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mainMenu();
        }

    }
    private static void register() {
        String firstName = nameInput("Enter your first name: ");
        String lastName = nameInput("Enter your last name: ");
        String email = emailInput();
        String password = passwordInput();
        String choice = stringInput("Are You A Student or Facilitator? (S/F)","^(S|s|F|f)$","Enter either S or F");

        boolean student = admin.register(firstName, lastName, email, password, choice);
        loadingScreen("Registering");
        if (student){
            System.out.println("You have successfully registered as a Student");
        }
        else{
            System.out.println("You have successfully registered as a Facilitator");
        }

        mainMenu();
    }

    private static String nameInput(String prompt) {
        return stringInput(
                prompt,
                "^[a-zA-Z]{2,}$",
                "Name can't be empty or contain numbers!"
        );
    }

    private static String passwordInput() {
        return stringInput(
                "Enter your password: ",
                "^[a-zA-Z0-9]{4,}$",
                "Password should contain a minimum of 4 characters (letters or numbers)!"
        );
    }

    private static String emailInput() {
        return stringInput(
                "Enter your email address: ",
                "^[A-Za-z0-9+_.-]+@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$",
                "Invalid email address!"
        );
    }

    private static String courseInput() {
        return stringInput(
                "Enter Course Name: ",
                "^[a-zA-Z]{2,}$",
                "Invalid Course Name!"
        );
    }

    private static String stringInput(String prompt, String regex, String errorMessage) {
        while (true) {
            System.out.print(prompt);
            String userInput = input.nextLine().trim();

            if (!userInput.isEmpty() && (regex == null || userInput.matches(regex))) {
                return userInput;
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    private static int intInput(String message) {
        System.out.print(message + " ");
        while(!input.hasNextInt()){
            System.out.println("Invalid input. Please enter a valid integer");
            input.next();
        }
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

    private static void loadingScreen(String message) {
        System.out.print(message);
        for (int index = 1;index < 6; index++) {
            System.out.print(">");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
