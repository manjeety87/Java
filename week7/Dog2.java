public class Dog2 {
    public static final double LARGE_DOG_THRESOLD = 30.0;
    private final String _name;
    private final double _weight;
     
    public Dog2(String name, double weight) {
        _name = name;
        _weight = weight;
    }

    // public void setName(String name) {
    //     _name = name;
    // }

    // public void setWeight(double weight) {
    //     _weight = weight;
    // }

    public void bark() {
        if (_weight < LARGE_DOG_THRESOLD) {
            System.out.println(_name + " Says: Yip! Yip!");
        } else {

            System.out.println(_name + " Says: WOOF! WOOF!");
        }
    }

}