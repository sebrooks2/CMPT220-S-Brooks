  /**
   * file: Problem2_1.java
   * author: Sha-Asia Brooks
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.0
   * 
   * This file contains my solution to Problem 2.1
   * from INTRODUCTION TO JAVA PROGRAMMING.
   */
import java.util.Scanner;

public class Problem2_1 {
  //This code converts an inputted celsius value to farhenheit.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("ENTER YOUR VALUE FOR CELSIUS: ");
    double celsius = input.nextDouble();

    double fahrenheit = (9.0 / 5) * celsius + 32;

    System.out.println(celsius + " degrees celsius is equivalent to " 
      + fahrenheit + " degress fahrenheit!");
  }
}