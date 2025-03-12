package com.edu.less05.homework;

import java.util.Scanner;

/*
 * Составить программу: равны ли два числа а и b?
 */
public class TaskBranches04 {
	private static int countNumber = 1;		//счетчик номера вводимого числа

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);

		a = enterNumber(scanner);
		b = enterNumber(scanner);

		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a==b ---> " + (a == b));

	}

	public static int enterNumber(Scanner scanner) {
		int number;
		while (true) {
			System.out.println("введите число №" + countNumber + ": ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				scanner.nextLine();
				countNumber++;
				break;
			} else {
				scanner.nextLine();
				System.out.println("было введено не число");
			}
		}
		return number;
	}
}
