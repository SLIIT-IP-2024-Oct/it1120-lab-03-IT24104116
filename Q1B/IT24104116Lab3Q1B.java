import java.util.Scanner;

public class IT24104116Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKgs = scanner.nextDouble();

        double totalAmount = pricePerKg * numberOfKgs;
        double discount = totalAmount * 0.10;
        double amountToPay = totalAmount - discount;

        System.out.printf("The amount you have to pay after discount is: %.2f%n", amountToPay);
        
        scanner.close();
    }
}
