package newPackage;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passsword = "enigma";



        int attempts = 3;

        while (attempts-- != 0) {

            System.out.print("Enter your password: ");

            String userPassword = scanner.nextLine();

            if (passsword.equals(userPassword)) {
                System.out.println("Correct password");
                break;
            } else {
                System.out.print("Entered password is incorrect try again: " + attempts + " Attempts left.\n");


                if (attempts == 0){
                    System.out.println("You attempts 3 times");
                    System.out.println("Try for 15 minutes");
                }
            }

        }
    }
}
