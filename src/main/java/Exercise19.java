/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args){
        System.out.print("Please enter your weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextFloat();
        System.out.print("Please enter your height in inches: ");
        double height = input.nextFloat();

        double bmi = (703*weight)/(height*height);

        System.out.println("Your BMI is: "+bmi);

        if(bmi < 18.5) {
            System.out.println("You are underweight. Please consult a doctor.");
            }
        else if (bmi < 25) {
            System.out.println("You are normal.");
            }
        else if (bmi < 30) {
            System.out.println("You are overweight. Please consult a doctor.");
            }
        else {
            System.out.println("You are obese. Please consult a doctor.");
            }
        }
    }