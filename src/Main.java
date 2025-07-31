public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("Drink","Coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("TOPPINGS","Avocado",1.50);
//        avocado.printItem();


//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerTopping("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secondOrder = new MealOrder("deluxe", "Pepsi", "chilli");
        secondOrder.setDrinkSize("SMALL");
        secondOrder.addBurgerTopping("LETTUCE", "CHEESE", "MAYO", "AVOCADO","BACON");
        secondOrder.printItemizedList();


    }

}
