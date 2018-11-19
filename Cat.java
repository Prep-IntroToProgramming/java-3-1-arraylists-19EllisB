
public class Cat {
    private String name;
    private double weight;

    public void setName(String newName) {
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setWeight(double newWeight) {
        if (newWeight > 0.0) {
            weight = newWeight;
        } else {
            throw new RuntimeException(); //if weight is invalid.
        }
    }

    public double getWeight() {
        return weight;
    }

    public void meow() {
        if(Math.random() < 0.25) {
            System.out.println("*OwO*");
        } else {
            System.out.println("Meow!");
        }
    }
}
