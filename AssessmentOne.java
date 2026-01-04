package Learn;

import java.util.Scanner;

public class AssessmentOne {

    protected boolean validateAge(int age) {
        return age > 18 && age < 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AssessmentOne obj = new AssessmentOne();

        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        int age;
        while (true) {
            System.out.print("Enter Age: ");
            String input = sc.nextLine();

            try {
                age = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers only.");
            }
        }

        if (obj.validateAge(age)) {
            System.out.println("Hi " + name + " (" + age + "), Welcome to zuzububu club.");
        } else {
            System.out.println("Sorry " + name + ", Your age (" + age + ") is not legal for zuzububu club.");
        }

        sc.close();
    }
}
