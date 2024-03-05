import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set initial budget
        double budget = 100.0;

        // Create an ArrayList to store items in the cart
        ArrayList<Double> itemsInCart = new ArrayList<>();

        // Get item details from the user
        System.out.print("Enter item price: ");
        double itemPrice = scanner.nextDouble();

        // Check shopping conditions
        boolean isItemAdded = checkShoppingCondition(budget, itemPrice, itemsInCart);

        // Display result
        if (isItemAdded) {
            System.out.println("Item added to the cart.");
            System.out.println("Updated budget: " + (budget - itemPrice));
            System.out.println("Items in the cart: " + itemsInCart);
        } else {
            System.out.println("Shopping condition not met. Item not added to the cart.");
        }
    }

    public static boolean checkShoppingCondition(double budget, double itemPrice, ArrayList<Double> itemsInCart) {
        // Check if the budget is enough for the item
        if (budget < itemPrice) {
            System.out.println("Insufficient budget. Cannot add item to cart.");
            return false;
        }

        // Check if the item is not already in the cart
        if (itemsInCart.contains(itemPrice)) {
            System.out.println("Item is already in the cart.");
            return false;
        }

        // If both conditions are met, add the item to the cart
        itemsInCart.add(itemPrice);
        return true;
    }
}
