package ClassAndObjects;

/*
- classes vs objects(instances)
- class members/properties (variables and methods)
- object(instance) variables and methods
- class variables and methods (static variables and methods)
- constructors
 */
public class ClassesAndObjects_1 {

    public static void main(String[] args) {
        String name = "Ali";
        int number = 89;

        House houseOfFatma = new House();
        System.out.println(houseOfFatma.kitchenColor);
        houseOfFatma.kitchenColor = "blue";
        System.out.println(houseOfFatma.kitchenColor);

        House house2 = new House();
        House house3 = new House();
        House house4 = new House();
        House house5 = new House();
        House house6 = new House();

        house2.isSingleHouse = false;
        house2.changeKitchenColor();
        System.out.println(house2.kitchenColor);
    }
}


class House {
    int numberOfRooms = 2;
    String kitchenColor = "green";
    boolean isSingleHouse = true;
    double squareFeet = 150.75;

    public void changeKitchenColor(){
        if (!isSingleHouse){
            kitchenColor = "Yellow";
        }
    }
}


