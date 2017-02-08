  /**
   * file: Problem2_5.java
   * author: Sha-Asia Brooks
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.0
   * 
   * This file contains my solution to Problem 2.5
   * from INTRODUCTION TO JAVA PROGRAMMING.
   */

import java.util.Scanner;

public class Problem2_5 {
  //This code uses the subtotal and gratuity rate to calculate
  //gratuity and total.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("ENTER YOUR SUBTOTAL: ");
    double subtotal = input.nextDouble();

    System.out.print("ENTER YOUR GRATUITY RATE: ");
    double rate = input.nextDouble();

    double gratuity = (rate * 0.01) * subtotal;
    double total = subtotal + gratuity;

    System.out.print("Your gratuity is $" + gratuity + 
      " and your total is $" + total + "!");
      
  }
}