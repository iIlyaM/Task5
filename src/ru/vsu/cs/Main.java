package ru.vsu.cs;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int s = readValuesOfTheseParameters("S");
        checkValue(s);
        printAFigure(s);
    }

    private static int readValuesOfTheseParameters(String name)
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter your value of  %s: ", name);
        return scan.nextInt();
    }

    private static int checkValue(int s)
    {
        if(s >= 1)
        {
            System.out.println("The entered parameters are correct. The program starts.");
        }
        else
        {
            System.out.println("Sorry, the value of s cannot be less than 1. Please, try again");
        }
        return s;
    }

    private static int printAFigure(int s) {
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else if (j > i & j != s & i != 1) {
                    System.out.print("$");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        return s;
    }
}
