package java_programs;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");

		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = input.next().charAt(0);
		input.close();
		double result;
		//switch statement to check operator and perform calculation
		switch(operator)
		{
		case '+':
		result = num1 + num2;
		break;
		case '-':
		result = num1 - num2;
		break;
		case '*':
		result = num1 * num2;
		break;
		case '/':
		result = num1 / num2;
		break;
				
		default:
		System.out.printf("Error! operator is not correct");
		return;
		}
		//result of  calculation to the user
		System.out.printf("%.2f %c %.2f = %.2f \n", num1, operator, num2, result);
		}
}
