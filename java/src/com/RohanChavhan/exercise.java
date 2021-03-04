package com.RohanChavhan;

import java.util.Scanner;
public class exercise
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the marks of Subject:");
        int a = s.nextInt();
        System.out.println("first Subject Marks: " + a);
        int b =s.nextInt();
        System.out.println(" Second Subject Marks:" + b);
        int c =s.nextInt();
        System.out.println("Third  Subject Marks:"+ c);
        int d =s.nextInt();
        System.out.println("Fourth Subject Marks:"+ d );
        int e =s.nextInt();
        System.out.println(" Fifth Subject Marks"+ e);

        int sum = a + b + c +d +e;
        System.out.println(sum);
        int average = (sum / 5) ;
        System.out.println("Average percentage mar is " + average);

    }
}
