public class Dog {
    private String _name;
    private double _weight;

    public void setName(String name) {
        _name = name;
    }

    public void setWeight(double weight) {
        _weight = weight;
    }

    public void bark() {
        if (_weight < 30) {
            System.out.println(_name + " Says: Yip! Yip!");
        } else {

            System.out.println(_name + " Says: WOOF! WOOF!");
        }
    }

}