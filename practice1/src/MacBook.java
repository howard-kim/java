import java.util.Scanner;

public class MacBook extends Product{
    String memory;
    String size;
    String color;

    public MacBook(){
        this.productName = "MacBook";
        this.basePrice = 1000;
//        System.out.println(STR."Base cost of the MacBook: $\{basePrice}");
    }

    @Override
    void getUserSelection(Scanner scanner) {
        super.getUserSelection(scanner);
        System.out.print("(Air or Pro): ");
        scanner.nextLine();
        this.model = scanner.nextLine();
        System.out.print("Size (13, 14, 16): ");
        this.size = scanner.nextLine();
        System.out.print("Color (base, Gold, Silver): ");
        this.color = scanner.nextLine();
        System.out.print("Memory (128, 256, 512): ");
        this.memory = scanner.nextLine();
        System.out.print("How many do you want ot buy: ");
        this.quantity = scanner.nextInt();
    }

    @Override
    void calculateCost() {
        if (this.model.equals("Pro")) {
            System.out.println("Model (Pro) ------ +$200");
            totalCost += 200;
        }
        if (!this.size.equals("13")) {
            if (this.size.equals("14")) {
                System.out.println("Size (14) ------ +$100");
                totalCost += 100;
            }
            else {
                System.out.println("Size (15) ------ +$200");
                totalCost += 100;
            }
        }
        if (!this.color.equals("base")) {
            if (this.color.equals("Gold")) {
                System.out.println("Color (Gold) ------ +$20");
                totalCost += 20;
            }
            else {
                System.out.println("Color (Silver) ------ +$10");
                totalCost += 10;
            }
        }
        if (!this.memory.equals("128")) {
            if (this.memory.equals("256")) {
                System.out.println("Memory (256) ------ +$100");
                totalCost += 100;
            }
            else {
                System.out.println("Memory (512) ------ +$300");
                totalCost += 300;
            }
        }
        super.calculateCost();
    }
}
