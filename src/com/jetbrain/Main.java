package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double num1,num2,num3;
	Scanner UserInput=new Scanner(System.in);

	//Asking the user to input 3 numbers.
        System.out.println("Please enter 3 numbers.");
        System.out.print("1st Number: ");
        num1=UserInput.nextDouble();
        System.out.print("2nd Number: ");
        num2=UserInput.nextDouble();
        System.out.print("3rd Number: ");
        num3=UserInput.nextDouble();
        System.out.println();

    //Checking which number is the highest.
        if (num1>num2)
            {
                if (num1>num3)
                    System.out.println("The highest number is "+num1+".");
                else
                    System.out.println("The highest number is "+num3+".");
            }
        else
            {
                if (num2>num3)
                    System.out.println("The highest number is "+num2+".");
                else
                    System.out.println("The highest number is "+num3+".");
            }
    }
}
