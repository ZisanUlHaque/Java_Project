//9. Develop a simple shopping cart system for an online store where users can add products to the cart, view the cart, and check out.
package Project;
import java.util.ArrayList;
import java.util.Scanner;

class ShoppingCart {
    private ArrayList<String> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(String product) {
        cart.add(product);
        System.out.println(product + " has been added to your cart.");
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart contains: ");
            for (String product : cart) {
                System.out.println("- " + product);
            }
        }
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Add some items before checking out!");
        } else {
            System.out.println("Checking out the following items:");
            for (String product : cart) {
                System.out.println("- " + product);
            }
            System.out.println("Thank you for shopping with us!");
            cart.clear();
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        String[] products = {"Laptop", "Phone", "Headphones", "Mouse"};

        while (true) {
            System.out.println("\n1. View products");
            System.out.println("2. Add product to cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable products:");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter the product number to add: ");
                    int productChoice = scanner.nextInt();
                    if (productChoice > 0 && productChoice <= products.length) {
                        cart.addProduct(products[productChoice - 1]);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    cart.checkout();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
