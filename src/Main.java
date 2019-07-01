import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        String userInput = "";

        System.out.println("Robo Resume! ");
        System.out.println("Would you like to make your personalized resume?");

        while (!userInput.equalsIgnoreCase("stop")) {
            System.out.println("Enter your full name: ");
            String name1 = reader.nextLine();

            System.out.println("Enter your email: ");
            String email1 = reader.nextLine();

            System.out.println("What degree do you have? ");
            String degreeType = reader.nextLine();

            System.out.println("What is your major? ");
            String major = reader.nextLine();

            System.out.println("What is the name of your university? ");
            String university = reader.nextLine();

            System.out.println("Graduation year: ");
            int graduationYear = Integer.parseInt(reader.nextLine());

            System.out.println("Company name: ");
            String company = reader.nextLine();

            System.out.println("What is your job title? ");
            String jobTitle = reader.nextLine();

            System.out.println("Job description? ");
            String jonDescription = reader.nextLine();

            System.out.println("Name of skills: ");
            String mySkills = reader.nextLine();

            System.out.println("Would you like to add another skill: (please enter no to continue without adding another skill)");
            String  anotherSkill = reader.nextLine();

            while (!anotherSkill.equalsIgnoreCase("no")) {
                System.out.println("Enter the name/type of your skill: ");
                String nameSkill = reader.nextLine();

                System.out.println("Enter the proficiency level of your " + nameSkill + " skill: ");
                String skillProficiency = reader.nextLine();

                System.out.println("Would you like to add another skill: (please enter no to continue without adding another skill)");
                anotherSkill = reader.nextLine();
            }

            System.out.println("Would you like to build another resume?  (or type quit to exit)");
            userInput = reader.next();

            String storedInput = "";

            storedInput += ("\t\t\t\t" + name1 +
                    "\n" + "\t\t\t\t" + email1 +
                    "\n" + "_______________________ " +
                    "\n" + university +
                    "\n" + degreeType +
                    "\n" + graduationYear +
                    "\n" + "_______________________ " +
                    "\n" + jobTitle +
                    "\n" + company +
                    "\n" + jonDescription +
                    "\n" + "_______________________ " +
                    "\n" + mySkills +
                    "\n" +  +"\n" );

        }



        printStatement(storedInput);


    }


    public static void printStatement(String print) {
        System.out.println(print);
    }
}


