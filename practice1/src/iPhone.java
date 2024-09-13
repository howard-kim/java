import java.util.Scanner;

public class iPhone extends Product{
    String memory;
    String color;

    public iPhone(){
        this.productName = "iPhone";
        this.basePrice = 800;
    }

    @Override
    void getUserSelection(Scanner scanner) {
        super.getUserSelection(scanner);
        System.out.print("(iPhone12 or iPhone13): ");
        scanner.nextLine();
        this.model = scanner.nextLine();
        System.out.print("Color (base, Gold, Silver): ");
        this.color = scanner.nextLine();
        System.out.print("Memory (64, 128, 256, 512): ");
        this.memory = scanner.nextLine();
        System.out.print("How many do you want ot buy: ");
        this.quantity = scanner.nextInt();
    }

    @Override
    void calculateCost() {
        if (this.model.equals("iPhone13")) {
            System.out.println("Model (iPhone13) ------ +$200");
            totalCost += 200;
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
        if (!this.memory.equals("64")) {
            if (this.memory.equals("128")) {
                System.out.println("Memory (128) ------ +$100");
                totalCost += 100;
            }
            else if (this.memory.equals("256")){
                System.out.println("Memory (256) ------ +$200");
                totalCost += 200;
            }
            else {
                System.out.println("Memory (512) ------ +$300");
                totalCost += 300;
            }
        }
        super.calculateCost();
    }
}
