public class Main {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setName("Vodafone");
        one.setWeight(10);
        
        Dog two = new Dog();
        two.setName("Idea");
        two.setWeight(35);

        one.bark();
        two.bark();
    }
}