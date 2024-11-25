package Main;

import java.util.Scanner;
import java.util.Arrays;

public class Ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < size; i ++) {
            sum += arr[i];
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Average value is: " + (sum / size));


        scanner.close();
    }
}
