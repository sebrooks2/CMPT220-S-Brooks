  /**
   * file: Problem1_3.java
   * author: Sha-Asia Brooks
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.0
   * 
   * This file contains my solution to the seconde problem in
   * the Lab 1 packet.
   */

import java.util.Scanner;

public class Finalgrade {
  //This code calculates a students final grade.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the following as percentage . . .  "
      + System.lineSeparator() + "MIDTERM EXAM: ");

    //System.out.print("MIDTERM EXAM: ");
    double midterm = input.nextDouble();

    System.out.print("FINAL EXAM: ");
    double finals = input.nextDouble();

    System.out.print("PROJECTS: ");
    double project = input.nextDouble();

    System.out.print("HOMEWORK AND LABS: ");
    double homeworklabs = input.nextDouble();

    double grade = ((midterm * 0.2) + (finals * 0.2) + 
      (project * 0.20) + (homeworklabs * 0.4));

    System.out.print("Your final grade is " + grade + "% !");   
  }
}