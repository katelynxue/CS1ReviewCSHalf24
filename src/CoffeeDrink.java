// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pNumberOfCups, String pFlavor, boolean pHasWhippedCream) {
        // TODO
        pNumberOfCups = numberOfCups;
        pFlavor = flavor;
        pHasWhippedCream = hasWhippedCream;
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        System.out.println("the number of cups is "+ numberOfCups);
        System.out.println("the flavor is "+ flavor);
        System.out.println("has whipped cream is "+hasWhippedCream);
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
