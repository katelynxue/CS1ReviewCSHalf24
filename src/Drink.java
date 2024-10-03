// CoffeeDrink object class

class Drink {

    private int numberOfCups; // class wide variable
    private String drinkType;
    private boolean hasWhippedCream;

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

    // another Drink constructor
    // method overloading
    public Drink(){
        drinkType = "coffee";
        numberOfCups = 1;
        hasWhippedCream = false;
    }

    // Drink constructor that takes in a number of cups parameter
    // but has "coffee" and false as defaults for other variables
    public Drink(int numberOfCups){
        drinkType = "coffee";
        this.numberOfCups = numberOfCups;
        hasWhippedCream = false;
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

    }// end of printInfo()
    // goal: make numberOfCups visible (but not changeable) from other classes
    // "getter" method
    public int getNumberOfCups() {
        return numberOfCups;
    }
    // goal: make numberOfCups changeable from toher classes
    // "setter" method
    public void setNumberOfCups(int n){
        numberOfCups = n;
    }
    public String getDrinkType(){
        return drinkType;
    }
    public void setDrinkType(String){
        drinkType = "coffee";
    }
    public boolean getHasWhippedCream(){
        return getHasWhippedCream();
    }
    public void setHasWhippedCream(){
        hasWhippedCream = false;
    }

}// end of class
