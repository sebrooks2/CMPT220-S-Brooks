  /**
   * file: Problem2_6.java
   * author: Sha-Asia Brooks
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.0
   * 
   * This file contains my solution to Problem 2.6
   * from INTRODUCTION TO JAVA PROGRAMMING.
   */

import java.util.Scanner;

public class Problem2_6 {
  //This code reads and integer between 0 and 1000 and adds all 
  //the digits in the integer
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("ENTER A NUMBER BETWEEN 0 AND 1000: ");
    int number = input.nextInt();
    
    //Extracting digits from the integer 
    int number1 = number % 10;
    int number2 = (number / 10) % 10;
    int number3 = number / 100;

    //Adding the extracted digits
    int sum = number1 + number2 + number3;

    System.out.print("The sum of the digits is " + sum +"!");
      
  }
}