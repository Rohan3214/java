package com.RohanChavhan;
import java.util.Scanner;
public class Practice_set1
{
    public static void main(String[] args) {
/*       int a =45;
        int b =7;
        int c =6;
        int sum =a + b +c;
        System.out.println(sum);*/


// calculate cgpa out of 100
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float sum = (subject1 + subject2 + subject3) / 30;
        System.out.println(sum);


// write the program which asks the user to enter his/her
// name and gives them with "hello have a good day
        System.out.println("What is your name");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        System.out.println("hello" + " " + a + " " + " have a good day");


// write a java program to convert kilometers into miles
        System.out.println("Enter your Kilometer : ");
        Scanner km = new Scanner(System.in);
        double km1 =s.nextFloat();
        double mls = km1 * 0.621371;
        System.out.println("Your miles will be " + mls);

// write a java program to detect enter  a number
// enter  by the user is integer or not

        System.out.println("Enter your number ");
        Scanner number1  = new Scanner(System.in);
        System.out.println(number1.hasNextInt());


    }
}
