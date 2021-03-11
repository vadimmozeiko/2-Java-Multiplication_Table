package nd;

import java.util.Scanner;

public class ND {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Multiplication Table -------");
        System.out.println();
        System.out.println("You can printout multiplication table any range");
        System.out.println();
        System.out.println("Enter the number to start from:");
        System.out.println();
        int input1 = sc.nextInt();
        System.out.println();
        System.out.println("Enter the number to finish with:");
        System.out.println();
        int input2 = sc.nextInt();
        System.out.println();

        int num1 = input1;
        int num2 = input2;

        if (input1 > input2) {
            num1 = input2;
            num2 = input1;
        }

        if (num1 < 0 || num2 < 0) {
            System.out.println("Both number must be positive");
        } else {
            System.out.println("Multiplication Table from " + num1 + " to " + num2);
            System.out.println();
            System.out.println();
            System.out.print(" *");

            int count = num1;

            while (count <= num2) {
                System.out.print("\t" + "(" + count + ")");
                count++;
            }

            System.out.println();
            System.out.println();

            int from = num1;
            while (from <= num2) {

                System.out.print("(" + from + ")" + "\t");
                int multiplier = num1;

                while (multiplier <= num2) {
                    int multi = from * multiplier;
                    System.out.print(multi + "\t");
                    multiplier++;
                }

                System.out.println();
                from++;
            }
        }
        System.out.println();
    }

}
