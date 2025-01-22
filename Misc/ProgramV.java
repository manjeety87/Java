public class ProgramV {
    // private static double pi;
    private double pi;  //OPTIMIZE we reomved static as it breaks object oriented rule that's why we created instance variable and assigned pi to self

    public static void main(String[] args) {
        System.err.println("Hello Pi Program!");

        ProgramV self = new ProgramV();
        self.pi = 355.0 / 113.0;

        System.out.println("Pi is about " + self.pi);

        double multiplier = 2;
    }
}
