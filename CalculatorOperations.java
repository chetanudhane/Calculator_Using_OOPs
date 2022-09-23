package prctice_problem;

import java.util.Scanner;

public class CalculatorOperations implements Operation {
	CalculatorData calculatorData = new CalculatorData();
	Scanner sc = new Scanner(System.in);

	public void checkOperationType() {
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
		System.out.println("Choose Operation...");
		int op = sc.nextInt();

		switch (op) {
		case 1:
			addition();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			multiplication();
			break;
		case 4:
			division();
			break;

		default:
			System.out.println("Enter Valid Operation Number...");
		}
	}

	@Override
	public void addition() {
		System.out.println("Enter Two Numbers");
		calculatorData.setNumber1(sc.nextInt());
		calculatorData.setNumber2(sc.nextInt());
		double result = calculatorData.getNumber1() + calculatorData.getNumber2();
		System.out.println("Addition of Two Numbers Is : " + result);

	}

	@Override
	public void subtraction() {
		System.out.println("Enter Two Numbers");
		calculatorData.setNumber1(sc.nextInt());
		calculatorData.setNumber2(sc.nextInt());
		double result = calculatorData.getNumber1() - calculatorData.getNumber2();
		System.out.println("Subtraction of Two Numbers Is : " + result);
	}

	@Override
	public void multiplication() {
		System.out.println("Enter Two Numbers");
		calculatorData.setNumber1(sc.nextInt());
		calculatorData.setNumber2(sc.nextInt());
		double result = calculatorData.getNumber1() * calculatorData.getNumber2();
		System.out.println("Multiplication of Two Numbers Is : " + result);
	}

	@Override
	public void division() {
		System.out.println("Enter Two Numbers");
		calculatorData.setNumber1(sc.nextInt());
		calculatorData.setNumber2(sc.nextInt());
		double result = calculatorData.getNumber1() / calculatorData.getNumber2();
		System.out.println("Division of Two Numbers Is : " + result);
	}

}
