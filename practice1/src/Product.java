import java.util.Scanner;

public class Product {
    String productName;
    int basePrice;
    int totalCost;
    String model;
    int quantity;


    void getUserSelection(Scanner scanner) {
        System.out.println("===============================");
        System.out.println(STR."Base cost of the \{productName}: $\{basePrice}");
        System.out.print("Which model do you want ");
    }
    void calculateCost(){
        totalCost += basePrice;
        System.out.println(STR."Total cost for one \{productName}: $\{totalCost}");
        totalCost *= quantity;
        System.out.println(STR."Total cost (quantity x \{quantity}): $\{totalCost}");
    }
}