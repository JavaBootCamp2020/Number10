import java.util.Scanner;

// Author: Gil Silva
//Java Boot Camp assignment
//An application that tells if a number is positive or negative
// and compares if the number is equal, greater or lesser than 10.

public class Complete {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number = 10;

        double input;

        System.out.println("Enter a number (integer): ");
        input = sc.nextInt();

        if (input == 10 && input > 0){
            System.out.println("You've enter the number 10.");
            System.out.println("Number is positive.");

        } else if (input > 10 && input > 0){
            System.out.println("you entered a number greater than 10.");
            System.out.println("Number is positive.");
        } else if (input < 10 && input > 0){
            System.out.println("you entered a number lesser than 10.");
            System.out.println("Number is positive.");
        } else{
            System.out.println("The number is less than 10.");
            System.out.println("Number is not positive.");
        }

        System.out.println("Application finished.");
    }
}
