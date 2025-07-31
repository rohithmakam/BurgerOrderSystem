public class Main {
    public static void main(String[] args) {


//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerTopping("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secondOrder = new MealOrder("dulex", "Pepsi", "chilli");
        secondOrder.setDrinkSize("SMALL");
        secondOrder.addBurgerTopping("LETTUCE", "CHEESE", "MAYO", "AVOCADO","BACON");
        secondOrder.printItemizedList();


    }

}
