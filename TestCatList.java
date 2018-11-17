import java.util.ArrayList;

class TestCatList {
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<Cat>();

        for(int i = 0; i < 4; i++) {
            catList.add(new Cat());
        }
        catList.get(0).setName("Alexander");
        catList.get(1).setName("Benjamin");
        catList.get(2).setName("Charles");
        catList.get(3).setName("David");

        for(Cat thisCat: catList) { 
            //Gens random weight from 5.0 - 15.0
            thisCat.setWeight((Math.random() * 10) + 5);
            System.out.println(thisCat.getName() + " weighs " + 
                               thisCat.getWeight() + "lbs.");
            thisCat.meow();
        }
        
    }
}