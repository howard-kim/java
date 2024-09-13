import java.util.Scanner;

public class AirPods extends Product{
    public AirPods(){
        this.productName = "AirPods";
        this.basePrice = 120;
    }

    @Override
    void getUserSelection(Scanner scanner) {
        super.getUserSelection(scanner);
        System.out.print("(AirPods3 or AirPodsPro or AirPodsMax): ");
        scanner.nextLine();
        this.model = scanner.nextLine();
        System.out.print("How many do you want ot buy: ");
        this.quantity = scanner.nextInt();
    }

    @Override
    void calculateCost() {
        if (!this.model.equals("AirPods3")){
            if (this.model.equals("AirPodsPro")) {
                System.out.println("Model (AirPodsPro) ------ +$100");
                totalCost += 100;
            }
            else if(this.model.equals("AirPodsMax")) {
                System.out.println("Model (AirPodsMax) ------ +$200");
                totalCost += 200;
            }
        }
        super.calculateCost();
    }
}
