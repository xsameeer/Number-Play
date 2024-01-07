/*****************************************************************************************
*Program name: Number Play
*
*Program Description: This project determines if a 6 digit number, when all digits are added together, 
is modularly divisible by 11.
--------------------------------------------------------------------------------------------
*Name: Sameer Ali 
*Version date: 02/01/2023
*CMSC 255 901
*/

public class NumberPlay {

  public static void main(String[] args) {

    java.util.Scanner input = new java.util.Scanner(System.in);

    int number, digitsAdded = 0;

    //Asking the user whether they would like to enter a number or randomly generate one
    System.out.println("Would you like to randomly generate a number (1) or enter it yourself (2)?");

    //This statement takes the input entered by the user to use in the if/else statement
    int choice = input.nextInt();

    //If the User selected 1, program will run through below in the first IF statement and have a random number generated to use in the program
    if (choice == 1) {

      //this statement generates a random number between 0.0 and 1.0 which is then multiplied by 1000000 and added with 100000 to make the generated number a 6 digit number
      number = (int) (Math.random() * 1000000 + 100000);

      //This statement prints out the randomly generated 6 digit number to the User
      System.out.println(number);

      //If User selected 2, program will run through the ELSE IF statement below and will be asked to enter a 6 digit number to use in the program
    } else if (choice == 2) {

      //Statement is asking the User to enter a 6 digit number
      System.out.println("Enter a 6-digit number");

      //This statement takes the input from the User and stores it in the variable number
      number = input.nextInt();

      //This IF statement makes sure the number is a 6 digit number, in the event that number is not between 100000 and 999999, program will output "incorrect input" and exits
      if (number < 100000 || number > 999999) {
        System.out.println("Incorrect input");
        return;
      }

      //This ELSE statement will print "Incorrect Input" to the console in the event that the User did not enter a choice between 1 and 2 at the start of the program and exits
    } else {
      System.out.println("Incorrect input");
      return;
    }

    //This statement also stores the value of number in the new initialized variable temp
    int temp = number;

    // This is a while statement that helps us add the 6 digits of a number, (temp>0) is explained further on the 53rd line
    while (temp > 0) {

      //This statement finds the remainder of the number(temp) using the percentage operator and storing it/adding it to the variable digitsAdded
      digitsAdded += temp % 10;

      //This statement divides the number(temp) by 10 in order to remove the last digit and store the remaining digits in temp. This process will repeat until temp is 0 and then move on
      temp /= 10;
    }

    /* To wrap things up, this IF statement completes the purpose of this program. 
     *It checks if the variable digitsAdded (which is the sum of the digits) is divisible by 11 by using the % operator
     *Specifically, it is told if the remainder of digitsAdded divided by 11 is 0, then print out "it is divisible to the user"
    */
    if (digitsAdded % 11 == 0) {
      System.out.println(number + " is divisible by 11");

      //likewise, in the event that the remainder of digitsAdded divided by 11 is not 0, then this else statement is used and it will print out "it is not divisible by 11"
    } else {
      System.out.println(number + " is not divisible by 11");
    }
  }
}
