import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in); // using final as it won't be changing

    public static void main(String[] args) {

        Student student1 = new Student("Manjeet", 991234567); // initializing student object
        Student student2 = new Student("Shah Rukh Khan", 991234568); // initializing facourite hero object

        student1.setGpa(3.7);
        student2.setGpa(1.8);
        student1.setCreditsEarned(39);
        student2.setCreditsEarned(39);
        student2.setOnProbation(true);

        while (true) {
            System.out.print("\nEnter a student ID: ");
            int id = input.nextInt();

            Student selectedStudent;

            if (id == student1.getId()) {
                selectedStudent = student1;
            } else if (id == student2.getId()) {
                selectedStudent = student2;
            } else {
                System.out.println("Error: Invalid ID. Try again.");
                continue;
            }

            menu(selectedStudent);
        }
    }

    public static void menu(Student st) {
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1: Student info");
            System.out.println("2: Increase credits earned");
            System.out.println("3: Change probation status");
            System.out.println("4: Exit");
            System.out.print("Please choose what you'd like to do: ");

            // int choice = input.nextInt();

            int choice;
            while (true) { // Looping until a valid input is entered
                if (input.hasNextInt()) {
                    choice = input.nextInt();
                    break;
                } else {
                    System.out.println("Please input number type only.");
                    input.next(); // Discard invalid input
                    System.out.print("Please choose what you'd like to do: ");
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("\nStudent: " + st.getStudentName());
                    System.out.println("ID: " + st.getId());
                    System.out.println("GPA: " + st.getGpa());
                    System.out.println("Credits earned: " + st.getCreditsEarned());
                    System.out.println("Probation status: " + st.isOnProbation());
                    break;

                case 2:
                    System.out.print("\nEnter the number of credits to add: ");
                    double credits = input.nextDouble();
                    st.addCredits(credits);
                    break;

                case 3:
                    st.changeProbation();
                    System.out.println("Probation status changed to " + st.isOnProbation());
                    break;

                case 4:
                    return; // Exit the menu

                default:
                    System.out.println("Error: Invalid option");
            }
        }
    }
}
