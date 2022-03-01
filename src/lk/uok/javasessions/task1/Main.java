package lk.uok.javasessions.task1;

import java.util.Scanner;



public class Main {

    //perform Addition
    public static double getSum(double a, double b){

        double sum = a + b;
        return sum;
    }

    //perform subtraction
    public static double getDiff(double a, double b){

        double diff = a - b;
        return diff;
    }

    //perform multiplication
    public static double getMulti(double a, double b){

        double multi = a * b;
        return multi;
    }

    //perform division
    public static double getDiv(double a, double b){

        double div = a / b;
        return div;
    }

    public static void main(String[] args) {

        int operator;
        double num1, num2, answer = 0;

        System.out.println("WELCOME!");
        System.out.println();

        //ask users to enter operator.

        System.out.println("What operation do you want?");

        System.out.println("+-------------------------------+");
        System.out.println("| Enter 1 for summation\t\t\t|\n| Enter 2 for differance\t\t|\n| Enter 3 for multiplication\t|\n| Enter 4 for division\t\t\t|");
        System.out.println("+-------------------------------+");
        System.out.print("Please enter your option:  ");

        Scanner input = new Scanner(System.in);
        operator = input.nextInt();

        //ask users to enter numbers.

        System.out.print("Enter your first number:  ");
        num1 = input.nextDouble();

        System.out.print("Enter your second number:  ");
        num2 = input.nextDouble();

        switch (operator){

            case 1:
                answer = getSum(num1, num2);
                break;
            case 2:
                answer = getDiff(num1, num2);
                break;
            case 3:
                answer = getMulti(num1, num2);
                break;
            case 4:
                answer = getDiv(num1, num2);
                break;
            default:
                System.out.println("Invalid option!");

        }

        //display the answer
        System.out.println("Answer is "+answer);

    }
}
