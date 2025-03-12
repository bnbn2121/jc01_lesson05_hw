package com.edu.less05.homework;

import java.util.Scanner;

/*
 * Составить программу, которая определит по трем введенным сторонам,
 * является ли данный треугольник равносторонним.
 */
public class TaskBranches09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle triangle = new Triangle();
		triangle.side1 = triangle.enterNumber(scanner, 1);
		triangle.side2 = triangle.enterNumber(scanner, 2);
		triangle.side3 = triangle.enterNumber(scanner, 3);
		triangle.checkEquilateral();
		scanner.close();
	}
	
	static class Triangle {
		int side1;
		int side2;
		int side3;

		public int enterNumber(Scanner scanner, int countSide) {
			int number;
			while (true) {
				System.out.print("введите сторону треугольника №" + countSide + ": ");
				if (scanner.hasNextInt()) {
					number = scanner.nextInt();
					scanner.nextLine();
					if (number > 0) {
						System.out.println("принято");
						break;
					} else {
						System.out.println("сторона треугольника должна быть >0");
					}
				} else {
					scanner.nextLine();
					System.out.println("было введено не число");
				}
			}
			return number;
		}

		public void checkEquilateral() {
			System.out.printf("стороны треугольника равны: %d %d %d%n", side1, side2, side3);
			System.out.print("Результат: ");
			if (side1 == side2 && side2 == side3) {
				System.out.println("треугольник равносторонний");
			} else {
				System.out.println("треугольник не равносторонний");
			}
		}
	}

}
