package com.edu.less05.homework;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое
 * целое положительное число. А программа суммирует 
 * все числа от 1 до введенного пользователем числа.
 */
public class TaskCycles06 {

	public static void main(String[] args) {
		int number = -1;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		while (number == -1) {
			System.out.print("Введите положительно число: ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				scanner.nextLine();
				if (number <= 0) {
					number = -1;
					System.out.println("Число должно быть >0");
				}
			} else {
				scanner.nextLine();
				System.out.println("Было введено не число");
			}
		}

		for (int i = 1; i <= number; i++) {
			sum += i;
		}

		System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
		scanner.close();
	}

}
