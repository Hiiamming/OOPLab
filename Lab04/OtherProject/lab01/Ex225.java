package Main;
import java.util.Scanner;

public class Ex225 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Sum is " + (num1 + num2));
        if (num1 >= num2) {
            System.out.println("Difference is " + (num1 - num2)); 
        }
        else {
            System.out.println("Difference is " + (num2 - num1)); 
        }
        System.out.println("Product is " +(num1 * num2));
        if (num2 == 0) {
            System.out.println("Cannot divide by 0");
        }
        else {
            System.out.println("Division is " + (num1 / num2));
        }
        scanner.close();
        
	}

}