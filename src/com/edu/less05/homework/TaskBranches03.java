package com.edu.less05.homework;

import java.util.Scanner;

/*
 * Составить программу сравнения введенного числа а и цифры 3.
 * Вывести на экран слово «yes», если число а меньше 3;
 * если больше, то вывести слово «no».
 */
public class TaskBranches03 {

	public static void main(String[] args) {
		int a;
		int b = 3;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Введите число: ");
			if (scanner.hasNextInt()) {
				a = scanner.nextInt();
				break;
			} else {
				scanner.nextLine();
			}
		}

		if (a < b) {
			System.out.println("yes");
		} else if (a > b) {
			System.out.println("no");
		}
		scanner.close();

	}

}
