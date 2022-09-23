import java.util.Scanner;

public class L08_DealershipProject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership Application.");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                scan.nextLine();

                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available");

                    System.out.println("\nDo you have an insurance? Write 'yes' or 'no'");
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();

                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equalsIgnoreCase("yes") && license.equalsIgnoreCase("yes") && creditScore > 660) {
                        System.out.println("Sold! Pleasure doing business with you");
                    } else {
                        System.out.println("We're sorry. You are not eligible");
                    }
                } else {
                    System.out.println("\nWe don't sell cars under $10,000. Sorry");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();

                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we're not interested!");
                }
                break;
            default: System.out.println("\nInvalid option");
        }
  
        scan.close();
    }
}