//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.crypto.Mac;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static int question(Scanner scanner){
        String [][] options = {{"1", "MacBook"},{"2", "iPhone"},{"3", "AirPods"},{"0", "Exit"}};

        System.out.println("What do you want to buy?");
        for(int i = 0; i < 4; i++) {
            System.out.println(STR."Choose \{options[i][0]} for \{options[i][1]}");
        }
        System.out.print("Please enter your choice: ");
        return scanner.nextInt();
    }
    public static void process(int choice,Scanner scanner){
        Product product = new Product();
        switch (choice){
            case 1:
                product = new MacBook();
                product.getUserSelection(scanner);
                System.out.println("===== check =====");
                product.calculateCost();

                break;
            case 2:
                product = new iPhone();
                product.getUserSelection(scanner);
                System.out.println("===== check =====");
                product.calculateCost();
                break;
            case 3:
                product = new AirPods();
                product.getUserSelection(scanner);
                System.out.println("===== check =====");
                product.calculateCost();
                break;
            default:
                break;
        }
    }
    public static boolean keep(Scanner scanner){
        System.out.print(" Do you want to purchase something else (Yes: 1, No: 0): ");
        int answer = scanner.nextInt();
        return answer == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome Apple Korea ===");
        boolean welcome = true;

        while(welcome){
            int choice = question(scanner);
            process(choice, scanner);

            welcome = keep(scanner);
        }

        System.out.println("Thank you for your purchase!");
    }
}

