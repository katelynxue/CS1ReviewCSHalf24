// CoffeeDrink object class

class Drink {

    int numberOfCups;
    String drinkType;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public Drink(int numberOfCups, String drinkType, boolean hasWhippedCream) {
        // TODO
        this.numberOfCups = numberOfCups;
        this.drinkType = drinkType;
        this.hasWhippedCream = hasWhippedCream;
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        System.out.print("You ordered "+numberOfCups+" "+drinkType);
        if (hasWhippedCream){
            System.out.println(" with whipped cream.");
        } else{
            System.out.println(" without whipped cream.");
        }
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
